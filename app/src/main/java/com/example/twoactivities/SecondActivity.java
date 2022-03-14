package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/**
 * SecondActivity defines the second activity in the app. It is
 * launched from an intent with a message, and sends an intent
 * back with a second message.
 */
public class SecondActivity extends AppCompatActivity {
    // Unique tag for the intent reply.
    public static final String EXTRA_REPLY ="com.example.android.MainActivity.extra.REPLY";
    private TextView text_1,text_2,text_3;
    /**
     * Initializes the activity.
     *
     * @param savedInstanceState The current state data
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Initialize view variables.
        text_1 = findViewById(R.id.textView);
        text_2 = findViewById(R.id.textView1);
        text_3 = findViewById(R.id.textView2);
        // Put that message into the text_message TextView


    }
}