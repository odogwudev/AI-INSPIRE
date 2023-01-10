package com.odogwudev.buildscriptstemplate.ai_inspire.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.odogwudev.buildscriptstemplate.ai_inspire.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}