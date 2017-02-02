package com.example.skyli.frigup.ui.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.skyli.frigup.R;

public class AggiungiProdottoActivity extends Activity {

    TextView nameTv;
    Button aggiungiProdottiBarCode;
    Button aggiungiProdottiManualmente;
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aggiungi_prodotto);
        nameTv = (TextView)findViewById(R.id.name_tv);
        aggiungiProdottiBarCode = (Button)findViewById(R.id.aggiungi_prodottiBarCode);
        aggiungiProdottiBarCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, ScanProdottoActivity.class);
                startActivity(intent);

            }
        });

        aggiungiProdottiManualmente= (Button)findViewById(R.id.aggiungi_prodotti_manualmente);
        aggiungiProdottiManualmente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }
}
