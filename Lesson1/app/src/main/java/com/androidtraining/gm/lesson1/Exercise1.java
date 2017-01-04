package com.androidtraining.gm.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 extends AppCompatActivity {

    private int monthNumber = 0;
    private TextView textView_showMonth;
    private String month = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        final EditText editText_number = (EditText) findViewById(R.id.EditText_Number);
        final Button button_showMonth = (Button) findViewById(R.id.button_Show_Month);
        textView_showMonth = (TextView) findViewById(R.id.TextView_Month);

        button_showMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                month = editText_number.getText().toString();

                if (month.length() > 0) {
                    monthNumber = Integer.parseInt(month);
                    if (monthNumber != 0 && monthNumber < 13) {
                        showMonthName(monthNumber);
                    } else {
                        textView_showMonth.setText("Enter a number between 1 and 12");
                    }
                } else {
                    textView_showMonth.setText("Enter a number between 1 and 12");
                }
            }
        });
    }

    private void showMonthName (int monthNumber) {
        Map<Integer, String> monthMap = new HashMap<>();

        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        monthMap.put(4, "April");
        monthMap.put(5, "May");
        monthMap.put(6, "June");
        monthMap.put(7, "July");
        monthMap.put(8, "August");
        monthMap.put(9, "September");
        monthMap.put(10, "October");
        monthMap.put(11, "November");
        monthMap.put(12, "December");

        for (int key : monthMap.keySet()) {
            if (key == monthNumber) {
                textView_showMonth.setText( monthMap.get(key) );
            }
        }
    }
}
