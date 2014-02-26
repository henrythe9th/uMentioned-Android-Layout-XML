package com.kj.newmainpage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.util.Log;

public class SettingsFragment extends PreferenceFragment {
	
	String[] mSettingArray = new String[3];
	Boolean[] mUserKeyArray =new Boolean[3];

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.layout.activity_settings_fragment);
        
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity());
        Boolean spottedKey = sharedPref.getBoolean(getString(R.string.spotted_key), true);
        Boolean confessionKey = sharedPref.getBoolean(getString(R.string.confessions_key), true);
        Boolean overheardKey = sharedPref.getBoolean(getString(R.string.overheard_key), true);
        mUserKeyArray[0] = spottedKey;
        mUserKeyArray[1] = confessionKey;
        mUserKeyArray[2] = overheardKey;
        
        
	}
	//The value of mUserKeyArray in order: spottedKey,confessionKey,overheardKey
	@Override
	public void onResume() {
		super.onResume();
		for(int i =0; i<3 ; i++){
        	if(mUserKeyArray[i] == true){
            	mSettingArray[i] ="checked";
            }
            else{
            	mSettingArray[i]="empty";
            }
        	Log.e("SettingsFragment",mSettingArray[i]);
        }
	}

	
}
