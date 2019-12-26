package com.abhijit.truecaller_assingment.databinding;
import com.abhijit.truecaller_assingment.R;
import com.abhijit.truecaller_assingment.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 6);
        sViewsWithIds.put(R.id.tWordCounterRequestQuestion, 7);
    }
    // views
    @NonNull
    public final android.widget.Button butCallBlog;
    @NonNull
    public final android.support.v4.widget.ContentLoadingProgressBar loading;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    public final android.widget.ScrollView scrollView;
    @NonNull
    public final android.widget.TextView tWordCounterRequestQuestion;
    // variables
    @Nullable
    private com.abhijit.truecaller_assingment.ui.mainui.MainActivityModel mViewModel;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.butCallBlog = (android.widget.Button) bindings[1];
        this.butCallBlog.setTag(null);
        this.loading = (android.support.v4.widget.ContentLoadingProgressBar) bindings[2];
        this.loading.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.scrollView = (android.widget.ScrollView) bindings[6];
        this.tWordCounterRequestQuestion = (android.widget.TextView) bindings[7];
        setRootTag(root);
        // listeners
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.abhijit.truecaller_assingment.ui.mainui.MainActivityModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.abhijit.truecaller_assingment.ui.mainui.MainActivityModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.abhijit.truecaller_assingment.ui.mainui.MainActivityModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTcWordCounterRequestAnswer((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelTcevery10thCharacterRequestAnswer((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelTc10thCharacterRequestAnswer((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelRequestsCount((android.databinding.ObservableField<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTcWordCounterRequestAnswer(android.databinding.ObservableField<java.lang.String> ViewModelTcWordCounterRequestAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTcevery10thCharacterRequestAnswer(android.databinding.ObservableField<java.lang.String> ViewModelTcevery10thCharacterRequestAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTc10thCharacterRequestAnswer(android.databinding.ObservableField<java.lang.String> ViewModelTc10thCharacterRequestAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRequestsCount(android.databinding.ObservableField<java.lang.Integer> ViewModelRequestsCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelTcWordCounterRequestAnswerGet = null;
        boolean viewModelRequestsCountInt1 = false;
        boolean viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt2 = false;
        android.databinding.ObservableField<java.lang.String> viewModelTcWordCounterRequestAnswer = null;
        android.databinding.ObservableField<java.lang.String> viewModelTcevery10thCharacterRequestAnswer = null;
        int viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt2ViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelRequestsCountGet = null;
        int androidDatabindingViewDataBindingSafeUnboxViewModelRequestsCountGet = 0;
        android.databinding.ObservableField<java.lang.String> viewModelTc10thCharacterRequestAnswer = null;
        boolean ViewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt21 = false;
        java.lang.String viewModelTc10thCharacterRequestAnswerGet = null;
        boolean viewModelRequestsCountInt2 = false;
        boolean viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1 = false;
        android.databinding.ObservableField<java.lang.Integer> viewModelRequestsCount = null;
        java.lang.String viewModelTcevery10thCharacterRequestAnswerGet = null;
        boolean viewModelRequestsCountInt0 = false;
        com.abhijit.truecaller_assingment.ui.mainui.MainActivityModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.tcWordCounterRequestAnswer
                        viewModelTcWordCounterRequestAnswer = viewModel.getTcWordCounterRequestAnswer();
                    }
                    updateRegistration(0, viewModelTcWordCounterRequestAnswer);


                    if (viewModelTcWordCounterRequestAnswer != null) {
                        // read viewModel.tcWordCounterRequestAnswer.get()
                        viewModelTcWordCounterRequestAnswerGet = viewModelTcWordCounterRequestAnswer.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.tcevery10thCharacterRequestAnswer
                        viewModelTcevery10thCharacterRequestAnswer = viewModel.getTcevery10thCharacterRequestAnswer();
                    }
                    updateRegistration(1, viewModelTcevery10thCharacterRequestAnswer);


                    if (viewModelTcevery10thCharacterRequestAnswer != null) {
                        // read viewModel.tcevery10thCharacterRequestAnswer.get()
                        viewModelTcevery10thCharacterRequestAnswerGet = viewModelTcevery10thCharacterRequestAnswer.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.tc10thCharacterRequestAnswer
                        viewModelTc10thCharacterRequestAnswer = viewModel.getTc10thCharacterRequestAnswer();
                    }
                    updateRegistration(2, viewModelTc10thCharacterRequestAnswer);


                    if (viewModelTc10thCharacterRequestAnswer != null) {
                        // read viewModel.tc10thCharacterRequestAnswer.get()
                        viewModelTc10thCharacterRequestAnswerGet = viewModelTc10thCharacterRequestAnswer.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.requestsCount
                        viewModelRequestsCount = viewModel.getRequestsCount();
                    }
                    updateRegistration(3, viewModelRequestsCount);


                    if (viewModelRequestsCount != null) {
                        // read viewModel.requestsCount.get()
                        viewModelRequestsCountGet = viewModelRequestsCount.get();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get())
                    androidDatabindingViewDataBindingSafeUnboxViewModelRequestsCountGet = android.databinding.ViewDataBinding.safeUnbox(viewModelRequestsCountGet);


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0
                    viewModelRequestsCountInt0 = (androidDatabindingViewDataBindingSafeUnboxViewModelRequestsCountGet) == (0);
                if((dirtyFlags & 0x38L) != 0) {
                    if(viewModelRequestsCountInt0) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1
                viewModelRequestsCountInt1 = (androidDatabindingViewDataBindingSafeUnboxViewModelRequestsCountGet) == (1);
        }

        if ((dirtyFlags & 0x38L) != 0) {

                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1
                viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1 = ((viewModelRequestsCountInt0) ? (true) : (viewModelRequestsCountInt1));
            if((dirtyFlags & 0x38L) != 0) {
                if(viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 2
                viewModelRequestsCountInt2 = (androidDatabindingViewDataBindingSafeUnboxViewModelRequestsCountGet) == (2);
        }

        if ((dirtyFlags & 0x38L) != 0) {

                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 2
                ViewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt21 = ((viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1) ? (true) : (viewModelRequestsCountInt2));
            if((dirtyFlags & 0x38L) != 0) {
                if(ViewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt21) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read !android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 2
                viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt2 = !ViewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt21;
                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 2 ? View.VISIBLE : View.GONE
                viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt2ViewVISIBLEViewGONE = ((ViewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt21) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.butCallBlog.setEnabled(viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt2);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.butCallBlog, mCallback1, viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt2);
            this.loading.setVisibility(viewModelRequestsCountInt0BooleanTrueViewModelRequestsCountInt1BooleanTrueViewModelRequestsCountInt2ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelTc10thCharacterRequestAnswerGet);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelTcevery10thCharacterRequestAnswerGet);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelTcWordCounterRequestAnswerGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.abhijit.truecaller_assingment.ui.mainui.MainActivityModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.getBlogPage();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.abhijit.truecaller_assingment.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.abhijit.truecaller_assingment.R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.tcWordCounterRequestAnswer
        flag 1 (0x2L): viewModel.tcevery10thCharacterRequestAnswer
        flag 2 (0x3L): viewModel.tc10thCharacterRequestAnswer
        flag 3 (0x4L): viewModel.requestsCount
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 2 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 2 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 2
        flag 9 (0xaL): android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 2
        flag 10 (0xbL): android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1
        flag 11 (0xcL): android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 0 ? true : android.databinding.ViewDataBinding.safeUnbox(viewModel.requestsCount.get()) == 1
    flag mapping end*/
    //end
}