package com.example.lap7_vd3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputDataActivity extends AppCompatActivity {
Button btnSave1,btnSave2;
EditText editNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);
        btnSave1=findViewById(R.id.btnSave1);
        btnSave2=findViewById(R.id.btnSave2);
        editNumber=findViewById(R.id.etNumber);
        btnSave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToMain(MainActivity.RESULT_CODE_SAVE1);
            }
        });
        btnSave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToMain(MainActivity.RESULT_CODE_SAVE2);
            }
        });
    }
    public void  sendToMain(int resultcode){
        Intent intent=getIntent();
        int value=  Integer.parseInt(editNumber.getText()+"");
        intent.putExtra("data",value);
        setResult(resultcode,intent);
        finish();
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_input_data, menu);
        return true;
    }
}
