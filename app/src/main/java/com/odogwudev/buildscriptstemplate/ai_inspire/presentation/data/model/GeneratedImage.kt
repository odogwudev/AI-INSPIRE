package com.odogwudev.buildscriptstemplate.ai_inspire.presentation.data.model

import com.google.gson.annotations.SerializedName

data class GeneratedImage(
    @SerializedName("created")
    val created: Int,
    @SerializedName("data")
    val `data`: List<Data>
)