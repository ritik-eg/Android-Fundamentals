package com.example.tasklaunchpad

import android.app.Activity
import android.os.Bundle


class SingleTopActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        // Set activity name and launch mode
       // findViewById<Button>(R.id.textActivity).text = "Activity: SingleTopActivity\nLaunchMode: singleTop"
    }
}
