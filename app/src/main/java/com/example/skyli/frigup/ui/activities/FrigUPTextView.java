package com.example.skyli.frigup.ui.activities;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Danilo Crispi on 01/02/2017.
 */

public class FrigUPTextView extends TextView {

    public FrigUPTextView(Context context) {
        super(context);
        applyCustomFont(context);
    }

        public FrigUPTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }


    public FrigUPTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("Infinite_Stroke_Bolder.ttf", context);
        setTypeface(customFont);
    }
}
