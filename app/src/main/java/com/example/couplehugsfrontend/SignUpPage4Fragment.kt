package com.example.couplehugsfrontend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SignUpPage4Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_sign_up_page4, container, false)
        val verifyButton = view.findViewById<Button>(R.id.verify_button)
        verifyButton.setOnClickListener {
            // Replace with next fragment
            (activity as SignUpActivity).replaceFragment(SignUpPage5Fragment())
        }
        return view
    }
}
