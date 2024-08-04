package com.example.couplehugsfrontend

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Find views by ID
        val emailTextView = findViewById<TextView>(R.id.email)
        val passwordTextView = findViewById<TextView>(R.id.password1)
        val forgotPasswordTextView = findViewById<TextView>(R.id.forgot_your_password_)
        val signInTextView = findViewById<TextView>(R.id.sign_in_ek1)
        val googleLoginButton = findViewById<ImageView>(R.id.google_icon)
        val facebookLoginButton = findViewById<ImageView>(R.id.facebook_f_logo__2021__svg_1)

        // Handle clicks
        signInTextView.setOnClickListener {
            // Handle sign-in logic here
        }

        forgotPasswordTextView.setOnClickListener {
            // Handle forgot password logic
        }

        googleLoginButton.setOnClickListener {
            // Handle Google login
        }

        facebookLoginButton.setOnClickListener {
            // Handle Facebook login
        }

        // Sign up prompt click
        val signUpPrompt = findViewById<TextView>(R.id.don_t_have_an_account__sign_up)
        signUpPrompt.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
