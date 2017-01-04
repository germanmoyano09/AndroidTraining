package com.androidtraining.gm.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exercise2 extends AppCompatActivity {

    private int number1;
    private int number2;
    private String op;
    private TextView textView_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        final EditText editText_num1 = (EditText) findViewById(R.id.num1);
        final EditText editText_num2 = (EditText) findViewById(R.id.num2);
        final EditText editText_op = (EditText) findViewById(R.id.op);
        final Button button_Calculate = (Button) findViewById(R.id.button_Calculate);
        textView_Result = (TextView) findViewById(R.id.textView_Result);

        button_Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editText_num1.getText().toString();
                String num2 = editText_num2.getText().toString();

                if (num1.length() > 0 && num2.length() > 0) {
                    number1 = Integer.parseInt(num1);
                    number2 = Integer.parseInt(num2);
                    op = editText_op.getText().toString();
                    calculateAndShowResult(number1, number2, op);
                }
            }
        });
    }

    private void calculateAndShowResult(int number1, int number2, String op) {
        switch (op) {
            case "+":
                textView_Result.setText("Result: " + (number1 + number2));
                break;
            case "-":
                textView_Result.setText("Result: " + (number1 - number2));
                break;
            case "*":
                textView_Result.setText("Result: " + (number1 * number2));
                break;
            case "/":
                if (number2 == 0) {
                    textView_Result.setText("You can't divide a number by zero");
                    break;
                }
                textView_Result.setText("Result: " + (number1 / number2));
                break;
            default:
                textView_Result.setText(op + " is not a valid operator.");
                break;
        }
    }
}
