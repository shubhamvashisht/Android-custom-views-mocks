package com.example.droidman.customviewmock;

import com.example.droidman.customviewmock.customviews.ProgressCircle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    ProgressCircle speedProgressCircle;
    ProgressCircle accuracyProgressCircle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.company_name);
        setContentView(R.layout.activity_main);
        speedProgressCircle = (ProgressCircle)findViewById(R.id.speed_circle);
        speedProgressCircle.setValue(80);
        speedProgressCircle.setStrokeColor(getResources().getColor(R.color.speed_circle_stroke));
        speedProgressCircle.setFillColor(getResources().getColor(R.color.speed_circle_fill));
        speedProgressCircle.setStrokeWidth(10);

        accuracyProgressCircle = (ProgressCircle)findViewById(R.id.accuracy_circle);
        accuracyProgressCircle.setValue(20);
        accuracyProgressCircle.setStrokeColor(getResources().getColor(R.color.accuracy_circle_stroke));
        accuracyProgressCircle.setFillColor(getResources().getColor(R.color.accuracy_circle_fill));
        accuracyProgressCircle.setStrokeWidth(10);
    }
}
//#4B4481
//#956A36