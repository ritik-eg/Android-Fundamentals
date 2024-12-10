package com.example.tasklaunchpad

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val receivedMessage = intent.getStringExtra("m1")
//
//        val output = findViewById<TextView>(R.id.Output1)
//        output.text = receivedMessage


        val output2 = findViewById<TextView>(R.id.Output2)
        output2.text = receivedMessage

        val button: Button = findViewById(R.id.button5)
        button.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }

}