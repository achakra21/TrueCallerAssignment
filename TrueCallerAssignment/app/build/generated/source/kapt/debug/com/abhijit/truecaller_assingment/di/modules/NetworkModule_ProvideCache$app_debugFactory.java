// Generated by Dagger (https://google.github.io/dagger).
package com.abhijit.truecaller_assingment.di.modules;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.Cache;

public final class NetworkModule_ProvideCache$app_debugFactory implements Factory<Cache> {
  private final NetworkModule module;

  private final Provider<Application> applicationProvider;

  public NetworkModule_ProvideCache$app_debugFactory(
      NetworkModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Cache get() {
    return Preconditions.checkNotNull(
        module.provideCache$app_debug(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkModule_ProvideCache$app_debugFactory create(
      NetworkModule module, Provider<Application> applicationProvider) {
    return new NetworkModule_ProvideCache$app_debugFactory(module, applicationProvider);
  }

  public static Cache proxyProvideCache$app_debug(NetworkModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.provideCache$app_debug(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
