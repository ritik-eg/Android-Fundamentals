package com.example.tasklaunchpad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tasklaunchpad.MainActivity
import com.example.tasklaunchpad.R

class SingleTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

//        // Set activity name and launch mode
//        findViewById<Button>(R.id.textActivity).text = "Activity: SingleTaskActivity\nLaunchMode: singleTask"
//
//        findViewById<Button>(R.id.btnStandard).setOnClickListener {
//            startActivity(Intent(this, MainActivity::class.java))
//        }
//
//        findViewById<Button>(R.id.btnSingleTop).setOnClickListener {
//            startActivity(Intent(this, SingleTopActivity::class.java))
//        }
//
//        findViewById<Button>(R.id.btnSingleTask).setOnClickListener {
//            startActivity(Intent(this, SingleTaskActivity::class.java))
//        }
//
//        findViewById<Button>(R.id.btnSingleInstance).setOnClickListener {
//            startActivity(Intent(this, SingleInstanceActivity::class.java))
//        }
    }
}
