package com.example.user.my_demo_calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doAdd(View view){
        EditText editText1 = (EditText) findViewById(R.id.etEnterNum1);
        EditText editText2 = (EditText) findViewById(R.id.etEnterNum2);

        int a = Integer.parseInt(editText1.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());

        TextView textView3 = (TextView) findViewById(R.id.tvResult);

        textView3.setText(String.valueOf(a+b));
    }
    public void doSub(View view){
        EditText editText1 = (EditText) findViewById(R.id.etEnterNum1);
        EditText editText2 = (EditText) findViewById(R.id.etEnterNum2);

        int a = Integer.parseInt(editText1.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());

        TextView textView3 = (TextView) findViewById(R.id.tvResult);

        textView3.setText(String.valueOf(a-b));

    }
}
