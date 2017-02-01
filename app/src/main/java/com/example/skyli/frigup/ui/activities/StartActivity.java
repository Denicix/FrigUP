package com.example.skyli.frigup.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import com.example.skyli.frigup.R;




import static android.R.attr.start;

public class StartActivity extends Activity {

    int TIMEOUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(StartActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },TIMEOUT);
    }
}
