package com.example.twoactivities;

import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/**
 * The TwoActivities app contains two activities and sends messages
 * (intents) between them.
 */
public class MainActivity extends AppCompatActivity {
    // Class name for Log tag
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Unique tag required for the intent extra
    public static final String EXTRA_MESSAGE = "com.example.android.SecondActivity.extra.MESSAGE";
    // Unique tag for the intent reply
    public static final int TEXT_REQUEST = 1;
   //private button
    private Button Button_1,Button_2,Button_3;
    /**
     * Initializes the activity.
     *
     * @param savedInstanceState The current state data.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find view by id for each button
        Button_1=findViewById(R.id.text_one);
        Button_2=findViewById(R.id.text_two);
        Button_3=findViewById(R.id.text_three);
    }
    public void text_1(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void text_2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void text_3(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}