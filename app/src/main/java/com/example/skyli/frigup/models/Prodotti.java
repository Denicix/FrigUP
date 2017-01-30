package com.example.skyli.frigup.models;

/**
 * Created by Danilo Crispi on 27/01/2017.
 */
public class Prodotti {

    private String nome;
    private String scadenza;
    private String quantita;

    public Prodotti() {
    }

    public String getQuantita() {
        return quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getScadenza() {
        return scadenza;
    }

    public void setScadenza(String scadenza) {
        this.scadenza = scadenza;
    }

}
