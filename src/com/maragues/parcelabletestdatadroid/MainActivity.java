package com.maragues.parcelabletestdatadroid;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import com.foxykeep.datadroid.requestmanager.Request;
import com.foxykeep.datadroid.requestmanager.RequestManager.RequestListener;
import com.maragues.parcelabletestdatadroid.data.requestmanager.RequestFactory;

public class MainActivity extends DataDroidActivity  implements RequestListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.button).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				callParcelableRequest();
			}
		});
	}

	private void callParcelableRequest() {
		Request request = RequestFactory.getParcelableRequest();

		mRequestManager.execute(request, this);
		mRequestList.add(request);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onRequestFinished(Request request, Bundle resultData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRequestConnectionError(Request request, int statusCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRequestDataError(Request request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRequestCustomError(Request request, Bundle resultData) {
		// TODO Auto-generated method stub
		
	}

}
