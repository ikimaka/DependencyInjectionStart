package com.ikimaka.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {


    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var mouse: Mouse
    @Inject
    lateinit var monitor: Monitor

    init {
        //Component().inject(this)
        DaggerNewComponent.create().inject(this)
    }







}