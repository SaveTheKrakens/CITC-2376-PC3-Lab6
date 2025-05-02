package com.savethekrakens.lab6_profilecardinviews

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val followButton: Button = findViewById(R.id.profile_action_button)
        followButton.setOnClickListener {
            Toast.makeText(this, "Follow button clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}