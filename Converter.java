package com.example.unitconverter;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;

public class Converter extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		// Required call through to Activity.onCreate()
		// Restore any saved instance state
		super.onCreate(savedInstanceState);
		setContentView(R.layout.convertertool);
		final Button convert = (Button) findViewById(R.id.convertButton);
		final Button clear = (Button) findViewById(R.id.clearbutton);
		mmeter = (EditText) findViewById(R.id.mmeterEditText);
		cmeter = (EditText) findViewById(R.id.cmeterEditText);
	    meter = (EditText) findViewById(R.id.meterEditText);
		kmeter = (EditText) findViewById(R.id.kmeterEditText);
		inch = (EditText) findViewById(R.id.inchEditText);
		feet = (EditText) findViewById(R.id.feetEditText);
		mile = (EditText) findViewById(R.id.mileEditText);
		yard = (EditText) findViewById(R.id.yardEditText);
		
		mmeter.setOnKeyListener(new OnKeyListener()
			{
				@Override
				public boolean onKey(View v, int keyCode, KeyEvent event) {
					setEnabledFalse();
					mmeter.setEnabled(true);
					return false;
				}
			}
			); 
		
		cmeter.setOnKeyListener(new OnKeyListener()
		{
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				setEnabledFalse();
				cmeter.setEnabled(true);
				return false;
			}
		}
		);
		
		kmeter.setOnKeyListener(new OnKeyListener()
		{
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				setEnabledFalse();
				kmeter.setEnabled(true);
				return false;
			}
		}
		);
		
		meter.setOnKeyListener(new OnKeyListener()
		{
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				setEnabledFalse();
				meter.setEnabled(true);
				return false;
			}
		}
		);
		
		inch.setOnKeyListener(new OnKeyListener()
		{
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				setEnabledFalse();
				inch.setEnabled(true);
				return false;
			}
		}
		);
		
		feet.setOnKeyListener(new OnKeyListener()
		{
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				setEnabledFalse();
				feet.setEnabled(true);
				return false;
			}
		}
		);
		
		mile.setOnKeyListener(new OnKeyListener()
		{
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				setEnabledFalse();
				mile.setEnabled(true);
				return false;
			}
		}
		);
		
		yard.setOnKeyListener(new OnKeyListener()
		{
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				setEnabledFalse();
				yard.setEnabled(true);
				return false;
			}
		}
		);
		
		convert.setOnClickListener(new OnClickListener(){
			public void setText(double num)
			{
				mmeter.setText(String.valueOf(num));
				cmeter.setText(String.valueOf(num * 0.1));
				meter.setText(String.valueOf(num * .001));
				kmeter.setText(String.valueOf(num * .000001));
				inch.setText(String.valueOf(num * .0393701));
				feet.setText(String.valueOf(num * .00328084));
				mile.setText(String.valueOf(num * .000000621371192237));
				yard.setText(String.valueOf(num * .00109361));
			}
			
			public void onClick(View v)
			{
				if (mmeter.getText().length() > 0)   
				{
					String value = mmeter.getText().toString();
					double finalValue = Double.parseDouble(value);
					setText(finalValue);
				}
				
				else if (cmeter.getText().length() > 0)
				{
					String value = cmeter.getText().toString();
					double finalValue = Double.parseDouble(value);
					finalValue *= 10;
					setText(finalValue);
					cmeter.setText(value);
				}
				else if (meter.getText().length() > 0)
				{
					String value = meter.getText().toString();
					double finalValue = Double.parseDouble(value);
					finalValue *= 1000;
					setText(finalValue);
					meter.setText(value);
				}
				else if (kmeter.getText().length() > 0)
				{
					String value = kmeter.getText().toString();
					double finalValue = Double.parseDouble(value);
					finalValue *= 1000000;
					setText(finalValue);
					kmeter.setText(value);
				}
				else if (inch.getText().length() > 0)
				{
					String value = inch.getText().toString();
					double finalValue = Double.parseDouble(value);
					finalValue *= 25.4;
					setText(finalValue);
					inch.setText(value);
				}
				else if (feet.getText().length() > 0)
				{
					String value = feet.getText().toString();
					double finalValue = Double.parseDouble(value);
					finalValue *= 304.8;
					setText(finalValue);
					feet.setText(value);
				}
				else if (mile.getText().length() > 0)
				{
					String value = mile.getText().toString();
					double finalValue = Double.parseDouble(value);
					finalValue *= 1609344;
					setText(finalValue);
					mile.setText(value);
				}
				else if (yard.getText().length() > 0)
				{
					String value = yard.getText().toString();
					double finalValue = Double.parseDouble(value);
					finalValue *= 914.4;
					setText(finalValue);
					yard.setText(value);
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
				setEnabledTrue();
			}
			});
	}
	EditText mmeter;
	EditText cmeter;
	EditText kmeter;
	EditText meter;
	EditText inch;
	EditText feet;
	EditText mile;
	EditText yard;
	
	public void setEnabledFalse()
	{
		mmeter.setEnabled(false);
		cmeter.setEnabled(false);
		kmeter.setEnabled(false);
		meter.setEnabled(false);
		inch.setEnabled(false);
		feet.setEnabled(false);
		mile.setEnabled(false);
		yard.setEnabled(false);
	}
	
	public void setEnabledTrue()
	{
		mmeter.setEnabled(true);
		cmeter.setEnabled(true);
		kmeter.setEnabled(true);
		meter.setEnabled(true);
		inch.setEnabled(true);
		feet.setEnabled(true);
		mile.setEnabled(true);
		yard.setEnabled(true);
	}
}
