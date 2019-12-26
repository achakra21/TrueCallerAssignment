package com.abhijit.truecaller_assingment.ui.mainui

import android.databinding.ObservableField
import com.abhijit.truecaller_assingment.data.DataManager
import com.abhijit.truecaller_assingment.ui.rootui.RootViewModel
import com.abhijit.truecaller_assingment.util.rx.SchedulerProvider
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observables.GroupedObservable
import io.reactivex.subjects.ReplaySubject
import java.util.concurrent.TimeUnit
import java.util.regex.Pattern

class MainActivityModel(dataManager: DataManager, schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable) : RootViewModel<MainActivityNavigator>(dataManager, schedulerProvider, compositeDisposable) {
    var tc10thCharacterRequestAnswer = ObservableField<String>()
    var tcevery10thCharacterRequestAnswer = ObservableField<String>()
    var tcWordCounterRequestAnswer = ObservableField<String>()

    var requestsCount = ObservableField<Int>()

    var textViewRefreshingFrequency = ObservableField<String>()

    init {

        requestsCount.set(-1)
        textViewRefreshingFrequency.set("1")
    }

    fun getBlogPage() {
        requestsCount.set(0)

        tc10thCharacterRequestAnswer.set("")
        tcevery10thCharacterRequestAnswer.set("")
        tcWordCounterRequestAnswer.set("")

        val listOfChars = ReplaySubject.create<Char>()
        val apiResponse = getDataManager().getBlogPostResponse()

        apiResponse
                .map {
                    it.toList()
                }
                .toObservable()
                .flatMap {
                    Observable.fromIterable<Char>(it)
                }
                .subscribeOn(getSchedulerProvider().io())
                .subscribe(listOfChars)


        val listOf10thChars = listOfChars
                .skip(9)
//                .window(10,1)
                .buffer(1, 10)

        getCompositeDisposable().add(listOf10thChars
                .firstElement()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe({
                    tc10thCharacterRequestAnswer.set(it[0].toString())
                    requestsCount.set(requestsCount.get()?.plus(1))
                }, {
                    tc10thCharacterRequestAnswer.set("error occured!")
                    requestsCount.set(requestsCount.get()?.plus(1))
                }))

        getCompositeDisposable().add(listOf10thChars

                .toList()
                .map {
                    var sb = StringBuilder()
                    it.forEach {
                        sb.append(it[0].toString())
                    }
                    sb.toString()
                }

                .toObservable()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe({
                    tcevery10thCharacterRequestAnswer.set(it)
                }, {
                    tcevery10thCharacterRequestAnswer.set("error occurred!")
                    requestsCount.set(requestsCount.get()?.plus(1))
                }, {
                    requestsCount.set(requestsCount.get()?.plus(1))
                }))

        getCompositeDisposable().add(apiResponse
                .map {
                    it.split(Pattern.compile("\\s+"))
                }
                .toObservable()
                .flatMap {
                    Observable.fromIterable<String>(it)
                }
                .groupBy { it }
                .flatMap { groupObservableOfKeyword: GroupedObservable<String, String> ->
                    groupObservableOfKeyword.map {
                        Pair(groupObservableOfKeyword.key, 1)
                    }
                            .reduce { t1: Pair<String?, Int>, t2: Pair<String?, Int> ->
                                Pair(t1.first, t1.second + t2.second)
                            }
                            .toObservable()
                }
                .buffer(textViewRefreshingFrequency.get()?.toLongOrNull() ?: 1, TimeUnit.SECONDS)
                .map {
                    val sb = StringBuilder()
                    it.forEach {
                        sb.append(it.first + " = " + it.second + "\n")
                    }
                    sb.toString()
                }
                .scan { x, y -> x + y }
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe({
                    tcWordCounterRequestAnswer.set(it)
                }, {
                    tcWordCounterRequestAnswer.set("error occurred!")
                    requestsCount.set(requestsCount.get()?.plus(1))
                }, {
                    requestsCount.set(requestsCount.get()?.plus(1))
                }
                )
        )
    }
}