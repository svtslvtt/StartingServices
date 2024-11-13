package com.example.startingsevices

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val time = findViewById<EditText>(R.id.editText).text.toString()
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this, TimerService::class.java)
            intent.putExtra("time", time)
            startService(intent)


        }
    }
}