package com.example.tasklaunchpad

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btn1 = findViewById<Button>(R.id.button1)
        val progressBar : ProgressBar = findViewById<ProgressBar>(R.id.progressBar)
        btn1.setOnClickListener {
            Toast.makeText(this, "Hi Welcome To App", Toast.LENGTH_LONG).show()
            progressBar.visibility = ProgressBar.VISIBLE
            Handler().postDelayed({
                progressBar.visibility = ProgressBar.GONE},
                10000)


            val Input1 = findViewById<EditText>(R.id.Input1)
            val message = Input1.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("m1", message)
            startActivity(intent)

//            // Set activity name and launch mode
//            findViewById<Button>(R.id.textActivity).text = "Activity: MainActivity\nLaunchMode: standard"
//
//            findViewById<Button>(R.id.btnStandard).setOnClickListener {
//                startActivity(Intent(this, MainActivity::class.java))
//            }
//
//            findViewById<Button>(R.id.btnSingleTop).setOnClickListener {
//                startActivity(Intent(this, SingleTopActivity::class.java))
//            }
//
//            findViewById<Button>(R.id.btnSingleTask).setOnClickListener {
//                startActivity(Intent(this, SingleTaskActivity::class.java))
//            }
//
//            findViewById<Button>(R.id.btnSingleInstance).setOnClickListener {
//                startActivity(Intent(this, SingleInstanceActivity::class.java))
//            }



        }
    }
}

