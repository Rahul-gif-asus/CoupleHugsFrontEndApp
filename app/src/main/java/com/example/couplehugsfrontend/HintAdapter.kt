package com.example.couplehugsfrontend

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class HintAdapter(context: Context, resource: Int, items: List<String>) : ArrayAdapter<String>(context, resource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getView(position, convertView, parent) as TextView
        if (position == 0) {
            view.setTextColor(context.resources.getColor(android.R.color.darker_gray)) // set hint color
        } else {
            view.setTextColor(context.resources.getColor(android.R.color.black)) // set normal item color
        }
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getDropDownView(position, convertView, parent) as TextView
        if (position == 0) {
            view.visibility = View.GONE // hide the first item in the dropdown
        } else {
            view.visibility = View.VISIBLE
        }
        return view
    }
}
