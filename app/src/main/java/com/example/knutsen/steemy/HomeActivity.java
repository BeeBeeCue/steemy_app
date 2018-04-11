package com.example.knutsen.steemy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView thermometer = (TextView) findViewById(R.id.tempView);
        thermometer.setBackgroundResource(R.drawable.thermometer);
        TextView battLevel = (TextView) findViewById(R.id.batteryView);
        battLevel.setBackgroundResource(R.drawable.battery);
        TextView humidity = (TextView) findViewById(R.id.humView);
        humidity.setBackgroundResource(R.drawable.humidity);
        TextView lumens = (TextView) findViewById(R.id.lumView);
        lumens.setBackgroundResource(R.drawable.sun);
        TextView pressure = (TextView) findViewById(R.id.pressView);
        pressure.setBackgroundResource(R.drawable.pressure);
        ImageView cabin_Main = (ImageView) findViewById(R.id.cabinMain);
        cabin_Main.setImageResource(R.drawable.cabin);
    }
}
