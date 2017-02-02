package com.example.skyli.frigup.api;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.skyli.frigup.models.Prodotto;

import org.json.JSONException;
import org.json.JSONObject;

import static android.content.ContentValues.TAG;

/**
 * Created by skyli on 01/02/2017.
 */

public class Rest {
    Context context;
    final static String baseURL = "https://world.openfoodfacts.org/api/v0/product/";

    public String getUrl(String barcode){
        return baseURL + barcode + ".json";
    }

    public Rest(Context c){
        context = c;
    }

    public interface ResponseCallback{
        void onSuccess(Prodotto product);
        void onError(String message);
    }

    public void getProductByBarcode(String barcodeScanned, final ResponseCallback callback) {
        RequestQueue queue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.GET,getUrl(barcodeScanned) ,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d(TAG,response);
                        try {
                            JSONObject responseJson = new JSONObject(response);
                            Prodotto prodotto = new Prodotto(responseJson.getJSONObject("product"));
                            callback.onSuccess(prodotto);
                            // onSuccess(prodotto)
                            //adapter.setDataSet(Student.getStudentsListFromJson(responseJson.getJSONArray("students")));
                        } catch (JSONException e) {
                            // onError
                            callback.onError(e.getMessage());
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG,error.getMessage());

            }
        });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);


    }
}
