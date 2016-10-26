package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        LinearLayout rootview = (LinearLayout)findViewById(R.id.rootview);
        TextView wordview1 = new TextView(this);
        wordview1.setText(words.get(0));
        rootview.addView(wordview1);
        TextView wordview2 = new TextView(this);
        wordview2.setText(words.get(0));
        rootview.addView(wordview2);
    }
}
