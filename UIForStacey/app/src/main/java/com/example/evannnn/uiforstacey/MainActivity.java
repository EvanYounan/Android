package com.example.evannnn.uiforstacey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText messageText;
    public final static String MESSAGE_KEY = "com.example.evannnn.uiforstacey.message_key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void sendMessage(View view) {
//        messageText = (EditText) findViewById(R.id.editText);
//        String message = messageText.getText().toString();
//
//        //attach variable to intent object
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra(MESSAGE_KEY, message);
//        startActivity(intent);
//    }

    public void showCertainWindow(View view) {
        switch(view.getId()) {
            case R.id.secondLayoutButton:
                Intent intent = new Intent(this, SecondRealActivity.class);
                startActivity(intent); break;
            case R.id.thirdLayoutButton:
                Intent intent1 = new Intent(this, ThirdRealActivity.class);
                startActivity(intent1); break;
            case R.id.fourthLayoutButton:
                Intent intent2 = new Intent(this, ReativeDemoButtons.class);
                startActivity(intent2); break;
            case R.id.clickMeButton:
                Intent intent3 = new Intent(this, ButtonClicking.class);
                startActivity(intent3);
        }
    }

}
