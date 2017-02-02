package com.introtoandriod.inclass_activity_01_keane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    final DatePicker date = (DatePicker) findViewById(R.id.DatePicker01);
    ProgressBar mProgress = (ProgressBar) findViewById(R.id.progressBar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgress.setProgress(75);
    }

}
