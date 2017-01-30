package com.example.skyli.frigup.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.skyli.frigup.R;
import com.example.skyli.frigup.models.Prodotti;

import java.util.ArrayList;

/**
 * Created by Danilo Crispi on 27/01/2017.
 */

public class ProdottiAdapter extends RecyclerView.Adapter<ProdottiAdapter.ProdottiViewHolder> {

    ArrayList<Prodotti> dataSet = new ArrayList<>();

    @Override
    public ProdottiAdapter.ProdottiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext().inflate(R.layout.item_prodotti, parent, false));
        ProdottiViewHolder holder = new ProdottiViewHolder(v);

        return new ProdottiViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ProdottiAdapter.ProdottiViewHolder holder, int position) {
        Prodotti currentProdotto = dataSet.get(position);
        holder.prodottiQuantitaTV.setText(currentProdotto.getQuantita());//INSERISCI IN XML
        holder.prodottiNomeTv.setText(currentProdotto.getNome());//INSERISCI IN XML
        holder.prodottiScadenzaTv.setText(currentProdotto.getScadenza());//INSERISCI IN XML


    }

    public void setData(ArrayList<Prodotti> prodotti) {
        dataSet = prodotti;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    protected class ProdottiViewHolder extends RecyclerView.ViewHolder {
        public TextView prodottiNomeTv;
        public TextView prodottiScadenzaTv;
        public TextView prodottiQuantitaTV;

        public ProdottiViewHolder(View v) {
            super(v);
            prodottiNomeTv = (TextView)v.findViewById(R.id.prodotti_name);
            prodottiScadenzaTv = (TextView)v.findViewById(R.id.prodotti_scadenza);
            prodottiQuantitaTV = (TextView)v.findViewById(R.id.prodotti_quantita);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),"Nome prodotto { " + dataSet.get(getAdapterPosition()).getNome(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
