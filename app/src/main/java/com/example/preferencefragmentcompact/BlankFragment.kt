package com.example.preferencefragmentcompact


import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import android.widget.Toast
import androidx.preference.SwitchPreferenceCompat


class BlankFragment : PreferenceFragmentCompat(){
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.prefs,rootKey)

        // Get the switch preference
        val switchDarkMode: SwitchPreferenceCompat? = findPreference("key_dark_theme")

        // Switch preference change listener
        switchDarkMode?.setOnPreferenceChangeListener{ preference, newValue ->
            if (newValue == true){
                Toast.makeText(activity,"enabled",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(activity,"disabled",Toast.LENGTH_LONG).show()
            }

            true
        }
    }
}