package com.example.image_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 private RadioButton rdoRajesh, rdoAnmol, rdoDaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdoRajesh = findViewById(R.id.rdoRajesh);
        rdoAnmol = findViewById(R.id.rdoAnmol);
        rdoDaya = findViewById(R.id.rdoDaya);

        rdoRajesh.setOnClickListener(this);
        rdoDaya.setOnClickListener(this);
        rdoAnmol.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId() ) {

            case R.id.rdoRajesh:
                break;

            case R.id.rdoAnmol:
                break;

            case R.id.rdoDaya:
                break;
        }

    }
}
