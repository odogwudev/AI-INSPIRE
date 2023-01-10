package com.odogwudev.buildscriptstemplate.ai_inspire.di

import com.odogwudev.buildscriptstemplate.ai_inspire.common.Constants.BASE_URL
import com.odogwudev.buildscriptstemplate.ai_inspire.common.Constants.TOKEN
import com.odogwudev.buildscriptstemplate.ai_inspire.data.source.remote.DallEApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    private var client: OkHttpClient = OkHttpClient.Builder().addInterceptor { chain ->
        val newRequest: Request =
            chain.request().newBuilder().addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer $TOKEN").build()
        chain.proceed(newRequest)
    }.build()

    @Provides
    @Singleton
    fun provideDallEService(): DallEApiService = Retrofit.Builder().client(client).baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()).build()
        .create(DallEApiService::class.java)
}