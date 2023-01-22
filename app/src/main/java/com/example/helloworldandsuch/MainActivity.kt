package com.example.helloworldandsuch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.curseButton)
        button.setOnClickListener {
            //Log.v("Test logger", "Button clicked")
            Toast.makeText(this, "Curse worsened...", Toast.LENGTH_SHORT).show()
        }
    }


}