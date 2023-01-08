package com.odogwudev.buildscriptstemplate.ai_inspire.data.source.remote

import com.odogwudev.buildscriptstemplate.ai_inspire.models.GeneratedImage
import com.odogwudev.buildscriptstemplate.ai_inspire.models.RequestBody

interface RemoteDataSource {
    suspend fun generateImage(requestBody: RequestBody): GeneratedImage
}