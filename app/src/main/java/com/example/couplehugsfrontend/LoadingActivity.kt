package com.example.couplehugsfrontend

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        lifecycleScope.launch {
            // Perform any necessary initialization here
            // For example: initialize data, load resources, etc.

            // Start the main activity after initialization
            val intent = Intent(this@LoadingActivity, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
