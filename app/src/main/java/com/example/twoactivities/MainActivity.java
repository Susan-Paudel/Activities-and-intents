package com.example.twoactivities;
//import required library
import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//MinActivity child class inherit all the property of AppCompatActivity i.e. parent
public class MainActivity extends AppCompatActivity {
    // Class name for Log tag
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Unique tag required for the intent extra
    public static final String EXTRA_MESSAGE = "com.example.android.SecondActivity.extra.MESSAGE";
    // EditText view for the message
    private EditText mMessageEditText;
    // Unique tag for the intent reply
    public static final int TEXT_REQUEST = 1;
    // TextView for the reply header
    private TextView mReplyHeadTextView;
    // TextView for the reply body
    private TextView mReplyTextView;
    /**
     * Initializes the activity.
     *
     * @param savedInstanceState The current state data.
     * Activities have the ability,to restore themselves to a previous state using the data stored in this bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super keyword is used to refer parent class object
        super.onCreate(savedInstanceState);
        //it set the XML file as your main layout when the app starts
        setContentView(R.layout.activity_main);

        // Initialize all the view variables.
        mMessageEditText = findViewById(R.id.editText_main);
        mReplyHeadTextView = findViewById(R.id.text_header_reply);
        mReplyTextView = findViewById(R.id.text_message_reply);
    }
    /**
     * Handles the onClick for the "Send" button. Gets the value of the main EditText,
     * creates an intent, and launches the second activity with that intent.
     *
     * The return intent from the second activity is onActivityResult().
     *
     * @param view The view (Button) that was clicked.
     * The TwoActivities app contains two activities and sends messages
     * (intents) between them.
     */
    public void launchSecondActivity(View view) {
        //display Button clicked in logcat
        Log.d(LOG_TAG, "Button clicked!");
        /**
         * creating object of Intent class
         * @param this focus on MainActivity class and secondActivity class
         * Intent help to link two activity or pages
         */
        Intent intent = new Intent(this, SecondActivity.class);
        //set the values to message variable
        String message = mMessageEditText.getText().toString();
        //pass the value to extra_message
        intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);
        //it take some data in it
        startActivityForResult(intent, TEXT_REQUEST);
    }
    /**
     * Handles the data in the return intent from SecondActivity.
     *
     * @param requestCode Code for the SecondActivity request.
     * @param resultCode Code that comes back from SecondActivity.
     * @param data Intent data sent back from SecondActivity.
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Test for the right intent reply.
        if (requestCode == TEXT_REQUEST) {
            // Test to make sure the intent reply result was good.
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                // Make the reply head visible.
                mReplyHeadTextView.setVisibility(View.VISIBLE);
                // Set the reply and make it visible.
                mReplyTextView.setText(reply);
                // Make the reply head visible.
                mReplyTextView.setVisibility(View.VISIBLE);
            }
        }
    }
}