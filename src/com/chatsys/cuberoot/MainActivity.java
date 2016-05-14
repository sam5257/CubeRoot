package com.chatsys.cuberoot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	EditText et;
	TextView tv;
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et = (EditText)findViewById(R.id.etCurrent);
		tv= (TextView)findViewById(R.id.textView2);
		b= (Button)findViewById(R.id.button1);
		b.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		try {
			double num = Double.parseDouble(et.getText().toString());
			
			
			double result = Math.cbrt(num);
			
			tv.setText("Cube root is :\n"+result);
			
		} catch (Exception e) {
			tv.setText("Invalid value");

		}

	}

	

}
