package com.example.skyli.frigup.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.skyli.frigup.R;

/**
 * Created by skyli on 01/02/2017.
 */
public class AddManualProdottoActivity extends Activity{
    EditText nome_prodotto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_manual_prodotto);
        nome_prodotto = (EditText) findViewById(R.id.nome_prodotto_agg_manuale);


        }


    }

