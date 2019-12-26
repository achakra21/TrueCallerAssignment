package com.abhijit.truecaller_assingment.di.modules

import android.app.Application
import android.content.Context
import com.abhijit.truecaller_assingment.data.DataManager
import com.abhijit.truecaller_assingment.data.DataManagerImplementation
import com.abhijit.truecaller_assingment.data.remote.ApiDataHelper
import com.abhijit.truecaller_assingment.data.remote.ApiDataHelperImplementation
import com.abhijit.truecaller_assingment.util.rx.SchedulerProvider
import com.abhijit.truecaller_assingment.util.rx.SchedulerProviderImplementation
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun dataManagerProvider(appDataManager: DataManagerImplementation): DataManager = appDataManager

    @Singleton
    @Provides
    fun scheduleProvider(): SchedulerProvider = SchedulerProviderImplementation()

    @Singleton
    @Provides
    fun apiDataHelperProvider(retrofit: Retrofit): ApiDataHelper = ApiDataHelperImplementation(retrofit)

    @Singleton
    @Provides
    fun contextProvider(app: Application): Context = app.baseContext

    @Singleton
    @Provides
    fun compositeDisposableProvider() = CompositeDisposable()
}