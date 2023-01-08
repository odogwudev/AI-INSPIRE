package com.odogwudev.buildscriptstemplate.ai_inspire.data.source.remote

import com.odogwudev.buildscriptstemplate.ai_inspire.models.GeneratedImage
import com.odogwudev.buildscriptstemplate.ai_inspire.models.RequestBody

class RemoteDateSourceImpl(private val remoteService: DallEApiService) : RemoteDataSource {
    override suspend fun generateImage(
        requestBody: RequestBody
    ): GeneratedImage {
        return remoteService.generateImage(requestBody)
    }
}