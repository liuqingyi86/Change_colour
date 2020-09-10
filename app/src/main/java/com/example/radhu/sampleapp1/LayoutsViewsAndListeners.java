package com.example.radhu.sampleapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LayoutsViewsAndListeners extends AppCompatActivity {
    LinearLayout background;
    Button buttonRed, buttonBlue,buttonGreen ;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts_views_and_listeners);
        background = (LinearLayout) findViewById(R.id.background);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        textView = (TextView) findViewById(R.id.textView);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.RED);
                textView.setTextColor(Color.WHITE);
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.BLUE);
                textView.setTextColor(Color.WHITE);

            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.GREEN);
                textView.setTextColor(Color.WHITE);

            }
        });


    }


}

