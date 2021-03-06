package android.example.com.visualizerpreferences;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;
// COMPLETED (2) Create a class called SettingsFragment that extends PreferenceFragmentCompat
public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // COMPLETED (5) In SettingsFragment's onCreatePreferences method add the preference file using the
        // addPreferencesFromResource method

        // Add visualizer preferences, defined in the XML file in res->xml->pref_visualizer
        addPreferencesFromResource(R.xml.pref_visualizer);
    }

}