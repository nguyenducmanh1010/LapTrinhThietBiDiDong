package com.example.lap7_vd2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnkq;
TextView txta,txtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txta = findViewById(R.id.textViewa);
        txtb = findViewById(R.id.textViewb);
        btnkq = findViewById(R.id.btnkq);
        btnkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,ResultActivity.class);
                Bundle bundle=new Bundle();
                int a = Integer.parseInt(txta.getText().toString());
                  int b = Integer.parseInt(txtb.getText().toString());

                bundle.putInt("soa",a);
                bundle.putInt("sob",b);
                myIntent.putExtra("Mypackage",bundle);
                startActivity(myIntent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);

        return true;
    }
}
