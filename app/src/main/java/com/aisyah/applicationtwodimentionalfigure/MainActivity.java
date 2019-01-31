package com.aisyah.applicationtwodimentionalfigure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnpindah1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),MainpersegiActivity.class);
                startActivity(a);

            }
        });

       Button btn2 = findViewById(R.id.btnpindah2);
       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent a = new Intent(getApplicationContext(), MainjajargenjangActivity.class);
               startActivity(a);

           }

       });

        Button btn3 = findViewById(R.id.btnpindah3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),MainpersegipanjangActivity.class);
                startActivity(a);

            }
        });

    }
}
