package com.odogwudev.buildscriptstemplate.ai_inspire.di

import com.odogwudev.buildscriptstemplate.ai_inspire.data.repository.DallERepository
import com.odogwudev.buildscriptstemplate.ai_inspire.data.repository.DallERepositoryImpl
import com.odogwudev.buildscriptstemplate.ai_inspire.data.source.remote.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDallERepository(
        remoteDataSource: RemoteDataSource
    ): DallERepository =
        DallERepositoryImpl(remoteDataSource)
}