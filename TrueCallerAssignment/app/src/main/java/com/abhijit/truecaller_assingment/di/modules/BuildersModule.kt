package com.abhijit.truecaller_assingment.di.modules

import com.abhijit.truecaller_assingment.ui.mainui.MainActivity
import com.abhijit.truecaller_assingment.ui.mainui.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule
{
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity() : MainActivity
}