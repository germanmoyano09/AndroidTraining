package com.androidtraining.gm.lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_exercise1 = (Button) findViewById(R.id.button_Exercise1);
        Button button_exercise2 = (Button) findViewById(R.id.button_Exercise2);
        Button button_exercise3 = (Button) findViewById(R.id.button_Exercise3);


        button_exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exc1 = new Intent(MainActivity.this, Exercise1.class);
                startActivity(exc1);
            }
        });

        button_exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exc2 = new Intent(MainActivity.this, Exercise2.class);
                startActivity(exc2);
            }
        });

        button_exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exc3 = new Intent(MainActivity.this, Exercise3.class);
                startActivity(exc3);
            }
        });
    }


}
