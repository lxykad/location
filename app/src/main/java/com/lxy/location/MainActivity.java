package com.lxy.location;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LocationManager mLocationManager;
    private Location mLoc = null;
    private LocationListener mListener = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        //获取可用的位置信息Provider.即passive,network,gps中的一个或几个
        List<String> providers = mLocationManager.getProviders(true);
        Log.d("location", "latitude======providers====" + providers);


        //GPS

        mLoc = mLocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        if(mLoc!=null){

        }else {

        }

    }

    public void getLoc(View view) {

        Log.d("location", "latitude========00");
//        Toast.makeText(MainActivity.this, "loc", Toast.LENGTH_SHORT).show();
//        if (mLoc == null) {
//            Log.d("location", "latitude========null");
//        } else {
//            double latitude = mLoc.getLatitude();
//            double longitude = mLoc.getLongitude();
//            Log.d("location", "latitude=====" + latitude + ":::::::::longitude=====" + longitude);
//        }

    }

}
