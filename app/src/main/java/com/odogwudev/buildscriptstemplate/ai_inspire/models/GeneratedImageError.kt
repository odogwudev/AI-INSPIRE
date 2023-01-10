package com.odogwudev.buildscriptstemplate.ai_inspire.models


import com.google.gson.annotations.SerializedName

data class GeneratedImageError(
    @SerializedName("error") val error: Error
)