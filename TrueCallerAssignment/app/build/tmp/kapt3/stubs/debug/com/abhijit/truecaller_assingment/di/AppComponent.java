package com.abhijit.truecaller_assingment.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/abhijit/truecaller_assingment/di/AppComponent;", "", "inject", "", "app", "Lcom/abhijit/truecaller_assingment/TrueCallerAssingment;", "Builder", "app_debug"})
@dagger.Component(modules = {com.abhijit.truecaller_assingment.di.modules.AppModule.class, com.abhijit.truecaller_assingment.di.modules.NetworkModule.class, com.abhijit.truecaller_assingment.di.modules.BuildersModule.class, dagger.android.support.AndroidSupportInjectionModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.abhijit.truecaller_assingment.TrueCallerAssingment app);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/abhijit/truecaller_assingment/di/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/abhijit/truecaller_assingment/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.abhijit.truecaller_assingment.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.abhijit.truecaller_assingment.di.AppComponent build();
    }
}