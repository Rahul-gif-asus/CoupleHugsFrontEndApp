package com.example.couplehugsfrontend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import android.widget.TextView

class SignUpPage3Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_sign_up_page3, container, false)
        val genderSpinner = view.findViewById<Spinner>(R.id.gender_spinner)

        // Setting up the spinner with the gender array
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.gender_options,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            genderSpinner.adapter = adapter
        }

        // Set default selection to "Select Gender"
        genderSpinner.setSelection(0)

        // Find and set the prompt view text color to gray
        try {
            val textView = genderSpinner.selectedView as TextView
            textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.gray))
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return view
    }
}
