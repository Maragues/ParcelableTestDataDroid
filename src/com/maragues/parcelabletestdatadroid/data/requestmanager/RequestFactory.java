/**
 * 2012 Foxykeep (http://datadroid.foxykeep.com)
 * <p>
 * Licensed under the Beerware License : <br />
 * As long as you retain this notice you can do whatever you want with this stuff. If we meet some
 * day, and you think this stuff is worth it, you can buy me a beer in return
 */

package com.maragues.parcelabletestdatadroid.data.requestmanager;

import com.foxykeep.datadroid.requestmanager.Request;
import com.maragues.parcelabletestdatadroid.data.model.City;
import com.maragues.parcelabletestdatadroid.data.operation.ParcelableOperation;

/**
 * Class used to create the {@link Request}s.
 *
 * @author Foxykeep
 */
public final class RequestFactory {

    // Request types
    public static final int REQUEST_TYPE_TEST_PARCELABLE = 0;
    // Response data
    public static final String BUNDLE_EXTRA_CITY =
            "com.foxykeep.datadroidpoc.extra.cityList";

    private RequestFactory() {
        // no public constructor
    }

    /**
     * Create the request to test a parcelable parameter
     *
     * @return The request.
     */
    public static Request getParcelableRequest() {
        Request request = new Request(REQUEST_TYPE_TEST_PARCELABLE);
        City city = new City();
        city.country = "Spain";
        city.name = "Zaragoza";
        city.postalCode = "50012";
        city.state = "AR";
        request.put(ParcelableOperation.PARAM_PARCELABLE, city);
        return request;
    }

}
