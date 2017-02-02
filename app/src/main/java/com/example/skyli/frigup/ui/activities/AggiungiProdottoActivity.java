package com.example.skyli.frigup.ui.activities;


import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.skyli.frigup.R;
import com.example.skyli.frigup.api.Rest;
import com.example.skyli.frigup.models.Prodotto;

public class AggiungiProdottoActivity extends Activity {

    private static final int SCAN_REQUEST = 23;
    private static final int SAVE_REQUEST = 24;
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
                startActivityForResult(intent,SCAN_REQUEST);

            }
        });

        aggiungiProdottiManualmente= (Button)findViewById(R.id.aggiungi_prodotti_manualmente);
        aggiungiProdottiManualmente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, AddManualProdottoActivity.class);
                startActivityForResult(intent, SAVE_REQUEST);
            }
        }

    );



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SCAN_REQUEST && resultCode == Activity.RESULT_OK){

            String barcodeScanned = data.getStringExtra("barcode");
            Rest rest = new Rest(this);
            rest.getProductByBarcode(barcodeScanned, new Rest.ResponseCallback() {
                @Override
                public void onSuccess(Prodotto product) {
                    // set UI


                }

                @Override
                public void onError(String message) {
                    Toast.makeText(AggiungiProdottoActivity.this,message,Toast.LENGTH_LONG).show();

                }
            });

        }



    }
}
