package com.example.unitconverter.test;

import com.example.unitconverter.Converter;
import com.example.unitconverter.MainActivity;
import com.example.unitconverter.Ruler;

import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class ConverterTest extends ActivityInstrumentationTestCase2<MainActivity> {
	private Solo solo;

	public ConverterTest() {
		super(MainActivity.class);
	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

	public void testgoToConverterScreen(){
		solo.assertCurrentActivity("wrong activity", MainActivity.class);
		solo.clickOnButton("Converter");
		assertTrue(solo.waitForActivity(Converter.class));
	}
	
	public void testrulerScreen(){
		solo.assertCurrentActivity("wrong activity", MainActivity.class);
		solo.clickOnButton("Ruler");
		assertTrue(solo.waitForText("Ruler Tool"));
		}	
}
