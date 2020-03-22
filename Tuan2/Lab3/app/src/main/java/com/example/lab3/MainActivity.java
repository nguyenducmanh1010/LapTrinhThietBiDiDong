package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnOk,btnCanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder btnCanel = new AlertDialog.Builder(MainActivity.this);
        btnCanel.setTitle("Quetstion");
        btnCanel.setMessage("Are You sure you want to exit ?");
        btnCanel.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });btnCanel.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        btnCanel.create().show();


    }
            public void XuatVanBan(View v) {
                switch (v.getId()) {
                    case R.id.btnOk:
                        Toast.makeText(MainActivity.this, "Nhâp thành Công !", Toast.LENGTH_SHORT).show();
                        break;
                }
            }


}

