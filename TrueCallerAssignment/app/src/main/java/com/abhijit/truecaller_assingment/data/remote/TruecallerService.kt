package com.abhijit.truecaller_assingment.data.remote

import io.reactivex.Single
import retrofit2.http.GET

interface TruecallerService {

    @GET("/2018/01/22/life-as-an-android-engineer/")
    fun getBlogPostResponse(): Single<String>
}