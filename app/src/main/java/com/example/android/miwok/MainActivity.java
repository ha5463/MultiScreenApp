
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        TextView number = (TextView)findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Numbers",Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
            }
        });
        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the family category is clicked on.
         @Override
         public void onClick(View view) {
             Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
             startActivity(familyIntent);
         }
        });
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                Intent PhrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(PhrasesIntent);
            }
        });

    }

}
