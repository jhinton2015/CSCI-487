package com.example.unitconverter.test;

import com.example.unitconverter.Converter;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class ConverterTest extends ActivityInstrumentationTestCase2<Converter> {
	private Solo solo;

	public ConverterTest() {
		super(Converter.class);
	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

	public void testNoInputLogin() throws Exception {
		solo.assertCurrentActivity("wrong activity", Converter.class);
		solo.clickOnButton("Login");
		assertFalse(solo.waitForText("Hello Android"));
	}
	
	
	
}
