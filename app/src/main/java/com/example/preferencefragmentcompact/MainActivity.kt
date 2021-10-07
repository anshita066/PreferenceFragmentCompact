package com.example.preferencefragmentcompact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the preferences
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)

        // Get the user dark theme settings
        val isDarkTheme = prefs.getBoolean("key_dark_theme",false)

        val textView = findViewById<View>(R.id.textView) as TextView
        textView.text =" Theme Enabled ? $isDarkTheme"


        val btn = findViewById<View>(R.id.btn) as Button
        btn.setOnClickListener{
            // Load the settings fragment
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.linearLayout,BlankFragment())
                .commit()
        }
    }
}