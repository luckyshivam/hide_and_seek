package com.example.hideandseek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
private ToggleButton toggleButton;
private TextView resultview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultview= (TextView) findViewById(R.id.hellobutterfly);
        toggleButton=(ToggleButton) findViewById(R.id.toggleButtonid);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    resultview.setVisibility(View.VISIBLE);
                } else {
                    resultview.setVisibility(View.INVISIBLE);

                }
            }
        });
    }
}