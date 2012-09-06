package com.phinisi.whentag.adapter;

import java.util.ArrayList;
import java.util.List;


import com.phinisi.whentag.R;
import com.phinisi.whentag.data.Appoinment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

public class MyExpandableListAdapter extends BaseExpandableListAdapter {

	List<List<Appoinment>> data = new ArrayList<List<Appoinment>>();
	Context ctx;
	int lastExpandedGroupPosition = -999;
	ExpandableListView accordionView;
	
	public MyExpandableListAdapter(List<List<Appoinment>> data,ExpandableListView view, Context ctx){
		this.data = data;
		this.ctx = ctx;
		this.accordionView = view;
	}
	
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return data.get(groupPosition).get(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return childPosition;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return data.get(groupPosition).size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return data.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}
	
	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		View inflatedView = View.inflate(ctx.getApplicationContext(), R.layout.expandable_child, null);
		inflatedView.setPadding(5, 0, 0, 5);
//		TextView txt_subject = (TextView) inflatedView.findViewById(R.id.txt_subject);
//		TextView txt_place = (TextView) inflatedView.findViewById(R.id.txt_place);
//		TextView txt_time = (TextView) inflatedView.findViewById(R.id.txt_time);
//		
//		Appoinment currAppoinment = data.get(groupPosition).get(childPosition);
//		txt_subject.setText(currAppoinment.subject);
//		txt_place.setText(currAppoinment.place);
//				
//		String dateString = currAppoinment.dateAndTime.toString();
//		txt_time.setText(dateString);
		
		return inflatedView;
		//return null;
	}

	
	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		//TextView textView = getGenericView();
		//textView.setText(data.get(groupPosition).get(0).title + " Tagged By()");
		//TextView textView = (TextView) convertView.findViewById(R.id.textView1);
		//textView.setText("asdasdsad");
		//return textView;
		View inflatedView = View.inflate(ctx.getApplicationContext(),R.layout.expandable_group,null);
		TextView txt_title = (TextView) inflatedView.findViewById(R.id.titleGroup);
		txt_title.setText(data.get(groupPosition).get(0).title);
		ImageView imgView = (ImageView) inflatedView.findViewById(R.id.arrow_group);
		if(isExpanded)
			imgView.setImageResource(R.drawable.arrow_up);
		else
			imgView.setImageResource(R.drawable.arrow_down);
		return inflatedView;
	}

	
	public TextView getGenericView() {
		// Layout parameters for the ExpandableListView
		AbsListView.LayoutParams lp = new AbsListView.LayoutParams(
				ViewGroup.LayoutParams.FILL_PARENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		
		TextView textView = new TextView(ctx);
		
		textView.setLayoutParams(lp);

		textView.setPadding(60, 5, 0, 5);
		//textView.setTextAppearance(getBaseContext(), R.style.TitleText);
		return textView;
	}
	
	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void onGroupExpanded(int groupPosition) {
		// TODO Auto-generated method stub
		if(groupPosition != lastExpandedGroupPosition && lastExpandedGroupPosition >= 0){
			accordionView.collapseGroup(lastExpandedGroupPosition);
		}
		super.onGroupExpanded(groupPosition);
		lastExpandedGroupPosition = groupPosition;		
	}
	

}
