package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AccountInfo;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import org.microg.gms.location.FusedLocationProviderApiImpl;
import org.microg.gms.location.GeofencingApiImpl;
import org.microg.gms.location.LocationClientImpl;

/**
 * The main entry point for location services integration.
 */
public class LocationServices {
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>(
            new Api.Builder<Api.ApiOptions.NoOptions>() {
                @Override
                public Api.Connection build(Context context, Looper looper,
                        Api.ApiOptions.NoOptions options,
                        AccountInfo accountInfo, GoogleApiClient.ConnectionCallbacks callbacks,
                        GoogleApiClient.OnConnectionFailedListener connectionFailedListener) {
                    return new LocationClientImpl(context);
                }
            });
    public static final FusedLocationProviderApi FusedLocationApi = new FusedLocationProviderApiImpl();
    public static final GeofencingApi GeofencingApi = new GeofencingApiImpl();
}