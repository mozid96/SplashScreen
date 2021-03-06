package com.example.user.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Thread thread=new Thread()
        {
           @Override
            public void run()
           {
               try {
                   sleep(5000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               finally {
                   Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                   startActivity(intent);

               }
           }




        };
        thread.start();
    }
}
