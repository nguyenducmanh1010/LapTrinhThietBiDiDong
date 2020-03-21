package com.example.androidbasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        //lay ra button theo Id
        Button button1 =(Button) this.findViewById(R.id.go_button1);
        //sét đạt sự kien kich vào button 1
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tao mot intenl
                //mang noi dung sẻ gưi tơi Exampeke active
                Intent myIntent = new Intent(MainActivity1.this,Example1Activity.class);
                //các tham só gắn trên intent(khong bat buoc)
                myIntent.putExtra("text1","this is text");
                myIntent.putExtra("text2","thí is long text");
                //yêu càu chay ExexxempleActivity.
                MainActivity1.this.startActivity(myIntent);
            }
        });


        //lay ra button theo Id2
        Button button2 =(Button) this.findViewById(R.id.go_button2);
        //sét đạt sự kien kich vào button 2
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tao mot intenl
                //mang noi dung sẻ gưi tơi Exampeke active
                Intent myIntent = new Intent(MainActivity1.this,Example2Activity.class);
                //các tham só gắn trên intent(khong bat buoc)
                myIntent.putExtra("text1","this is text");
                myIntent.putExtra("text2","thí is long text");
                //yêu càu chay ExexxempleActivity.
                MainActivity1.this.startActivity(myIntent);
            }
        });
        //lay ra button theo Id3
        Button button3 =(Button) this.findViewById(R.id.go_button3);
        //sét đạt sự kien kich vào button 2
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tao mot intenl
                //mang noi dung sẻ gưi tơi Exampeke active
                Intent myIntent = new Intent(MainActivity1.this,Example3Activity.class);
                //các tham só gắn trên intent(khong bat buoc)
                myIntent.putExtra("text1","this is text");
                myIntent.putExtra("text2","thí is long text");
                //yêu càu chay ExexxempleActivity.
                MainActivity1.this.startActivity(myIntent);
            }

        });


        //lay ra button theo Id4
        Button button4 =(Button) this.findViewById(R.id.go_button4);
        //sét đạt sự kien kich vào button 2
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tao mot intenl
                //mang noi dung sẻ gưi tơi Exampeke active
                Intent myIntent = new Intent(MainActivity1.this,Example4Activity.class);
                //các tham só gắn trên intent(khong bat buoc)
                myIntent.putExtra("text1","this is text");
                myIntent.putExtra("text2","thí is long text");
                //yêu càu chay ExexxempleActivity.
                MainActivity1.this.startActivity(myIntent);
            }

        });

        //lay ra button theo Id5
        Button button5 =(Button) this.findViewById(R.id.go_button5);
        //sét đạt sự kien kich vào button 2
        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tao mot intenl
                //mang noi dung sẻ gưi tơi Exampeke active
                Intent myIntent = new Intent(MainActivity1.this,Example5Activity.class);
                //các tham só gắn trên intent(khong bat buoc)
                myIntent.putExtra("text1","this is text");
                myIntent.putExtra("text2","thí is long text");
                //yêu càu chay ExexxempleActivity.
                MainActivity1.this.startActivity(myIntent);
            }
        });



    }


}
