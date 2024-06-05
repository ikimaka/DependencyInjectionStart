package com.ikimaka.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {


    @Inject
    lateinit var computer: Computer

    init {
        //Component().inject(this)
        DaggerNewComponent.create().inject(this)
    }







}