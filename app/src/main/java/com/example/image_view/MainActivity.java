package com.example.image_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 private RadioButton rdoRajesh, rdoAnmol, rdoDaya;
 private ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdoRajesh = findViewById(R.id.rdoRajesh);
        rdoAnmol = findViewById(R.id.rdoAnmol);
        rdoDaya = findViewById(R.id.rdoDaya);
        imgView = findViewById(R.id.imgV);

        rdoRajesh.setOnClickListener(this);
        rdoDaya.setOnClickListener(this);
        rdoAnmol.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId() ) {

            case R.id.rdoRajesh:

                Toast toast1= Toast.makeText(this, "Rajesh dai ko photo", Toast.LENGTH_LONG) ;
                toast1.show();

                imgView.setImageResource(R.drawable.raj);
                break;



            case R.id.rdoAnmol:
                Toast toast2= Toast.makeText(this, "Anmol bhai ko photo", Toast.LENGTH_LONG) ;
                toast2.show();

                imgView.setImageResource(R.drawable.anmol);
                break;

            case R.id.rdoDaya:
                Toast toast3= Toast.makeText(this, "Dai vanyo vane ma last risauxu hai guys", Toast.LENGTH_LONG) ;
                toast3.show();

                imgView.setImageResource(R.drawable.daya);
                break;
        }

    }
}
