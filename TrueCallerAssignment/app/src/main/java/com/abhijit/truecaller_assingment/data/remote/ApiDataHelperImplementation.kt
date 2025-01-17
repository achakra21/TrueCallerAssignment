package com.abhijit.truecaller_assingment.data.remote

import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class ApiDataHelperImplementation @Inject constructor(retrofit: Retrofit): ApiDataHelper
{

    private var truecallerService: TruecallerService? = null

    init {
        truecallerService = retrofit.create(TruecallerService::class.java)
    }

    override fun getBlogPostResponse(): Single<String> {
        return truecallerService!!.getBlogPostResponse()
    }
}