package com.androidtraining.gm.androidlesson2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoGroup1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_group1);

        Button btn1Img1 = (Button) findViewById(R.id.img1button1);
        Button btn1Img2 = (Button) findViewById(R.id.img1button2);
        Button btn1Img3 = (Button) findViewById(R.id.img1button3);

        btn1Img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent btn1Img1 = new Intent(InfoGroup1.this, Btn1.class);
                startActivity(btn1Img1);
            }
        });

        btn1Img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent btn2 = new Intent(InfoGroup1.this, Btn2.class);
                startActivity(btn2);
            }
        });

        btn1Img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent btn3 = new Intent(InfoGroup1.this, Btn3.class);
                startActivity(btn3);
            }
        });
    }
}
