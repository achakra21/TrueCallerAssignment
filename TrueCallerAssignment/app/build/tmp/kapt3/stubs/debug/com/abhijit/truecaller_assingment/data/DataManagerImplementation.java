package com.abhijit.truecaller_assingment.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/abhijit/truecaller_assingment/data/DataManagerImplementation;", "Lcom/abhijit/truecaller_assingment/data/DataManager;", "apiDataHelper", "Lcom/abhijit/truecaller_assingment/data/remote/ApiDataHelper;", "(Lcom/abhijit/truecaller_assingment/data/remote/ApiDataHelper;)V", "getBlogPostResponse", "Lio/reactivex/Single;", "", "app_debug"})
public final class DataManagerImplementation implements com.abhijit.truecaller_assingment.data.DataManager {
    private final com.abhijit.truecaller_assingment.data.remote.ApiDataHelper apiDataHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.String> getBlogPostResponse() {
        return null;
    }
    
    @javax.inject.Inject()
    public DataManagerImplementation(@org.jetbrains.annotations.NotNull()
    com.abhijit.truecaller_assingment.data.remote.ApiDataHelper apiDataHelper) {
        super();
    }
}