package com.example.couplehugsfrontend

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class VerifyOtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otp)

        val verifyButton = findViewById<Button>(R.id.verify_button)

        verifyButton.setOnClickListener {
            // Handle OTP verification logic here
        }
    }
}
