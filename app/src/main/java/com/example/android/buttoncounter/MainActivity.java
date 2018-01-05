package com.example.android.buttoncounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private TextView mTextView;

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: in");


        mEditText = findViewById(R.id.editText);
        mTextView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        mTextView.setText("");
        mTextView.setMovementMethod(new ScrollingMovementMethod());   // Adding Scroll view functionality to text view


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = mEditText.getText().toString();
                mTextView.append(input + "\n");
                mEditText.setText("");
            }
        });

        Log.d(TAG, "onCreate: out");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: in");
        super.onRestoreInstanceState(savedInstanceState);
         String text= savedInstanceState.getString("text");
         mTextView.setText(text);
        Log.d(TAG, "onRestoreInstanceState: out");
    }


    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: in");
        super.onStart();
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: in");
        super.onResume();
        Log.d(TAG, "onResume: out");
    }


    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: in");
        super.onPause();
        Log.d(TAG, "onPause: out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: in");
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: out");

        String textViewText = mTextView.getText().toString();
        outState.putString("text",textViewText );
    }


    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: in");
        super.onStop();
        Log.d(TAG, "onStop: out");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: in");
        super.onDestroy();
        Log.d(TAG, "onDestroy: out");
    }

}
