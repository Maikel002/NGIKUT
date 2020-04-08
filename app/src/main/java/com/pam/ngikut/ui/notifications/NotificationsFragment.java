package com.pam.ngikut.ui.notifications;

import android.app.Activity;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.pam.ngikut.R;

import java.util.List;
import java.util.Locale;

public class NotificationsFragment extends Fragment implements OnMapReadyCallback{
    GoogleMap mGoogleMap;
    MapView mapView;
    View mView;
    Marker currentMarker;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_notifications, container, false);
        return mView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mapView = (MapView) mView.findViewById(R.id.map);
        if (mapView != null) {
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());
        mGoogleMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.719266, 115.168640)).title("Kuta").snippet("Kuta Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.84580465, 115.18508756)).title("Pandawa").snippet("Pandawa Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.7996937, 115.11753076)).title("Dreamland").snippet("Dreamland Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.76573985, 115.22325623)).title("Tanjung Benoa").snippet("Tanjung Benoa, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.706721, 115.2625159)).title("Sanur").snippet("Sanur Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.7808616, 115.163804)).title("Jimbaran").snippet("Jimbaran Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.7035104, 115.16447407)).title("Legian").snippet("Legian Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.8111955, 115.10355117)).title("Padang Padang").snippet("Padang Padang Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.68411215, 115.15236459)).title("Seminyak").snippet("Seminyak Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.8466677, 115.1532026)).title("Karama Kandara").snippet("Karama Kandara Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.6199951, 115.08674466)).title("Tanah Lot").snippet("Tanah Lot Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.707681, 115.4388391)).title("Blue Lagoon").snippet("Blue Lagoon Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.5363233, 115.50895372)).title("Bias Tugel").snippet("Bias Tugel Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.8077956, 115.2318458)).title("Nusa Dua").snippet("Nusa Dua Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.75581267, 115.16500854)).title("Canggu").snippet("Canggu Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.2775419, 115.5928337)).title("Tulamben").snippet("Tulamben Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.4198142, 114.8052192)).title("Medewi").snippet("Medewi Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.3337548, 115.64198612)).title("Amed").snippet("Amed Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.8136256, 115.0923849)).title("Blue Point").snippet("Blue Point Beach, Indonesia"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(-8.6548722, 115.12487156)).title("Echo").snippet("Echo Beach, Indonesia"));


        CameraPosition Liberty = CameraPosition.builder().target(new LatLng(-8.409518, 115.188919)).zoom(9).bearing(0).tilt(0).build();
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(Liberty));
        googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {

                currentMarker = marker;
                marker.showInfoWindow();
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(),15));
                // Zoom in, animating the camera.
                googleMap.animateCamera(CameraUpdateFactory.zoomIn());
                // Zoom out to zoom level 10, animating with a duration of 2 seconds.
                googleMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

                return false;
            }
        });
        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                currentMarker.showInfoWindow();
            }
        });

    }



}
