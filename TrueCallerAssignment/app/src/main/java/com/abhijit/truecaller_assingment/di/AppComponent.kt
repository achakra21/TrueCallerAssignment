package com.abhijit.truecaller_assingment.di

import android.app.Application
import com.abhijit.truecaller_assingment.TrueCallerAssingment
import com.abhijit.truecaller_assingment.di.modules.AppModule
import com.abhijit.truecaller_assingment.di.modules.BuildersModule
import com.abhijit.truecaller_assingment.di.modules.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class, BuildersModule::class, AndroidSupportInjectionModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder
    {
        @BindsInstance
        fun application(application: Application) : Builder
        fun build() : AppComponent
    }

    fun inject(app: TrueCallerAssingment)
}