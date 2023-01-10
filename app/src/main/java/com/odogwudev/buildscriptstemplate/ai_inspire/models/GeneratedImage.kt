package com.odogwudev.buildscriptstemplate.ai_inspire.models


import com.google.gson.annotations.SerializedName
import com.odogwudev.buildscriptstemplate.ai_inspire.models.Data

data class GeneratedImage(
    @SerializedName("created") val created: Int, @SerializedName("data") val `data`: List<Data>
)