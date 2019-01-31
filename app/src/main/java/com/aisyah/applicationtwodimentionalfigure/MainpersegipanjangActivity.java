package com.aisyah.applicationtwodimentionalfigure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainpersegipanjangActivity extends AppCompatActivity {

    Button btn;
    EditText inputp, inputl;
    TextView hasilnyapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpersegipanjang);
        btn = findViewById(R.id.btnhitungpp);
        inputp = findViewById(R.id.editTextppp);
        inputl = findViewById(R.id.editTextppl);
        hasilnyapp = findViewById(R.id.hasilnyapp);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float panjang = Float.parseFloat(inputp.getText().toString());
                float lebar = Float.parseFloat(inputl.getText().toString());
                float hasil = panjang * lebar;
                hasilnyapp.setText(hasil + "");

            }
        });

    }
}
