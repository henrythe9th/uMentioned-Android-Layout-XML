package com.kj.newmainpage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class Settings extends Activity {

	protected Spinner spinner;
	protected int mSelected;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		spinner = (Spinner) findViewById(R.id.spinner);
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(
						parent.getContext(),
						"Notification: "
								+ parent.getItemAtPosition(position).toString(),
						Toast.LENGTH_SHORT).show();

				int usersChoice = spinner.getSelectedItemPosition();
				SharedPreferences sharedPref = getSharedPreferences("FileName",
						0);
				SharedPreferences.Editor prefEditor = sharedPref.edit();
				prefEditor.putInt("userChoiceSpinner", usersChoice);
				prefEditor.commit();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}

		});

	}

	@Override
	protected void onResume() {
		super.onResume();
		SharedPreferences sharedPref1 = getSharedPreferences("FileName",
				MODE_PRIVATE);
		int spinnerValue = sharedPref1.getInt("userChoiceSpinner", -1);
		if (spinnerValue != -1) {
			// set the value of the spinner
			spinner.setSelection(spinnerValue);
		}
		mSelected= spinnerValue;

	}
}
