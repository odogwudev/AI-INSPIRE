package com.odogwudev.buildscriptstemplate.ai_inspire.common

import com.odogwudev.buildscriptstemplate.ai_inspire.BuildConfig

object Constants {
    const val BASE_URL = "https://api.openai.com/v1/"
    const val TOKEN = BuildConfig.API_KEY
    const val GENERATE_IMAGE = "images/generations"
    const val SIZE_256 = "256x256"
    const val SIZE_512 = "512x512"
    const val SIZE_1024 = "1024x1024"
    const val MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 1

    var myApiKey: String = BuildConfig.API_KEY
}