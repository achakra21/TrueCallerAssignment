package com.abhijit.truecaller_assingment.ui.mainui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/abhijit/truecaller_assingment/ui/mainui/MainActivityModule;", "", "()V", "provideMainViewModel", "Lcom/abhijit/truecaller_assingment/ui/mainui/MainActivityModel;", "dataManager", "Lcom/abhijit/truecaller_assingment/data/DataManager;", "schedulerProvider", "Lcom/abhijit/truecaller_assingment/util/rx/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "provideMainViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "mainViewModel", "app_debug"})
@dagger.Module()
public final class MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.abhijit.truecaller_assingment.ui.mainui.MainActivityModel provideMainViewModel(@org.jetbrains.annotations.NotNull()
    com.abhijit.truecaller_assingment.data.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    com.abhijit.truecaller_assingment.util.rx.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.arch.lifecycle.ViewModelProvider.Factory provideMainViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.abhijit.truecaller_assingment.ui.mainui.MainActivityModel mainViewModel) {
        return null;
    }
    
    public MainActivityModule() {
        super();
    }
}