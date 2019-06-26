package com.jiawenYe.depressionbear;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.info_text);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }

    public void goQuestion(View view){
        Intent goSelfTesT = new Intent(this, QuestionActivity.class);
        startActivity(goSelfTesT);
        finish();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Integer id = item.getItemId();
        if (id == R.id.info_icon){
            Toast.makeText(this, "icon clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, PopWindow.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
