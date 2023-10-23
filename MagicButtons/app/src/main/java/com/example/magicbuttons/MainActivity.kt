package com.example.magicbuttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blueButton: Button = findViewById(R.id.buttonBlue)
        val greenButton: Button = findViewById(R.id.buttonGreen)
        val redButton: Button = findViewById(R.id.buttonRed)

        blueButton.setOnClickListener() {
            val i = Intent(this, SecondActivity::class.java)
            i.putExtra("color", "blue")
            startActivity(i)
        }

        greenButton.setOnClickListener() {
            val i = Intent(this, SecondActivity::class.java)
            i.putExtra("color", "green")
            startActivity(i)
        }

        redButton.setOnClickListener() {
            val i = Intent(this, SecondActivity::class.java)
            i.putExtra("color", "red")
            startActivity(i)
        }
    }
}