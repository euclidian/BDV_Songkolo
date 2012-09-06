package com.phinisi.whentag.window;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.phinisi.whentag.R;
import com.phinisi.whentag.adapter.MyExpandableListAdapter;
import com.phinisi.whentag.data.Appoinment;

public class MainWindow extends CustomWindow {

	private MyExpandableListAdapter mAdapter;
	
	List<List<Appoinment>> data = new ArrayList<List<Appoinment>>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//this.buttonImg.setBackgroundDrawable(Drawable.createFromPath("@drawable/tambah"));
		this.buttonImg.setImageResource(R.drawable.tambah);
		
		setContentView(R.layout.mainwindow);		
		
		for(int i=0;i<10;i++)
		{
			ArrayList<Appoinment> app1 = new ArrayList<Appoinment>();
			
			app1.add(new Appoinment("Me", "Title", "Subject Saya", "Tempat", new DateTime()));
			data.add(app1);
		}
		

		ExpandableListView listView = (ExpandableListView) findViewById(R.id.list_expend);
		
		mAdapter = new MyExpandableListAdapter(data,listView,this);
		
		listView.setAdapter(mAdapter);	
	}
}
