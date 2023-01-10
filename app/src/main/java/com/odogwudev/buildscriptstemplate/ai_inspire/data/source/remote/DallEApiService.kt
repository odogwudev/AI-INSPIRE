package com.odogwudev.buildscriptstemplate.ai_inspire.data.source.remote

import com.odogwudev.buildscriptstemplate.ai_inspire.common.Constants.GENERATE_IMAGE
import com.odogwudev.buildscriptstemplate.ai_inspire.models.GeneratedImage
import com.odogwudev.buildscriptstemplate.ai_inspire.models.RequestBody
import retrofit2.http.Body
import retrofit2.http.POST

interface DallEApiService {

    @POST(GENERATE_IMAGE)
    suspend fun generateImage(@Body body: RequestBody): GeneratedImage

}