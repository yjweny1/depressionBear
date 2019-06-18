package com.jiawenYe.depressionbear;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SuggestActivity extends AppCompatActivity {

    private static final String TAG = "SuggestActivity";
    private ArrayList<String> showlist = new ArrayList<>();
    private ArrayList<String> mTitle = new ArrayList<>() ;
    private ArrayList<String> mDesc = new ArrayList<>() ;
    private ArrayList<String> mImageUrl = new ArrayList<>() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggest);
        Intent intent = getIntent();
        showlist = intent.getStringArrayListExtra("showlist");
        Log.d(TAG, "onCreate: Started.");

        intiImageBitmaps();

    }

    private void intiImageBitmaps(){
        Log.d(TAG, "intiImageBitmaps: preparing bitmaps");
        if (showlist.get(0).equals("1")){
            mImageUrl.add("https://scontent.fakl2-1.fna.fbcdn.net/v/t1.15752-9/64468558_410298139698482_7448380701889527808_n.png?_nc_cat=110&_nc_ht=scontent.fakl2-1.fna&oh=1b08515d6f00fd0c52d7c04fce14985d&oe=5D8DD309");
            mTitle.add("Walk 40 mins");
            mDesc.add("Walk 40 mins");
        }

        if (showlist.get(1).equals("1")){
        mImageUrl.add("https://scontent.fakl2-1.fna.fbcdn.net/v/t1.15752-9/64468558_410298139698482_7448380701889527808_n.png?_nc_cat=110&_nc_ht=scontent.fakl2-1.fna&oh=1b08515d6f00fd0c52d7c04fce14985d&oe=5D8DD309");
        mTitle.add("Walk 40 mins");
        mDesc.add("Walk 40 mins");
        }
        if (showlist.get(2).equals("1")) {
            mImageUrl.add("https://scontent.fakl2-1.fna.fbcdn.net/v/t1.15752-9/64468558_410298139698482_7448380701889527808_n.png?_nc_cat=110&_nc_ht=scontent.fakl2-1.fna&oh=1b08515d6f00fd0c52d7c04fce14985d&oe=5D8DD309");
            mTitle.add("Walk 40 mins");
            mDesc.add("Walk 40 mins");
        }
        if (showlist.get(3).equals("1")) {
            mImageUrl.add("https://scontent.fakl2-1.fna.fbcdn.net/v/t1.15752-9/64468558_410298139698482_7448380701889527808_n.png?_nc_cat=110&_nc_ht=scontent.fakl2-1.fna&oh=1b08515d6f00fd0c52d7c04fce14985d&oe=5D8DD309");
            mTitle.add("Walk 40 mins");
            mDesc.add("Walk 40 mins");
        }

        if (showlist.get(4).equals("1") ){
        mImageUrl.add("https://scontent.fakl2-1.fna.fbcdn.net/v/t1.15752-9/64468558_410298139698482_7448380701889527808_n.png?_nc_cat=110&_nc_ht=scontent.fakl2-1.fna&oh=1b08515d6f00fd0c52d7c04fce14985d&oe=5D8DD309");
        mTitle.add("Walk 40 mins");
        mDesc.add("Walk 40 mins");}
        if (showlist.get(5).equals("1")) {
            mImageUrl.add("https://scontent.fakl2-1.fna.fbcdn.net/v/t1.15752-9/64468558_410298139698482_7448380701889527808_n.png?_nc_cat=110&_nc_ht=scontent.fakl2-1.fna&oh=1b08515d6f00fd0c52d7c04fce14985d&oe=5D8DD309");
            mTitle.add("Walk 40 mins");
            mDesc.add("Walk 40 mins");
        }
        if (showlist.get(6).equals("1")){
        mImageUrl.add("https://scontent.fakl2-1.fna.fbcdn.net/v/t1.15752-9/64468558_410298139698482_7448380701889527808_n.png?_nc_cat=110&_nc_ht=scontent.fakl2-1.fna&oh=1b08515d6f00fd0c52d7c04fce14985d&oe=5D8DD309");
        mTitle.add("Walk 40 mins");
        mDesc.add("Walk 40 mins");}
        if (showlist.get(7).equals("1")){
        mImageUrl.add("https://scontent.fakl2-1.fna.fbcdn.net/v/t1.15752-9/64468558_410298139698482_7448380701889527808_n.png?_nc_cat=110&_nc_ht=scontent.fakl2-1.fna&oh=1b08515d6f00fd0c52d7c04fce14985d&oe=5D8DD309");
        mTitle.add("Walk 40 mins");
        mDesc.add("Walk 40 mins");}

        mImageUrl.add("https://scontent.fakl2-1.fna.fbcdn.net/v/t1.15752-9/64468558_410298139698482_7448380701889527808_n.png?_nc_cat=110&_nc_ht=scontent.fakl2-1.fna&oh=1b08515d6f00fd0c52d7c04fce14985d&oe=5D8DD309");
        mTitle.add("Walk 40 mins");
        mDesc.add("Walk 40 mins");

        intiRecyclerView();
    }

    private void intiRecyclerView(){
        Log.d(TAG, "intiRecyclerView: inti Recycler View");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mTitle, mDesc, mImageUrl, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onBackPressed() {
        Intent we = new Intent(this, ResultActivity.class);
        startActivity(we);
        finish();
    }
}
