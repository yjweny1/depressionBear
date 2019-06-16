package com.jiawenYe.depressionbear;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SuggestActivity extends AppCompatActivity {
    ListView listView;
    String nTitle [] = {"Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins" , "Walk 40 mins", "Walk 40 mins"};
    String nDesc [] = {"Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins", "Walk 40 mins"};
    int img [] = {R.drawable.walk_1, R.drawable.walk_1, R.drawable.walk_1, R.drawable.walk_1, R.drawable.walk_1, R.drawable.walk_1, R.drawable.walk_1, R.drawable.walk_1, R.drawable.walk_1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggest);

        listView = findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(this, nTitle, nDesc, img);

    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDesc[];
        int rImg[];
        MyAdapter (Context c, String title[], String desc[], int imag[]){
            super(c, R.layout.row, R.id.textview1, title);
            this.context = c;
            this.rTitle = title;
            this.rDesc = desc;
            this.rImg = imag;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row =  layoutInflater.inflate(R.layout.row, parent, false);
            ImageView image = row.findViewById(R.id.imagelogo);
            TextView myTitle = row.findViewById(R.id.textview1);
            TextView myDesc = row.findViewById(R.id.textview2);
            image.setImageResource(rImg[position]);
            myTitle.setText(rTitle[position]);
            myDesc.setText(rDesc[position]);
            return row;

        }
    }
}
