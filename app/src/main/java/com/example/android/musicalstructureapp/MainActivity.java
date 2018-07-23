package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the winter wonderland
        TextView winterWonderland = (TextView) findViewById(R.id.winter_wonderland);

        // Set a click listener on that View
        winterWonderland.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Winter Wonderland music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WinterWonderlandActivity}
                Intent winterWonderlandIntent = new Intent(MainActivity.this, WinterWonderlandActivity.class);

                // Start the new activity
                startActivity(winterWonderlandIntent);
            }
        });

        // Find the View that shows the ukulele christmas
        TextView ukeleleChristmas = (TextView) findViewById(R.id.ukulele_christmas);

        // Set a click listener on that View
        ukeleleChristmas.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Ukelele Christmas Songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link UkeleleChristmasActivity}
                Intent ukeleleChristmasIntent = new Intent(MainActivity.this, UkeleleChristmasActivity.class);

                // Start the new activity
                startActivity(ukeleleChristmasIntent);
            }
        });

        // Find the View that shows the kids_stuff
        TextView kidsStuff = (TextView) findViewById(R.id.kids_stuff);

        // Set a click listener on that View
        kidsStuff.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Kids Stuff music is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link KidsStuffActivity}
                Intent kidsStuffIntent = new Intent(MainActivity.this, KidsStuffActivity.class);

                // Start the new activity
                startActivity(kidsStuffIntent);
            }
        });
    }
}
