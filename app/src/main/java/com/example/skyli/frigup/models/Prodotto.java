package com.example.skyli.frigup.models;

import com.google.firebase.database.Exclude;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Danilo Crispi on 27/01/2017.
 */
public class Prodotto {

    private String nome_prodotto, scadenza, quantita, imageURL;

    public Prodotto() {
    }

    public Prodotto(JSONObject productJSON){
        try {
            nome_prodotto = productJSON.getString("product_name_en");
            imageURL = productJSON.getString("image_url");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public Prodotto(String nome_prodotto, String scadenza, String quantita){
        this.nome_prodotto = nome_prodotto;
        this.scadenza = scadenza;
        this.quantita = quantita;

    }

    public String getQuantita() {
        return quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    public String getNome() {
        return nome_prodotto;
    }


    public String getScadenza() {
        return scadenza;
    }

    public void setScadenza(String scadenza) {
        this.scadenza = scadenza;
    }

    public String getImageURL() {
        return imageURL;
    }


    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("nome prodotto", nome_prodotto);
        return result;
    }

}
