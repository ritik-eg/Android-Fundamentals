package com.example.tasklaunchpad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val button4 : Button = findViewById(R.id.btnfourth)
        button4.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }


//        val button : Button = findViewById(R)
        // Set activity name and launch mode
//        findViewById<Button>(R.id.textActivity).text = "Activity: MainActivity\nLaunchMode: standard"
//
//        findViewById<Button>(R.id.btnStandard).setOnClickListener {
//            startActivity(Intent(this, ThirdActivity::class.java))
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