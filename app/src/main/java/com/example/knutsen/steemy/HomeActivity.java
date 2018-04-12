package com.example.knutsen.steemy;

import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    Vibrator mapVibrator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
        configureMapButton();
        mapVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);





    }

    public void onClick(View v){
        Intent myIntent = new Intent(this, MapsActivity.class);
        startActivity(myIntent);

    }

    private void configureMapButton()
    {
        Button mapButton = (Button)findViewById(R.id.map);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MapsActivity.class));
                mapVibrator.vibrate(50);
            }
        });
    }
}

