package com.ikimaka.dependencyinjectionstart.example2.di

import android.content.Context
import com.ikimaka.dependencyinjectionstart.example2.data.database.ExampleDatabase
import com.ikimaka.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.ikimaka.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }

}