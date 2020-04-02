package com.example.lap7_vd2;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {
    TextView textKetQua;
    Button btnBack;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textKetQua = findViewById(R.id.textKetQua);
        btnBack = findViewById(R.id.btnBack);
        Intent callerIntent=getIntent();
        Bundle packageFromaCaller= callerIntent.getBundleExtra("MyPackage");
        int a =packageFromaCaller.getInt("soa");
        int b =packageFromaCaller.getInt("sob");
        giaipt(a,b);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void giaipt(int a,int b){
        String kq = "";
        if (a==0 && b == 0){
            kq = "Vô số nghiệm";

        }
        else if (a==0 && b !=0){
            kq="Vô Ngiệm";
        }else {
            DecimalFormat decimalFormat =new DecimalFormat("0.##");
            kq=decimalFormat.format(-b*1.0/a);
        }
        textKetQua.setText(kq);
    }
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_result,menu);
        return true;
    }
}
