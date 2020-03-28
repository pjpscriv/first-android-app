package com.example.peter.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Do initialization stuff I don't need to know about
        super.onCreate(savedInstanceState);
        // Set the view screen
        setContentView(R.layout.activity_main);

        // Make a listener
        TextView text = findViewById(R.id.peter_text);

        text.setOnClickListener(new TextView.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Text clicked G");
                // Fuckin' Pop some shiiiiit
                Toast.makeText(getApplicationContext(), "YO waddup FAM", Toast.LENGTH_SHORT).show();
            }
        });



        // Does this work?
        System.out.println("Peter testing stuff");

    }
}
