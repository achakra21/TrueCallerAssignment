package com.abhijit.truecaller_assingment.ui.rootui

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import com.abhijit.truecaller_assingment.data.DataManager
import com.abhijit.truecaller_assingment.util.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import java.lang.ref.WeakReference


abstract class RootViewModel<N>(val theDataManager: DataManager,
                                val theSchedulerProvider: SchedulerProvider, val theCompositeDisposable: CompositeDisposable) : ViewModel() {

    val isLoading = ObservableBoolean(false)

    var mNavigator: WeakReference<N> ? = null

    override fun onCleared() {
        theCompositeDisposable.dispose()
        super.onCleared()
    }

    fun setIsLoading(isLoading: Boolean) {
        this.isLoading.set(isLoading)
    }

    fun setNavigator(nav : N)
    {
        mNavigator = WeakReference(nav)
    }

    fun getCompositeDisposable() = theCompositeDisposable
    fun getSchedulerProvider() = theSchedulerProvider
    fun getDataManager() = theDataManager
    fun getNavigator() = mNavigator?.get()
}
