package com.syzible.irishnoungenders.screens.options.settings;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.syzible.irishnoungenders.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    public SettingsFragment() {
    }

    public static SettingsFragment getInstance() {
        return new SettingsFragment();
    }

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.settings_preferences);
    }
}