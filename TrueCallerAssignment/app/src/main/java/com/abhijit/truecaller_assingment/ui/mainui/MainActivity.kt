package com.abhijit.truecaller_assingment.ui.mainui

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.abhijit.truecaller_assingment.R
import com.abhijit.truecaller_assingment.BR
import com.abhijit.truecaller_assingment.databinding.ActivityMainBinding
import com.abhijit.truecaller_assingment.ui.rootui.RootActivity
import javax.inject.Inject

class MainActivity : RootActivity<ActivityMainBinding, MainActivityModel>(), MainActivityNavigator {

    @Inject
    lateinit var mViewModelFactory: ViewModelProvider.Factory

    private var mMainActivityModel: MainActivityModel? = null

    private var mActivityMainBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainActivityModel?.setNavigator(this)
        mActivityMainBinding = getViewDataBinding()

    }


    override fun getViewModel(): MainActivityModel {
        mMainActivityModel = ViewModelProviders.of(this, mViewModelFactory).get(MainActivityModel::class.java)
        return mMainActivityModel as MainActivityModel
    }

    override fun getBindingVariable() = BR.viewModel

    override fun getLayoutId() = R.layout.activity_main


    override fun errorOccured(throwable: Throwable) {

    }

}