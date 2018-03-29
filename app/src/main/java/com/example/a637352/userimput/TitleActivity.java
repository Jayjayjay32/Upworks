package com.example.a637352.userimput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }

    public void start(View view) {
        Intent myIntent = new Intent(this, GameActivity.class);
        startActivity(myIntent);
    }
}
