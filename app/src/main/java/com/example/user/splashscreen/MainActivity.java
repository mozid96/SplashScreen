package com.example.user.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

    }


    public void datapass(View view) {
        if(view.getId()==R.id.button1){
            Intent intent=new Intent(MainActivity.this,CommonActivity.class);
            intent.putExtra("Key","Friendone");
            startActivity(intent);
        }

        if(view.getId()==R.id.button2){
            Intent intent=new Intent(MainActivity.this,CommonActivity.class);
            intent.putExtra("Key","Friendtwo");
            startActivity(intent);
        }
        if(view.getId()==R.id.button3){
            Intent intent=new Intent(MainActivity.this,CommonActivity.class);
            intent.putExtra("Key","Friendthree");
            startActivity(intent);
        }
    }
}
