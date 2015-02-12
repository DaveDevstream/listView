package io.devstream.listviewspart1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends Activity {
	private ListView listView;
	private String [] osNames;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_layout);
		listView = (ListView)findViewById(R.id.list);
		
		osNames = new String [] {"Lollipop","Icecream","kit-kat","eclair","choc-ice","gingerbread"};
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,R.layout.list_layout,R.id.text_1,osNames);
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), osNames[position] + "... Position: "+String.valueOf(position) +"... id: "+String.valueOf(id), Toast.LENGTH_SHORT).show();
				//Toast.makeText(getApplicationContext()," Position: "+String.valueOf(position), Toast.LENGTH_SHORT).show();
				//Toast.makeText(getApplicationContext()," id: "+String.valueOf(id), Toast.LENGTH_SHORT).show();
				
			}
			
		});
		
	}
	
	
}
