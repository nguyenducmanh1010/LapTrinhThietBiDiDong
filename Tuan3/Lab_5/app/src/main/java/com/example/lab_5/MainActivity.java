package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText textView1,etSoa,etSob;
Button btnCong,btnTru,btnNhan,btnChia;
TextView txtKetQua;

OnClickListener myclick = new OnClickListener() {
    @Override
    public void onClick(View arg0) {
        switch(arg0.getId())
        {
            case R.id.btnCong:
                String sa=etSoa.getText()+"";
                String sb=etSob.getText().toString();
                int a=Integer.parseInt(sa);
                int b=Integer.parseInt(sb);
                txtKetQua.setText(a+"+"  +b +" = "+(a+b));


                break;
            case R.id.btnTru:
                String sc = etSoa.getText()+ "";
                String sd = etSob.getText().toString();
                int c=Integer.parseInt(sc);
                int d = Integer.parseInt(sd);
                txtKetQua.setText(c+ "-" +d+ "=" +(c-d));
               break;
            case R.id.btnNhan:
                String se = etSoa.getText()+ "";
                String sf = etSob.getText().toString();
                int e=Integer.parseInt(se);
                int f = Integer.parseInt(sf);
                txtKetQua.setText(e+ "*" +f+ "=" +(e*f));
                break;
            case R.id.btnChia:
                String sg = etSoa.getText()+ "";
                String sh = etSob.getText().toString();
                float g=Integer.parseInt(sg);
                float h = Integer.parseInt(sh);
                txtKetQua.setText(g+ "/" +h+ "=" +(g/h));
                break;
        }
    }
};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        textView1 = findViewById(R.id.textView1);
//        textView1.setText("Hello teof");
//        String msg =textView1.getText().toString();

        btnCong =findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia =findViewById(R.id.btnChia);
        etSoa =findViewById(R.id.etSoa);
        etSob=findViewById(R.id.etSob);
        txtKetQua=findViewById(R.id.txtKetQua);
        btnChia.setOnClickListener(myclick);
        btnNhan.setOnClickListener(myclick);
        btnTru.setOnClickListener(myclick);
        btnCong.setOnClickListener(myclick);

    }
}
