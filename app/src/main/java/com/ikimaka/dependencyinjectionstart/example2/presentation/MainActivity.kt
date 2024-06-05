package com.ikimaka.dependencyinjectionstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikimaka.dependencyinjectionstart.R
import com.ikimaka.dependencyinjectionstart.example1.Activity

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()

//        val activity = Activity()
//        activity.computer.toString()

    }
}