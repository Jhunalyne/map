package com.example.googlemaps2jhuna;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng balungao = new LatLng(15.902635, 120.701193);
        mMap.addMarker(new MarkerOptions().position(balungao).title("Balungao"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(balungao));

        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.902635, 120.701193))
                .radius(100)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 0, 0, 255)));
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.980597,120.56069))
                .radius(100)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 0, 0, 255)));
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.902635, 120.701193),
                        new LatLng(15.90226, 120.701244),
                        new LatLng(15.90137, 120.69949),
                        new LatLng(15.899913, 120.697461),
                        new LatLng(15.898531, 120.694349),
                        new LatLng(15.898087, 120.694102),
                        new LatLng(15.898077, 120.693024),
                        new LatLng(15.897334, 120.697231),
                        new LatLng(15.896364, 120.683690),
                        new LatLng(15.896735, 120.680429),
                        new LatLng(15.897932, 120.673970),
                        new LatLng(15.895476, 120.666958),
                        new LatLng(15.894434, 120.665596),
                        new LatLng(15.893144, 120.660457),
                        new LatLng(15.893784, 120.656155),
                        new LatLng(15.895530, 120.652107),
                        new LatLng(15.895466, 120.650688),
                        new LatLng(15.896663, 120.644594),
                        new LatLng(15.895714, 120.641826),
                        new LatLng(15.895312, 120.640099),
                        new LatLng(15.89294, 120.63436),
                        new LatLng(15.970590, 120.568950),
                        new LatLng(15.970161, 120.585141),
                        new LatLng(15.973376, 120.584515),
                        new LatLng(15.973578, 120.584728),
                        new LatLng(15.974606, 120.584783),
                        new LatLng(15.976805, 120.585020),
                        new LatLng(15.975866, 120.574357),
                        new LatLng(15.975928, 120.570730),
                        new LatLng(15.979253, 120.570991),
                        new LatLng(15.978930, 120.565683),
                        new LatLng(15.98171, 120.560137),
                        new LatLng(15.980597,120.56069))
                .width(10)
                .color(Color.BLUE));




    }
}