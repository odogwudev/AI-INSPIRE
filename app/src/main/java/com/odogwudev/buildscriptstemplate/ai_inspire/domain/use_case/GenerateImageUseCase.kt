package com.odogwudev.buildscriptstemplate.ai_inspire.domain.use_case

import com.odogwudev.buildscriptstemplate.ai_inspire.data.repository.DallERepository
import com.odogwudev.buildscriptstemplate.ai_inspire.models.RequestBody
import javax.inject.Inject

class GenerateImageUseCase @Inject constructor(private val repository: DallERepository) {
    operator fun invoke(requestBody: RequestBody) = repository.generateImage(requestBody)
}