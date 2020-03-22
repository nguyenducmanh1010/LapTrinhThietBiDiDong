package com.example.lab4;

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

    public void doSave(View v){
        switch (v.getId()){
            case R.id.btnSave:
                Toast.makeText(MainActivity.this,"Lưu Thành Công",Toast.LENGTH_SHORT)
                        .show();
                break;
        }
    }
}
