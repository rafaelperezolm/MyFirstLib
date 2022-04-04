package com.rafaelperezolm.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.rafaelperezolm.myfirstlib.BlinkEffect

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.buttonView)
        btn.setOnClickListener {
            BlinkEffect.blink(btn)
        }
    }
}