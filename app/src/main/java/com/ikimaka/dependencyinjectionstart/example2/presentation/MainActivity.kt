package com.ikimaka.dependencyinjectionstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ikimaka.dependencyinjectionstart.R
import com.ikimaka.dependencyinjectionstart.example2.ExampleApp
import com.ikimaka.dependencyinjectionstart.example2.data.database.ExampleDatabase
import com.ikimaka.dependencyinjectionstart.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        (application as ExampleApp).component
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