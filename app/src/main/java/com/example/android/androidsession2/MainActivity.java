package com.example.android.androidsession2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button btn_increment, btn_decrement;
    int count;
    CheckBox cap,esp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.et_comment);
        textView = findViewById(R.id.tv_count);
        btn_increment = findViewById(R.id.btn_increment);
        btn_decrement = findViewById(R.id.btn_decrement);
        cap = findViewById(R.id.cap);
        esp = findViewById(R.id.esp);
    }

    //Function for order button
    public void showComment(View view){
        String comment = editText.getText().toString();
        Log.i("LogStat",comment);

        String message = "You ordered ";
        count = Integer.parseInt(textView.getText().toString());
        message = message + count;
        if(cap.isChecked())
            message = message + " Cappuccino";
        if(esp.isChecked())
            message = message + " Espresso";
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    //Function for increasing the value in the textview
    public void increment(View view){
        count = Integer.parseInt(textView.getText().toString());
        textView.setText(String.valueOf(count+1));
    }

    //Function for decreasing the value in the textview
    public void decrement(View view){
        count = Integer.parseInt(textView.getText().toString());
        if(count > 0)
            textView.setText(String.valueOf(count-1));
    }
}
