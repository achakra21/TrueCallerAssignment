package com.abhijit.truecaller_assingment.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/abhijit/truecaller_assingment/data/remote/TruecallerService;", "", "getBlogPostResponse", "Lio/reactivex/Single;", "", "app_debug"})
public abstract interface TruecallerService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/2018/01/22/life-as-an-android-engineer/")
    public abstract io.reactivex.Single<java.lang.String> getBlogPostResponse();
}