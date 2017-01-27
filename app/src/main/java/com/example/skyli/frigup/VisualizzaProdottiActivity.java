package com.example.skyli.frigup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class VisualizzaProdottiActivity extends Activity {

    TextView nameTv;
    Intent intent;
    //String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza_prodotti);
        nameTv = (TextView)findViewById(R.id.name_tv);
      /* intent = getIntent();
        username = intent.getStringExtra("username");
        nameTv.setText(username);
        */

    }
}
