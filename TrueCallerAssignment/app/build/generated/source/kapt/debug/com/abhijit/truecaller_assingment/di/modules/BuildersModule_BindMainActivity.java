package com.abhijit.truecaller_assingment.di.modules;

import android.app.Activity;
import com.abhijit.truecaller_assingment.ui.mainui.MainActivity;
import com.abhijit.truecaller_assingment.ui.mainui.MainActivityModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = BuildersModule_BindMainActivity.MainActivitySubcomponent.class)
public abstract class BuildersModule_BindMainActivity {
  private BuildersModule_BindMainActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent(modules = MainActivityModule.class)
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
