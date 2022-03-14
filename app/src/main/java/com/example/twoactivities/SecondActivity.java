package com.example.twoactivities;
//import required library
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    //private Textview
    private TextView countValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the intent that launched this activity, and the message in
        // the intent extra.
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Put that message into the text_message TextView
        countValue=findViewById(R.id.count_value);
        countValue.setText(message);
    }
}