package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void XuatHienVanBan(View v){
        switch (v.getId()){
            case R.id.btnNewButton :
                Toast.makeText(MainActivity.this,"HelloAndroid",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
