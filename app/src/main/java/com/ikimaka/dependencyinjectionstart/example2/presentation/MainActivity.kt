package com.ikimaka.dependencyinjectionstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikimaka.dependencyinjectionstart.R
import com.ikimaka.dependencyinjectionstart.example1.Activity
import com.ikimaka.dependencyinjectionstart.example2.di.ContextModule
import com.ikimaka.dependencyinjectionstart.example2.di.DaggerApplicationComponent
import com.ikimaka.dependencyinjectionstart.example2.di.DataModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent.builder()
            .contextModule(ContextModule(application))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()

//        val activity = Activity()
//        activity.computer.toString()

    }
}