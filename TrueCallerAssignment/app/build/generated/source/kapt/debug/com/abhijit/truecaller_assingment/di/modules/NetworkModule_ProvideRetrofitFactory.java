// Generated by Dagger (https://google.github.io/dagger).
package com.abhijit.truecaller_assingment.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvideRetrofitFactory(
      NetworkModule module, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkModule_ProvideRetrofitFactory create(
      NetworkModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }

  public static Retrofit proxyProvideRetrofit(NetworkModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(
        instance.provideRetrofit(okHttpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
