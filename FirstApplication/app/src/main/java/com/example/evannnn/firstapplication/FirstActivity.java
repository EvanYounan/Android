package com.example.evannnn.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void showGreetings(View view) {
        String buttonText;
        buttonText = ((Button) view).getText().toString();

        if (buttonText.equals(getResources().getString(R.string.buttonTextSecondActivity))) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        } else if (buttonText.equals(getResources().getString(R.string.buttonTextThirdActivity))) {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
    }
    
}
