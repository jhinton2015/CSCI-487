package com.example.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class Converter extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		// Required call through to Activity.onCreate()
		// Restore any saved instance state
		super.onCreate(savedInstanceState);
		setContentView(R.layout.convertertool);
		final Button convert = (Button) findViewById(R.id.convertbutton);
		final Button clear = (Button) findViewById(R.id.clearbutton);
		final EditText mmeter = (EditText) findViewById(R.id.mmeterEditText);
		final EditText cmeter = (EditText) findViewById(R.id.cmeterEditText);
		final EditText meter = (EditText) findViewById(R.id.meterEditText);
		final EditText kmeter = (EditText) findViewById(R.id.kmeterEditText);
		final EditText inch = (EditText) findViewById(R.id.inchEditText);
		final EditText feet = (EditText) findViewById(R.id.feetEditText);
		final EditText mile = (EditText) findViewById(R.id.mileEditText);
		final EditText yard = (EditText) findViewById(R.id.yardEditText);
		convert.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				if (mmeter.getText().length() > 0)   
				{
					String value = mmeter.getText().toString();
					double finalValue = Double.parseDouble(value);
					
					double cmFinalValue = finalValue * 0.1;
					cmeter.setText(String.valueOf(cmFinalValue));
					
					double meterFinalValue = finalValue * .001;
					meter.setText(String.valueOf(meterFinalValue));
					
					double kilometerFinalValue = finalValue * .000001;
					kmeter.setText(String.valueOf(kilometerFinalValue));
					
					double inchFinalValue = finalValue * .0393701;
					inch.setText(String.valueOf(inchFinalValue));
					
					double feetFinalValue = finalValue * .00328084;
					feet.setText(String.valueOf(feetFinalValue));
					
					double mileFinalValue = finalValue * .000000621371192237;
					mile.setText(String.valueOf(mileFinalValue));
					
					double yardFinalValue = finalValue * .00109361;
					yard.setText(String.valueOf(yardFinalValue));
				}
				
				else if (cmeter.getText().length() > 0)
				{
					String value = cmeter.getText().toString();
					double finalValue = Double.parseDouble(value);
					
					double mmFinalValue = finalValue * 10;
					mmeter.setText(String.valueOf(mmFinalValue));
					
					double meterFinalValue = finalValue * .01;
					meter.setText(String.valueOf(meterFinalValue));
					
					double kmeterFinalValue = finalValue * .00001;
					kmeter.setText(String.valueOf(kmeterFinalValue));
					
					double inchFinalValue = finalValue * .393701;
					inch.setText(String.valueOf(inchFinalValue));
					
					double feetFinalValue = finalValue * .0328084;
					feet.setText(String.valueOf(feetFinalValue));
					
					double mileFinalValue = finalValue * .00000621371;
					mile.setText(String.valueOf(mileFinalValue));
					
					double yardFinalValue = finalValue * .0109361;
					yard.setText(String.valueOf(yardFinalValue));
				}
				
				else if (meter.getText().length() > 0)
				{
					String value = meter.getText().toString();
					double finalValue = Double.parseDouble(value);
					
					double mmFinalValue = finalValue * 1000;
					mmeter.setText(String.valueOf(mmFinalValue));
					
					double cmeterFinalValue = finalValue * 100;
					cmeter.setText(String.valueOf(cmeterFinalValue));
					
					double kmeterFinalValue = finalValue * .001;
					kmeter.setText(String.valueOf(kmeterFinalValue));
					
					double inchFinalValue = finalValue * 39.3701;
					inch.setText(String.valueOf(inchFinalValue));
					
					double feetFinalValue = finalValue * 3.28084;
					feet.setText(String.valueOf(feetFinalValue));
					
					double mileFinalValue = finalValue * .000621371;
					mile.setText(String.valueOf(mileFinalValue));
					
					double yardFinalValue = finalValue * 1.09361;
					yard.setText(String.valueOf(yardFinalValue));
				}
				
				else if (kmeter.getText().length() > 0)
				{
					String value = kmeter.getText().toString();
					double finalValue = Double.parseDouble(value);
					
					double mmFinalValue = finalValue * 1000000;
					mmeter.setText(String.valueOf(mmFinalValue));
					
					double cmeterFinalValue = finalValue * 100000;
					cmeter.setText(String.valueOf(cmeterFinalValue));
					
					double meterFinalValue = finalValue * 1000;
					meter.setText(String.valueOf(meterFinalValue));
					
					double inchFinalValue = finalValue * 39370.1;
					inch.setText(String.valueOf(inchFinalValue));
					
					double feetFinalValue = finalValue * 3280.84;
					feet.setText(String.valueOf(feetFinalValue));
					
					double mileFinalValue = finalValue * .621371;
					mile.setText(String.valueOf(mileFinalValue));
					
					double yardFinalValue = finalValue * 1093.61;
					yard.setText(String.valueOf(yardFinalValue));
				}
				
				else
				{
					mmeter.setText("0");
					cmeter.setText("0");
					meter.setText("0");
					kmeter.setText("0");
					inch.setText("0");
					feet.setText("0");
					mile.setText("0");
					yard.setText("0");
				}
			}
		});
		
		clear.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				mmeter.setText("");
				cmeter.setText("");
				meter.setText("");
				kmeter.setText("");
				inch.setText("");
				feet.setText("");
				mile.setText("");
				yard.setText("");
			}
		});
	}
}
