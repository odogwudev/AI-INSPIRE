package com.odogwudev.buildscriptstemplate.ai_inspire.models


import com.google.gson.annotations.SerializedName
import com.odogwudev.buildscriptstemplate.ai_inspire.models.Error

data class GeneratedImageError(
    @SerializedName("error")
    val error: Error
)