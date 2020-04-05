package com.example.lab_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private boolean binded = false;
private WeatherService weatherService;
private EditText locationText;
private TextView weatherText;
ServiceConnection weatherServiceConnection = new ServiceConnection() {
    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        WeatherService.LocalWeatherBinder binder =(WeatherService.LocalWeatherBinder)service;
        weatherService =binder.getService();
        binded =true;
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        binded=false;
    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weatherText=findViewById(R.id.txt_weather);
        locationText=findViewById(R.id.etHaNoi);

    }
    protected void onStart(){
        super.onStart();
        Intent intent=new Intent(this,WeatherService.class);
        this.bindService(intent,weatherServiceConnection, Context.BIND_AUTO_CREATE);
    }
    protected void onStop(){
        super.onStop();
        if (binded){
            this.unbindService(weatherServiceConnection);
            binded=false;
        }

    }
    public void showWeather(View v){
        String location = locationText.getText().toString();
        String weather =this.weatherService.getWeatherToday(location);
        weatherText.setText(weather);
    }
}
