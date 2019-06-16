package com.jiawenYe.depressionbear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.info_text);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }

    public void goLanding(View view){
        Intent goSelfTesT = new Intent(this, LandingActivity.class);
        startActivity(goSelfTesT);
        finish();
    }
}
