package com.example.lap7_vd3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_INPUT=113;
    public static final int RESULT_CODE_SAVE1=115;
    public static final int RESULT_CODE_SAVE2=116;
    Button btnInPutData;
    ListView lvData;
    ArrayList<Integer>arrData = new ArrayList<>();
    ArrayAdapter<Integer>adapter =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInPutData =findViewById(R.id.btnopenactivity);
        btnInPutData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,InputDataActivity.class);
                startActivityForResult(intent,REQUEST_CODE_INPUT);
            }
        });
        lvData=findViewById(R.id.lvdata);
        adapter = new ArrayAdapter<Integer>(
                this,android.R.layout.simple_list_item_1,arrData
        );
        lvData.setAdapter(adapter);
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==REQUEST_CODE_INPUT){
            switch (resultCode){
                case RESULT_CODE_SAVE1:
                    int v1=data.getIntExtra("data",0);
                    arrData.add(v1*v1);
                    adapter.notifyDataSetChanged();
                    break;
                case RESULT_CODE_SAVE2:
                         int v2=data.getIntExtra("data",0);
                 arrData.add(v2);
                 adapter.notifyDataSetChanged();
                 break;
            }
        }
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
