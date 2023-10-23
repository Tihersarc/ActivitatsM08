package com.example.magicbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var textDisplay = findViewById<TextView>(R.id.textDisplay)
        val colorString = intent?.extras?.getString("color").toString()
        textDisplay.text = colorString
    }
}