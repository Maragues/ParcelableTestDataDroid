/**
 * 2011 Foxykeep (http://datadroid.foxykeep.com)
 * <p>
 * Licensed under the Beerware License : <br />
 * As long as you retain this notice you can do whatever you want with this stuff. If we meet some
 * day, and you think this stuff is worth it, you can buy me a beer in return
 */

package com.maragues.parcelabletestdatadroid.data.operation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

import com.foxykeep.datadroid.exception.ConnectionException;
import com.foxykeep.datadroid.exception.DataException;
import com.foxykeep.datadroid.requestmanager.Request;
import com.foxykeep.datadroid.service.RequestService.Operation;
import com.maragues.parcelabletestdatadroid.data.model.City;

public final class ParcelableOperation implements Operation {
	
	public static final String PARAM_PARCELABLE = "extra_param_parcelable";

    @Override
    public Bundle execute(Context context, Request request) throws ConnectionException,
            DataException {
		Parcelable parcelable = request.getParcelable(PARAM_PARCELABLE);
		
		if(parcelable instanceof City){
			Log.d("Op","City name: "+((City)parcelable).name);
		}

        return new Bundle();
    }
}
