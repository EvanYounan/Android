package com.example.evannnn.uiforstacey;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Evannnn on 11/21/2016.
 */

public class ButtonClicking extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button bn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.responding_to_click_of_buttons);
        bn = (Button) findViewById(R.id.bn);
        bn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "You clicked the second button",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void getMe(View view) {
        Toast.makeText(getBaseContext(), "You clicked on the first button", Toast.LENGTH_LONG).show();
    }



}
