package com.jiawenYe.depressionbear;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class PopWindow extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        Integer width = dm.widthPixels;
        Integer height = dm.heightPixels;
        getWindow().setLayout((int)(width*0.8),(int)(height*0.6));
    }
}
