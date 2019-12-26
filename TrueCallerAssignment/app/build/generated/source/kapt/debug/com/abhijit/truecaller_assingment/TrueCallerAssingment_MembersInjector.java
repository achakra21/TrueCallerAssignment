// Generated by Dagger (https://google.github.io/dagger).
package com.abhijit.truecaller_assingment;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class TrueCallerAssingment_MembersInjector
    implements MembersInjector<TrueCallerAssingment> {
  private final Provider<DispatchingAndroidInjector<Activity>>
      activityDispatchingAndroidInjectorProvider;

  public TrueCallerAssingment_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> activityDispatchingAndroidInjectorProvider) {
    this.activityDispatchingAndroidInjectorProvider = activityDispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<TrueCallerAssingment> create(
      Provider<DispatchingAndroidInjector<Activity>> activityDispatchingAndroidInjectorProvider) {
    return new TrueCallerAssingment_MembersInjector(activityDispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(TrueCallerAssingment instance) {
    injectActivityDispatchingAndroidInjector(
        instance, activityDispatchingAndroidInjectorProvider.get());
  }

  public static void injectActivityDispatchingAndroidInjector(
      TrueCallerAssingment instance,
      DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector) {
    instance.activityDispatchingAndroidInjector = activityDispatchingAndroidInjector;
  }
}
