package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.buttonAct1);
        button.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                        intent.putExtra("t","hello");
                        startActivityForResult(intent,1);
                    }
                });
        Log.d("Myapp","this is activity1");
    }
    protected void onActivityResult(int requestCode,int resultCode, Intent data){
        String str2=data.getStringExtra("tt");
        Log.d("Myapp","this is activity1"+str2);

    }

}