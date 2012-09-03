package com.phinisi.whentag.window;

import com.phinisi.whentag.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomWindow extends Activity {

	/**
	 * Text View Sebelah Kanan Title Window
	 */
	protected TextView title;
	/**
	 * Icon Sebelah Kanan
	 */
	protected ImageView icon;
	/**
	 * Button di sebelah kanan
	 */
	protected ImageButton buttonImg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		
		setContentView(R.layout.main);
		
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.window_title);
		
		title = (TextView) findViewById(R.id.title);
		icon = (ImageView) findViewById(R.id.icon);
		buttonImg = (ImageButton) findViewById(R.id.btn_icon);
				
	}
	
	
}
