package com.example.skyli.frigup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VisualizzaProdottiActivity extends Activity {

    TextView nameTv;
    Intent intent;
    RecyclerView productRecyclerView;
    LinearLayoutManager layoutManager;
    ProdottiAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza_prodotti);
        nameTv = (TextView)findViewById(R.id.name_tv);

      /* intent = getIntent();
        username = intent.getStringExtra("username");
        nameTv.setText(username);
        */

        intent = getIntent();

        layoutManager = new LinearLayoutManager(this);
        adapter = new ProdottiAdapter();

        productRecyclerView.setLayoutManager(layoutManager);
        productRecyclerView.setLayoutManager(adapter);

    }
}
