package com.abhijit.truecaller_assingment.data.remote

import io.reactivex.Single

interface ApiDataHelper
{
    fun getBlogPostResponse(): Single<String>
}