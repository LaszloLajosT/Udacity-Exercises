package com.example.android.explicitintent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity extends AppCompatActivity {
    // COMPLETED (6) Create a TextView field to display your message
    /* Field to store our TextView */
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // COMPLETED (7) Get a reference to your TextView in Java
        /* Typical usage of findViewById... */
        mDisplayText = findViewById(R.id.tv_display);
    }
}
