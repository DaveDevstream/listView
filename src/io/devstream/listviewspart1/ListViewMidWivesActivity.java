package io.devstream.listviewspart1;

import java.util.ArrayList;

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

public class ListViewMidWivesActivity extends Activity {
	private ListView listView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_layout);
		listView = (ListView) findViewById(R.id.list);
		
		Midwife mw1 = new Midwife();
		mw1.setName("Mary");
		mw1.setLastName("Byrne");
		mw1.setAge(33);
		
		Midwife mw2 = new Midwife();
		mw2.setName("Joe");
		mw2.setLastName("Dunne");
		mw2.setAge(43);
		
		final ArrayList<String> mwArray = new ArrayList<String>();
		mwArray.add(mw1.toString());
		mwArray.add(mw2.toString());


		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_layout, R.id.text_1, mwArray);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(
						getApplicationContext(),
						mwArray.get(position) + "... Position: "
								+ String.valueOf(position) + "... id: "
								+ String.valueOf(id), Toast.LENGTH_SHORT)
						.show();
				// Toast.makeText(getApplicationContext()," Position: "+String.valueOf(position),
				// Toast.LENGTH_SHORT).show();
				// Toast.makeText(getApplicationContext()," id: "+String.valueOf(id),
				// Toast.LENGTH_SHORT).show();

			}

		});

	}

}
