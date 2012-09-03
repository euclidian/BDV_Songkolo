package com.phinisi.whentag.window;

import com.phinisi.whentag.R;

import android.os.Bundle;

public class MainWindow extends CustomWindow {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mainwindow);
		this.title.setText("Halo Kk");
	}
}
