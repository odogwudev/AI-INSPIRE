package com.odogwudev.buildscriptstemplate.ai_inspire.data.repository

import com.odogwudev.buildscriptstemplate.ai_inspire.data.source.remote.RemoteDataSource
import com.odogwudev.buildscriptstemplate.ai_inspire.models.RequestBody
import com.odogwudev.buildscriptstemplate.ai_inspire.util.Resource
import kotlinx.coroutines.flow.flow

class DallERepositoryImpl(
    private val remoteDataSource: RemoteDataSource
) : DallERepository {
    override fun generateImage(
        requestBody: RequestBody
    ) = flow {
        emit(Resource.Loading)

        try {
            val response = remoteDataSource.generateImage(requestBody)
            emit(Resource.Success(response))
        } catch (t: Throwable) {
            emit(Resource.Error(t))
        }

    }

}