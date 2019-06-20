package com.berkanaslan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        resultText = (TextView)findViewById(R.id.textView);

        resultText.setText("Simple text");
    }

    public void sum (View view) {
        if(editText1.getText().toString().matches("") || editText2.getText().toString().matches("")) {
            resultText.setText("editText1 or editText2 is empty.");
        } else {
            int a = Integer.parseInt(editText1.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultInteger = a + b;

            resultText.setText("Result: " + resultInteger);
        }

    }

    public void deduct (View view) {
        if(editText1.getText().toString().matches("") || editText2.getText().toString().matches("")) {
            resultText.setText("editText1 or editText2 is empty.");
        } else {
            int a = Integer.parseInt(editText1.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultInteger = a - b;

            resultText.setText("Result: " + resultInteger);
        }

    }

    public void multiply (View view) {
        if(editText1.getText().toString().matches("") || editText2.getText().toString().matches("")) {
            resultText.setText("editText1 or editText2 is empty.");
        } else {
            int a = Integer.parseInt(editText1.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultInteger = a * b;

            resultText.setText("Result: " + resultInteger);
        }


    }

    public void divide (View view) {
        if(editText1.getText().toString().matches("") || editText2.getText().toString().matches("")) {
            resultText.setText("editText1 or editText2 is empty.");
        } else {
            int a = Integer.parseInt(editText1.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultInteger = a / b;

            resultText.setText("Result: " + resultInteger);
        }

    }
}
