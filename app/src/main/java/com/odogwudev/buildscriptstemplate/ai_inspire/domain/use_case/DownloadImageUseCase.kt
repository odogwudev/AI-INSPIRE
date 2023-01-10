package com.odogwudev.buildscriptstemplate.ai_inspire.domain.use_case

import android.app.Application
import com.odogwudev.buildscriptstemplate.ai_inspire.util.DownloadImage
import javax.inject.Inject

class DownloadImageUseCase @Inject constructor(private val application: Application) :
    DownloadImage() {
    operator fun invoke(url: String) = downloadImageFromURL(url, application)

}