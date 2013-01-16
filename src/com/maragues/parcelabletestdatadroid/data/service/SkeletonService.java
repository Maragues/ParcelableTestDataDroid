/**
 * 2011 Foxykeep (http://datadroid.foxykeep.com)
 * <p>
 * Licensed under the Beerware License : <br />
 * As long as you retain this notice you can do whatever you want with this stuff. If we meet some
 * day, and you think this stuff is worth it, you can buy me a beer in return
 */

package com.maragues.parcelabletestdatadroid.data.service;

import android.content.Intent;

import com.foxykeep.datadroid.service.RequestService;
import com.maragues.parcelabletestdatadroid.data.operation.ParcelableOperation;
import com.maragues.parcelabletestdatadroid.data.requestmanager.RequestFactory;
import com.maragues.parcelabletestdatadroid.data.requestmanager.SkeletonRequestManager;

/**
 * This class is called by the {@link SkeletonRequestManager} through the {@link Intent} system.
 *
 * @author Foxykeep
 */
public final class SkeletonService extends RequestService {

    // TODO by default only one concurrent worker thread will be used. If you want to change that,
    // override the getMaximumNumberOfThreads() method

    @Override
    public Operation getOperationForType(int requestType) {
        switch (requestType) {
        case RequestFactory.REQUEST_TYPE_TEST_PARCELABLE:
        	return new ParcelableOperation();
        }
        return null;
    }
}
