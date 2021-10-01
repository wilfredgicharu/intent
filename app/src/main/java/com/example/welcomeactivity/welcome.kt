package com.example.welcomeactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        intent?.let {
            val fullname = it.getStringExtra(FULL_NAME_KEY)
            findViewById<TextView>(R.id.welcome_text).text= getString(R.string.welcome_text, fullname)
        }

    }
}