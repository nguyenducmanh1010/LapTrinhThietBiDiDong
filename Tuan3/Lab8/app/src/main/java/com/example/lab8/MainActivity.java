package com.example.lab8;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goGoogle(View view){
        String url="https://www.google.com/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(intent);

    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP_MR1)
    public void sendEmail(View view){
        String[] recipients = new  String[]{"friendemail@gmail.com"};
        String subject="Hi,How are you!";
        String content="This is my test Email";
        Intent intentEmail = new Intent(Intent.ACTION_SEND,Uri.parse("mailto:"));
        intentEmail.putExtra(Intent.EXTRA_EMAIL,recipients);
        intentEmail.putExtra(Intent.EXTRA_SUBJECT,subject);
        intentEmail.putExtra(Intent.EXTRA_TEXT,content);
        intentEmail.setType("text/plain");
        startActivity(Intent.createChooser(intentEmail,"Choose an email cilent from"));
    }
}
