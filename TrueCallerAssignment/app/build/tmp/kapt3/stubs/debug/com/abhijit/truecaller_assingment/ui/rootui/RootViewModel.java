package com.abhijit.truecaller_assingment.ui.rootui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0019\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\u0004J\r\u0010\u001b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0006J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020!J\u0013\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00028\u0000\u00a2\u0006\u0002\u0010$R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lcom/abhijit/truecaller_assingment/ui/rootui/RootViewModel;", "N", "Landroid/arch/lifecycle/ViewModel;", "theDataManager", "Lcom/abhijit/truecaller_assingment/data/DataManager;", "theSchedulerProvider", "Lcom/abhijit/truecaller_assingment/util/rx/SchedulerProvider;", "theCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/abhijit/truecaller_assingment/data/DataManager;Lcom/abhijit/truecaller_assingment/util/rx/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "isLoading", "Landroid/databinding/ObservableBoolean;", "()Landroid/databinding/ObservableBoolean;", "mNavigator", "Ljava/lang/ref/WeakReference;", "getMNavigator", "()Ljava/lang/ref/WeakReference;", "setMNavigator", "(Ljava/lang/ref/WeakReference;)V", "getTheCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getTheDataManager", "()Lcom/abhijit/truecaller_assingment/data/DataManager;", "getTheSchedulerProvider", "()Lcom/abhijit/truecaller_assingment/util/rx/SchedulerProvider;", "getCompositeDisposable", "getDataManager", "getNavigator", "()Ljava/lang/Object;", "getSchedulerProvider", "onCleared", "", "setIsLoading", "", "setNavigator", "nav", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class RootViewModel<N extends java.lang.Object> extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean isLoading = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.ref.WeakReference<N> mNavigator;
    @org.jetbrains.annotations.NotNull()
    private final com.abhijit.truecaller_assingment.data.DataManager theDataManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.abhijit.truecaller_assingment.util.rx.SchedulerProvider theSchedulerProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable theCompositeDisposable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.ref.WeakReference<N> getMNavigator() {
        return null;
    }
    
    public final void setMNavigator(@org.jetbrains.annotations.Nullable()
    java.lang.ref.WeakReference<N> p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void setIsLoading(boolean isLoading) {
    }
    
    public final void setNavigator(N nav) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.abhijit.truecaller_assingment.util.rx.SchedulerProvider getSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.abhijit.truecaller_assingment.data.DataManager getDataManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final N getNavigator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.abhijit.truecaller_assingment.data.DataManager getTheDataManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.abhijit.truecaller_assingment.util.rx.SchedulerProvider getTheSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getTheCompositeDisposable() {
        return null;
    }
    
    public RootViewModel(@org.jetbrains.annotations.NotNull()
    com.abhijit.truecaller_assingment.data.DataManager theDataManager, @org.jetbrains.annotations.NotNull()
    com.abhijit.truecaller_assingment.util.rx.SchedulerProvider theSchedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable theCompositeDisposable) {
        super();
    }
}