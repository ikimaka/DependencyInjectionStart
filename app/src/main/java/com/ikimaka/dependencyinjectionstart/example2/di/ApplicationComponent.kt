package com.ikimaka.dependencyinjectionstart.example2.di

import android.content.Context
import com.ikimaka.dependencyinjectionstart.example2.data.database.ExampleDatabase
import com.ikimaka.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.ikimaka.dependencyinjectionstart.example2.presentation.MainActivity
import com.ikimaka.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }

}