package com.odogwudev.buildscriptstemplate.ai_inspire.data.repository

import com.bumptech.glide.load.engine.Resource
import com.odogwudev.buildscriptstemplate.ai_inspire.models.GeneratedImage
import com.odogwudev.buildscriptstemplate.ai_inspire.models.RequestBody
import kotlinx.coroutines.flow.Flow

interface DallERepository {
    fun generateImage(requestBody: RequestBody): Flow<Resource<GeneratedImage>>
}