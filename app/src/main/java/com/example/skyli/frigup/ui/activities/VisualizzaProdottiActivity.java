package com.example.skyli.frigup.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.skyli.frigup.R;
import com.example.skyli.frigup.models.Prodotto;
import com.example.skyli.frigup.ui.adapters.ProdottiAdapter;

import java.util.ArrayList;

public class VisualizzaProdottiActivity extends Activity {

    TextView nameTv;
    Intent intent;
    RecyclerView productRecyclerView;
    LinearLayoutManager layoutManager;
    ProdottiAdapter adapter;
    private static final String SCADENZA = "Scadenza";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza_prodotti);
        productRecyclerView = (RecyclerView)findViewById(R.id.prodotti_recyler_view);
      /* intent = getIntent();
        username = intent.getStringExtra("username");
        nameTv.setText(username);
        */

        intent = getIntent();

        layoutManager = new LinearLayoutManager(this);
        adapter = new ProdottiAdapter();

        productRecyclerView.setLayoutManager(layoutManager);
        productRecyclerView.setAdapter(adapter);
        fetchProdotti();
    }


    private void fetchProdotti(){
        ArrayList<Prodotto> listaProdotto = new ArrayList<>();
        Prodotto s1 = new Prodotto();
        s1.setNome("Uova");
        s1.setScadenza("21/05/1990");
        s1.setQuantita("5");
        Prodotto s2 = new Prodotto();
        s2.setNome("Pane");
        s2.setScadenza("15/02/2020");
        s2.setQuantita("1kg");
        Prodotto s3 = new Prodotto();
        s3.setNome("Sugo");
        s3.setScadenza("27/01/2090");
        s3.setQuantita("5kg");

        listaProdotto.add(s1);
        listaProdotto.add(s2);
        listaProdotto.add(s3);

        adapter.setDataSet(listaProdotto);

    }
}
