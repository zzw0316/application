package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String str=intent.getStringExtra("t");
        Log.d("Myapp","this is activity2"+str);
        Intent intent2=new Intent();
        intent2.putExtra("tt","hello2");
        this.setResult(2,intent2);
        this.finish();
    }
}
