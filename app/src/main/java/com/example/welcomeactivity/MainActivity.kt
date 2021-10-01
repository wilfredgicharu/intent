package com.example.welcomeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

const val FULL_NAME_KEY = "FULL NAME KEY"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.submit_button).setOnClickListener{
            val fullName = findViewById<EditText>(R.id.full_name).text.toString().trim()

            if (fullName.isNotEmpty()){
                Intent(this, welcome::class.java)
                    .also { welcome ->
                        welcome.putExtra(FULL_NAME_KEY, fullName)
                        startActivity(welcome)

                    }
            }
            else{
                Toast.makeText(this, getString(R.string.full_name_label),Toast.LENGTH_LONG).show()
            }

        }

    }
}