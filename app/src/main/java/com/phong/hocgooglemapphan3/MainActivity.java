package com.phong.hocgooglemapphan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moGoogleMap(View view) {
        Intent intent = new Intent(MainActivity.this,MapsActivity.class);
        startActivity(intent);
    }
}
