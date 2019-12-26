package com.abhijit.truecaller_assingment.ui.rootui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH\'J\u000b\u0010\u000f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002R\u0010\u0010\b\u001a\u00028\u0000X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00028\u0001X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/abhijit/truecaller_assingment/ui/rootui/RootActivity;", "T", "Landroid/databinding/ViewDataBinding;", "V", "Lcom/abhijit/truecaller_assingment/ui/rootui/RootViewModel;", "Lcom/abhijit/truecaller_assingment/ui/rootui/RootNavigator;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "mViewDataBinding", "Landroid/databinding/ViewDataBinding;", "mViewModel", "Lcom/abhijit/truecaller_assingment/ui/rootui/RootViewModel;", "getBindingVariable", "", "getLayoutId", "getViewDataBinding", "()Landroid/databinding/ViewDataBinding;", "getViewModel", "()Lcom/abhijit/truecaller_assingment/ui/rootui/RootViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "performDataBinding", "performDependencyInjection", "app_debug"})
public abstract class RootActivity<T extends android.databinding.ViewDataBinding, V extends com.abhijit.truecaller_assingment.ui.rootui.RootViewModel<? extends com.abhijit.truecaller_assingment.ui.rootui.RootNavigator>> extends android.support.v7.app.AppCompatActivity {
    private T mViewDataBinding;
    private V mViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void performDataBinding() {
    }
    
    private final void performDependencyInjection() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getViewDataBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract V getViewModel();
    
    public abstract int getBindingVariable();
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    public RootActivity() {
        super();
    }
}