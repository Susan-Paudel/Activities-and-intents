package com.example.twoactivities;
//import required library
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
        //super keyword is used to refer parent class object
        super.onCreate(savedInstanceState);
        //it set the XML file as your main layout when the app starts
        setContentView(R.layout.activity_main);
    }
    //when text_1 button is clicked
    public void text_1(View view) {
        //creating the object of Intent
        Intent intent = new Intent(this, SecondActivity.class);
        //passing the value with extra message
        intent.putExtra(EXTRA_MESSAGE, "text_one");
        //redirect to next page
        startActivity(intent);
    }
    //when text_2 button is clicked
    public void text_2(View view) {
        //creating the object of Intent
        Intent intent = new Intent(this, SecondActivity.class);
        //passing the value with extra message
        intent.putExtra(EXTRA_MESSAGE, "text_two");
        //redirect to next page
        startActivity(intent);
    }
    //when text_3 button is clicked
    public void text_3(View view) {
        //creating the object of Intent
        Intent intent = new Intent(this, SecondActivity.class);
        //passing the value with extra message
        intent.putExtra(EXTRA_MESSAGE, "text_three");
        //redirect to next page
        startActivity(intent);
    }
}