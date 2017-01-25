package com.example.skyli.frigup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by skyli on 25/01/2017.
 */

public class MainActivity extends Activity{

    TextView welcomeTv;
    Button aggiungiProdotti;
    Button visualizzaProdotti;
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aggiungiProdotti = (Button)findViewById(R.id.aggiungi_prodotti);
        aggiungiProdotti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //username = changeTextEdit.getText().toString();
                Intent intent = new Intent(activity, AggiungiProdottoActivity.class);
                //intent.putExtra("username", username);
                startActivity(intent);

            }
});

        visualizzaProdotti = (Button)findViewById(R.id.visualizza_prodotti);
        visualizzaProdotti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity, VisualizzaProdottiActivity.class);
                startActivity(intent);

            }
        });
    }
}
