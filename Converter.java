package com.example.unitconverter;

import android.app.Activity;
import android.os.Bundle;


public class Converter extends Activity {
	public void onCreate(Bundle savedInstanceState) {

		// Required call through to Activity.onCreate()
		// Restore any saved instance state
		super.onCreate(savedInstanceState);
		setContentView(R.layout.convertertool);
	}
}
