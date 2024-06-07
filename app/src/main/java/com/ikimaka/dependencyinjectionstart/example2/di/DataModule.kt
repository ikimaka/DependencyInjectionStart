package com.ikimaka.dependencyinjectionstart.example2.di

import android.content.Context
import com.ikimaka.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.ikimaka.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.ikimaka.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.ikimaka.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.ikimaka.dependencyinjectionstart.example2.data.datasource.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface DataModule {
    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource
    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource

}