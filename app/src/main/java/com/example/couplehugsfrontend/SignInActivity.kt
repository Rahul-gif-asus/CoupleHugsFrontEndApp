package com.example.couplehugsfrontend

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signInButton = findViewById<Button>(R.id.sign_in_button)
        val signUpPrompt = findViewById<TextView>(R.id.sign_up_prompt)

        signInButton.setOnClickListener {
            // Handle sign-in logic here
        }

        signUpPrompt.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
