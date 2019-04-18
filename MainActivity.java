package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;

    Button seven;
    Button eight;
    Button nine;
    Button addition;
    Button subtraction;
    Button division;
    Button multiply;
    Button decimal;
    Button clear;
    Button CE;
    Button PE;
    Button equal;
    EditText editT;

    float mValueOne, mValueTwo;

    boolean booAddition, booSubtract, booMultiplication, booDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        decimal = (Button) findViewById(R.id.decimal);
        addition = (Button) findViewById(R.id.addition);
        subtraction = (Button) findViewById(R.id.subtraction);
        multiply = (Button) findViewById(R.id.multiply);
        division = (Button) findViewById(R.id.buttondiv);
        clear = (Button) findViewById(R.id.clear);
        CE = (Button) findViewById(R.id.CE);
        PE = (Button) findViewById(R.id.PE);
        equal = (Button) findViewById(R.id.buttoneql);
        editT = (EditText) findViewById(R.id.edt1);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + "0");
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editT == null) {
                    editT.setText("");
                } else {
                    mValueOne = Float.parseFloat(editT.getText() + "");
                    booAddition = true;
                    editT.setText(null);
                }
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editT.getText() + "");
                booSubtract = true;
                editT.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editT.getText() + "");
                booMultiplication = true;
                editT.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editT.getText() + "");
                booDivision = true;
                editT.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editT.getText() + "");

                if (booAddition == true) {
                    editT.setText(mValueOne + mValueTwo + "");
                    booAddition = false;
                }

                if (booSubtract == true) {
                    editT.setText(mValueOne - mValueTwo + "");
                    booSubtract = false;
                }

                if (booMultiplication == true) {
                    editT.setText(mValueOne * mValueTwo + "");
                    booMultiplication = false;
                }

                if (booDivision == true) {
                    editT.setText(mValueOne / mValueTwo + "");
                    booDivision = false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText("");
            }
        });

        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText("");
            }
        });
        PE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText("");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editT.setText(editT.getText() + ".");
            }
        });
    }
}
