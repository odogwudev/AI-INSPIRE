package com.odogwudev.buildscriptstemplate.ai_inspire.presentation.ui.generate_image

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.odogwudev.buildscriptstemplate.ai_inspire.common.Constants.SIZE_1024
import com.odogwudev.buildscriptstemplate.ai_inspire.common.Constants.SIZE_256
import com.odogwudev.buildscriptstemplate.ai_inspire.common.Constants.SIZE_512
import com.odogwudev.buildscriptstemplate.ai_inspire.domain.use_case.GenerateImageUseCase
import com.odogwudev.buildscriptstemplate.ai_inspire.models.GeneratedImage
import com.odogwudev.buildscriptstemplate.ai_inspire.models.RequestBody
import com.odogwudev.buildscriptstemplate.ai_inspire.util.Resource
import com.odogwudev.buildscriptstemplate.ai_inspire.util.Sizes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GenerateImageViewModel @Inject constructor(private val generateImageUseCase: GenerateImageUseCase) :
    ViewModel() {


    private val _state = MutableStateFlow<Resource<GeneratedImage>?>(null)
    val state = _state.asStateFlow()

    fun generateImage(prompt: String, n: Int, size: Sizes) = viewModelScope.launch {

        val sizeString = when (size) {
            Sizes.SIZE_256 -> SIZE_256
            Sizes.SIZE_512 -> SIZE_512
            Sizes.SIZE_1024 -> SIZE_1024
        }

        generateImageUseCase(RequestBody(n, prompt, sizeString)).collect {
            _state.emit(it)
        }
    }

}