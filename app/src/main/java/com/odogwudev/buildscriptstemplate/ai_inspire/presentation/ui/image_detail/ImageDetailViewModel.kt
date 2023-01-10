package com.odogwudev.buildscriptstemplate.ai_inspire.presentation.ui.image_detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.odogwudev.buildscriptstemplate.ai_inspire.domain.use_case.DownloadImageUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImageDetailViewModel @Inject constructor(
    private val downloadImageUseCase: DownloadImageUseCase
) : ViewModel() {

    var state: LiveData<String> = downloadImageUseCase.downloadImageState

    fun downloadImage(url: String) {
        downloadImageUseCase(url)
    }

}