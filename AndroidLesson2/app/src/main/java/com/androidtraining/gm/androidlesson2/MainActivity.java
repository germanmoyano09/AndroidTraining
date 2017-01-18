package com.androidtraining.gm.androidlesson2;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdaptar(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if (position == 0 || position == 3 || position == 6) {
                    Intent intentGrp1 = new Intent(MainActivity.this, InfoGroup1.class);
                    startActivity(intentGrp1);
                } else if (position == 1 || position == 4 || position == 5) {
                    Intent intentGrp2 = new Intent(MainActivity.this, InfoGroup2.class);
                    startActivity(intentGrp2);
                } else {
                    Intent intentGrp3 = new Intent(MainActivity.this, InfoGroup3.class);
                    startActivity(intentGrp3);
                }
            }
        });
    }
}
