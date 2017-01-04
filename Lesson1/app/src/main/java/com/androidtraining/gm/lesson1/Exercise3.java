package com.androidtraining.gm.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Exercise3 extends AppCompatActivity {

    private int numberLines;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        Button button_Show = (Button) findViewById(R.id.button_Show);
        final EditText editText_num = (EditText)
                findViewById(R.id.editText_Num);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout_ShowLines);

        button_Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (linearLayout.getChildCount() > 0) {
                    linearLayout.removeAllViews();
                }
                String num = editText_num.getText().toString();

                if (num.length() > 0) {
                    numberLines = Integer.parseInt(num);
                    showLines(numberLines);
                }
            }
        });
    }

    private void showLines(int numberLines) {
        for(int i = 1; i <= numberLines; i++) {
            TextView textView = new TextView(this);
            textView.setText("Line " + i);
            linearLayout.addView(textView);
        }
    }
}
