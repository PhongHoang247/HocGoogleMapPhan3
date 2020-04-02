package com.phong.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.phong.hocgooglemapphan3.R;

public class MyInfoAdapter implements GoogleMap.InfoWindowAdapter {
    Activity context;
    public MyInfoAdapter(Activity context){
        this.context = context;
    }
    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.item_google,null);
        ImageView imgHinh = view.findViewById(R.id.imgHinh);
        TextView txtTen = view.findViewById(R.id.txtTen);
        imgHinh.setImageResource(R.drawable.orionimage);
        txtTen.setText("Orion Guitar Shop");
        return view;
    }
}
