//lucas

package com.pressure;


import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public int rb1,rb2;
	public String add=" ";
	
	public void checkChoice1(View view)
	{
		if(view.getId()==R.id.psi)
		{
			rb1=1;
		}
		else if(view.getId()==R.id.atm)
		{
			rb1=2;
		}
		else if(view.getId()==R.id.bar)
		{
			rb1=3;
		}
		else if(view.getId()==R.id.mpa)
		{
			rb1=4;
		}
	}
	
	public void checkChoice2(View view)
	{
		if(view.getId()==R.id.psi2)
		{
			rb2=1;
		}
		else if(view.getId()==R.id.atm2)
		{
			rb2=2;
		}
		else if(view.getId()==R.id.bar2)
		{
			rb2=3;
		}
		else if(view.getId()==R.id.mpa2)
		{
			rb2=4;
		}
	}
	
	public void przelicz(View view)
	{
		Double wart;
		DecimalFormat df = new DecimalFormat("#.##");
		EditText et = (EditText)findViewById(R.id.editText1);
		TextView tv = (TextView)findViewById(R.id.textView1);
		if(et.getText().toString().equals(""))
			wart=0.0;
		else
			wart=Double.parseDouble(et.getText().toString());
		if(rb1==1 && rb2==1)
		{
			wart=wart+0;
			add=" PSI";
		}
		else if(rb1==1 && rb2==2)
		{
			wart=wart*0.068045;
			add=" ATM";
		}
		else if(rb1==1 && rb2==3)
		{
			wart=wart*0.068947;
			add=" BAR";
		}
		else if(rb1==1 && rb2==4)
		{
			wart=wart*0.006894;
			add=" MPa";
		}
		else if(rb1==2 && rb2==1)
		{
			wart=wart*14.6959;
			add=" PSI";
		}
		else if(rb1==2 && rb2==2)
		{
			wart=wart+0;
			add=" ATM";
		}
		else if(rb1==2 && rb2==3)
		{
			wart=wart*1.01325;
			add=" BAR";
		}
		else if(rb1==2 && rb2==4)
		{
			wart=wart*0.101325;
			add=" MPa";
		}
		else if(rb1==3 && rb2==1)
		{
			wart=wart*14.5037;
			add=" PSI";
		}
		else if(rb1==3 && rb2==2)
		{
			wart=wart*0.9869;
			add=" ATM";
		}
		else if(rb1==3 && rb2==3)
		{
			wart=wart+0;
			add=" BAR";
		}
		else if(rb1==3 && rb2==4)
		{
			wart=wart*0.1;
			add=" MPa";
		}
		else if(rb1==4 && rb2==1)
		{
			wart=wart*145.0377;
			add=" PSI";
		}
		else if(rb1==4 && rb2==2)
		{
			wart=wart*9.8692;
			add=" ATM";
		}
		else if(rb1==4 && rb2==3)
		{
			wart=wart*10;
			add=" BAR";
		}
		else if(rb1==4 && rb2==4)
		{
			wart=wart+0;
			add=" MPa";
		}
		tv.setText(df.format(wart)+add);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
