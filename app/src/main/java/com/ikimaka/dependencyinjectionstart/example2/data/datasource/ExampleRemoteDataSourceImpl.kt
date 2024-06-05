package com.ikimaka.dependencyinjectionstart.example2.data.datasource

import com.ikimaka.dependencyinjectionstart.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(private val apiService: ExampleApiService): ExampleRemoteDataSource {
    override fun method() {
        apiService.method()
    }

}