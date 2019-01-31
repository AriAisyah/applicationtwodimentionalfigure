package com.aisyah.applicationtwodimentionalfigure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainpersegiActivity extends AppCompatActivity {

    Button btn;
    EditText input;
    TextView hasilnyap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpersegi);
        btn=findViewById(R.id.btnhitungp);
        input=findViewById(R.id.editTextp);
        hasilnyap=findViewById(R.id.hasilnyap);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sisi = Float.parseFloat(input.getText().toString());
                float hasil = sisi * sisi;
                hasilnyap.setText(hasil + "");
            }
        });
    }
}
