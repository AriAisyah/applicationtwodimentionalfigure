package com.aisyah.applicationtwodimentionalfigure;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent a = new Intent(getApplicationContext(),MainActivity.class);
                 startActivity(a);
                 finish();
             }
         },3000);
    }
}
