package com.kaplan.pdma.japanesebasicphrases;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button greetings = (Button) findViewById(R.id.greetings); //linking pages
        greetings.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentGreetings = new Intent(getApplicationContext(),
                        greetings.class);
                startActivity(intentGreetings);
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();


            }
        });

        Button questions = (Button) findViewById(R.id.questions);
        questions.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentQuestions = new Intent(getApplicationContext(),
                        questions.class);
                startActivity(intentQuestions);
                Toast.makeText(MainActivity.this, "Don't be afraid to ask", Toast.LENGTH_SHORT).show();
            }
        });

        Button restaurant = (Button) findViewById(R.id.restaurant);
        restaurant.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentRestaurant = new Intent(getApplicationContext(),
                        restaurant.class);
                startActivity(intentRestaurant);
                Toast.makeText(MainActivity.this, "Hungry", Toast.LENGTH_SHORT).show();
            }
        });


        Button hundred = (Button) findViewById(R.id.hundred);
        hundred.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentHundred = new Intent(getApplicationContext(),
                        hundred.class);
                startActivity(intentHundred);
                Toast.makeText(MainActivity.this, "Keep learning", Toast.LENGTH_SHORT).show();
            }
        });

        Button list = (Button) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentList = new Intent(getApplicationContext(),
                        list.class);
                startActivity(intentList);
                Toast.makeText(MainActivity.this, "Memorize", Toast.LENGTH_SHORT).show();
            }
        });


    }


}
