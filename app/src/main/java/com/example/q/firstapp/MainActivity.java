package com.example.q.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    private int count = 0;


    @BindView(R.id.clickMeButton) Button clickMeButton;
    @BindView(R.id.counterTextView) TextView counterTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        clickMeButton.setText("Increment");
        counterTextView.setText("Count: ");

        clickMeButton.setOnClickListener(this::increment);

    }

    public void increment(View view) {
        count++;
        counterTextView.setText("Count: " + count);
    }

    private void startTestActivity() {
        Intent intent = new Intent(MainActivity.this, TestActivity.class);
        startActivity(intent);
    }
}
