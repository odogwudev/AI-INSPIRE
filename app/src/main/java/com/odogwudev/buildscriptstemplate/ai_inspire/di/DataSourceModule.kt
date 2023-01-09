package com.odogwudev.buildscriptstemplate.ai_inspire.di

import com.odogwudev.buildscriptstemplate.ai_inspire.data.source.remote.DallEApiService
import com.odogwudev.buildscriptstemplate.ai_inspire.data.source.remote.RemoteDataSource
import com.odogwudev.buildscriptstemplate.ai_inspire.data.source.remote.RemoteDateSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun provideRemoteDateSource(remoteService: DallEApiService): RemoteDataSource =
        RemoteDateSourceImpl(remoteService)
}