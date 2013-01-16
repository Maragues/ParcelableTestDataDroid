/**
 *
 */
package com.maragues.parcelabletestdatadroid;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

import com.foxykeep.datadroid.requestmanager.Request;
import com.maragues.parcelabletestdatadroid.data.requestmanager.SkeletonRequestManager;

/**
 * @author Foxykeep
 *
 */
public abstract class DataDroidActivity extends Activity {

    private static final String SAVED_STATE_REQUEST_LIST = "savedStateRequestList";

    protected SkeletonRequestManager mRequestManager;
    protected ArrayList<Request> mRequestList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRequestManager = SkeletonRequestManager.from(this);

        if (savedInstanceState != null) {
            mRequestList = savedInstanceState.getParcelableArrayList(SAVED_STATE_REQUEST_LIST);
        } else {
            mRequestList = new ArrayList<Request>();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putParcelableArrayList(SAVED_STATE_REQUEST_LIST, mRequestList);
    }
}
