package com.abhijit.truecaller_assingment.ui.rootui

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection

abstract class RootActivity<T : ViewDataBinding, V : RootViewModel<out RootNavigator>>: AppCompatActivity() {

    private lateinit var mViewDataBinding: T
    private lateinit var mViewModel: V


    override fun onCreate(savedInstanceState: Bundle?) {
        performDependencyInjection()
        super.onCreate(savedInstanceState)
        performDataBinding()
    }


    private fun performDataBinding() {
        getViewModel()?.let {
            mViewModel = it
            mViewDataBinding = DataBindingUtil.setContentView(this, getLayoutId())
            mViewDataBinding.setVariable(getBindingVariable(), mViewModel)
            mViewDataBinding.executePendingBindings()
        }
    }

    private fun performDependencyInjection() {
        AndroidInjection.inject(this)
    }

    fun getViewDataBinding(): T = mViewDataBinding


    //Functions to be implemented by Activities
    abstract fun getViewModel(): V?

    abstract fun getBindingVariable(): Int
    @LayoutRes
    abstract fun getLayoutId(): Int
}