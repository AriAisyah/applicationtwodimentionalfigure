package com.aisyah.applicationtwodimentionalfigure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainjajargenjangActivity extends AppCompatActivity {

    Button btn;
    EditText inputa, inputt;
    TextView hasilnyajg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainjajargenjang);

        btn = findViewById(R.id.btnhitungjg);
        inputa = findViewById(R.id.editTextjga);
        inputt = findViewById(R.id.editTextjgt);
        hasilnyajg = findViewById(R.id.hasilnyajg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float alas = Float.parseFloat(inputa.getText().toString());
                float tinggi = Float.parseFloat(inputt.getText().toString());
                float hasil = alas * tinggi;
                hasilnyajg.setText(hasil + "");
            }
        });

    }
}
