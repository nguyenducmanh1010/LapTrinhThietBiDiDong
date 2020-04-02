package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String arr[]={"Mạnh","Bảo","Văn","Thiên"};
        ListView lv= findViewById(R.id.lv1);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1,arr
        );
        lv.setAdapter(adapter);
        final TextView txt =findViewById(R.id.txt1);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txt.setText("position:"+position+";value="+arr[position]);
            }
        });
    }
}
