package com.abhijit.truecaller_assingment.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/abhijit/truecaller_assingment/di/modules/AppModule;", "", "()V", "apiDataHelperProvider", "Lcom/abhijit/truecaller_assingment/data/remote/ApiDataHelper;", "retrofit", "Lretrofit2/Retrofit;", "compositeDisposableProvider", "Lio/reactivex/disposables/CompositeDisposable;", "contextProvider", "Landroid/content/Context;", "app", "Landroid/app/Application;", "dataManagerProvider", "Lcom/abhijit/truecaller_assingment/data/DataManager;", "appDataManager", "Lcom/abhijit/truecaller_assingment/data/DataManagerImplementation;", "scheduleProvider", "Lcom/abhijit/truecaller_assingment/util/rx/SchedulerProvider;", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.abhijit.truecaller_assingment.data.DataManager dataManagerProvider(@org.jetbrains.annotations.NotNull()
    com.abhijit.truecaller_assingment.data.DataManagerImplementation appDataManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.abhijit.truecaller_assingment.util.rx.SchedulerProvider scheduleProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.abhijit.truecaller_assingment.data.remote.ApiDataHelper apiDataHelperProvider(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.Context contextProvider(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final io.reactivex.disposables.CompositeDisposable compositeDisposableProvider() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}