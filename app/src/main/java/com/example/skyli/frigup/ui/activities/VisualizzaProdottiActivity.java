package com.example.skyli.frigup.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.skyli.frigup.R;
import com.example.skyli.frigup.models.Prodotti;
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
        ArrayList<Prodotti> ListaProdotti = new ArrayList<>();
        Prodotti s1 = new Prodotti();
        s1.setNome("Uova");
        s1.setScadenza("21/05/1990");
        s1.setQuantita("5");
        Prodotti s2 = new Prodotti();
        s2.setNome("Pane");
        s2.setScadenza("15/02/2020");
        s2.setQuantita("1kg");
        Prodotti s3 = new Prodotti();
        s3.setNome("Sugo");
        s3.setScadenza("27/01/2090");
        s3.setQuantita("5kg");

        ListaProdotti.add(s1);
        ListaProdotti.add(s2);
        ListaProdotti.add(s3);

        adapter.setDataSet(ListaProdotti);

    }
}
