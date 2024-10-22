// Generated by Dagger (https://google.github.io/dagger).
package com.abhijit.truecaller_assingment.di.modules;

import com.abhijit.truecaller_assingment.data.DataManager;
import com.abhijit.truecaller_assingment.data.DataManagerImplementation;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_DataManagerProviderFactory implements Factory<DataManager> {
  private final AppModule module;

  private final Provider<DataManagerImplementation> appDataManagerProvider;

  public AppModule_DataManagerProviderFactory(
      AppModule module, Provider<DataManagerImplementation> appDataManagerProvider) {
    this.module = module;
    this.appDataManagerProvider = appDataManagerProvider;
  }

  @Override
  public DataManager get() {
    return Preconditions.checkNotNull(
        module.dataManagerProvider(appDataManagerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_DataManagerProviderFactory create(
      AppModule module, Provider<DataManagerImplementation> appDataManagerProvider) {
    return new AppModule_DataManagerProviderFactory(module, appDataManagerProvider);
  }

  public static DataManager proxyDataManagerProvider(
      AppModule instance, DataManagerImplementation appDataManager) {
    return Preconditions.checkNotNull(
        instance.dataManagerProvider(appDataManager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
