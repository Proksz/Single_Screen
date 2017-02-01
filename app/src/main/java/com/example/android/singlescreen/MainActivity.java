package com.example.android.singlescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ;
    private TextView txtLoc;
    private Button btnLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLoc = (TextView) findViewById(R.id.txtLocation);
        btnLoc = (Button) findViewById(R.id.btnLocation);
        onLocationButtonClicked();
        // Font path
        String fontPath = "fonts/bebas.ttf";

        // text view label
        TextView txtClub = (TextView) findViewById(R.id.header);

        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        txtClub.setTypeface(tf);
    }


    public void onLocationButtonClicked() {
        btnLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtLoc.getVisibility() == View.INVISIBLE)
                {
                    txtLoc.setVisibility(View.VISIBLE);
                }
                else
                {
                    txtLoc.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}



