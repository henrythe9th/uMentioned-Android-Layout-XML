package com.kj.newmainpage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Landingpage2 extends Activity {

	TextView mLogIn;
	EditText mInput;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.landingpage2);

		mLogIn = (TextView) findViewById(R.id.logInLabel);
		mLogIn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				/*
				 * AlertDialog.Builder builder = new AlertDialog.Builder(this);
				 * builder.setItems(R.array.camera_choices, mDialogListener);
				 * AlertDialog dialog = builder.create(); dialog.show();
				 */

				AlertDialog.Builder adb = new AlertDialog.Builder(
						Landingpage2.this);
				final EditText input = new EditText(Landingpage2.this);
			    adb.setView(input);
				adb.setTitle(R.string.error_message);
				adb.setPositiveButton("OK", null);
				adb.setNegativeButton("Cancel", null);
				AlertDialog dialog = adb.create();
				dialog.show();
			}

		});
		mInput = (EditText)findViewById(R.id.schoolInput);
		mInput.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Landingpage2.this,Addschool.class);
				startActivity(intent);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello, menu);
		return true;
	}

}
