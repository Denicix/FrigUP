package com.example.skyli.frigup.ui.activities;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.skyli.frigup.R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;

import java.util.List;
import java.util.logging.Handler;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

import static android.content.ContentValues.TAG;

public class ScanProdottoActivity extends Activity implements ZXingScannerView.ResultHandler{

    private ZXingScannerView mScannerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mScannerView = new ZXingScannerView(this);
        setContentView(R.layout.activity_scan_prodotto);

        mScannerView = new ZXingScannerView(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result result) {
        Toast.makeText(this, "Contents = " + result.getText() +

                ", Format = " + result.getBarcodeFormat().toString(), Toast.LENGTH_SHORT).show();
        //Do something with result here

        Log.v(TAG, result.getText());
        Log.v(TAG, result.getBarcodeFormat().toString());

        //If you would like to resume scanning, call this method below:
        mScannerView.resumeCameraPreview(this);
    }
}