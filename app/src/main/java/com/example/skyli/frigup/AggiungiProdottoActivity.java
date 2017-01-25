package com.example.skyli.frigup;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AggiungiProdottoActivity extends Activity {

    TextView nameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aggiungi_prodotto);
        nameTv = (TextView)findViewById(R.id.name_tv);

    }
}
