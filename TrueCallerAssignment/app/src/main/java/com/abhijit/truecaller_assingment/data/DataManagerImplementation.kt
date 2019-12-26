package com.abhijit.truecaller_assingment.data

import com.abhijit.truecaller_assingment.data.remote.ApiDataHelper
import javax.inject.Inject

class DataManagerImplementation @Inject constructor(private val apiDataHelper: ApiDataHelper): DataManager {
    override fun getBlogPostResponse() = apiDataHelper.getBlogPostResponse()
}