package com.jiawenYe.depressionbear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import java.util.ArrayList;

public class SuggestActivity extends AppCompatActivity {

    private static final String TAG = "SuggestActivity";
    private ArrayList<String> showlist = new ArrayList<>();
    private ArrayList<String> mTitle = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrl = new ArrayList<>();
    private ArrayList<String> mVideoUrl = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggest);
        Intent intent = getIntent();
        showlist = intent.getStringArrayListExtra("showlist");
        Log.d(TAG, "onCreate: Started.");

        intiImageBitmaps();

    }

    private void intiImageBitmaps() {
        Log.d(TAG, "intiImageBitmaps: preparing bitmaps");
        String title;
        String desc;
        if (showlist.get(0).equals("3") || showlist.get(0).equals("4")) {
            title = getString(R.string.activity1_title_en);
            desc = getString(R.string.activity1_desc_en);
            mImageUrl.add("https://scontent.fhlz1-1.fna.fbcdn.net/v/t1.15752-9/64976385_618456265326197_7728039440009920512_n.png?_nc_cat=105&_nc_oc=AQlNPAfHqf_vKgHZwA63f12bDqc7v9RPqyuS6bGrTVUKS_dsWNV15_lRLtA6o-vRNbc&_nc_ht=scontent.fhlz1-1.fna&oh=07730c8cfc47179fd8f5232dcdbab869&oe=5DB6D47B");
            mTitle.add(title);
            mDesc.add(desc);
            mVideoUrl.add("android.resource://" + getPackageName() + "/" + R.raw.walking);
        }

        if (showlist.get(1).equals("3") || showlist.get(1).equals("4")) {
            title = getString(R.string.activity2_title_en);
            desc = getString(R.string.activity2_desc_en);
            mImageUrl.add("https://scontent.fhlz1-1.fna.fbcdn.net/v/t1.15752-9/65420759_468976907193336_397538144238436352_n.png?_nc_cat=104&_nc_oc=AQliaJWKfKzrAPt6a8nHFb1hdL4FwvuXm_kb-t0l5_A5OZX41R7PzEcBKnPhOnaLTDY&_nc_ht=scontent.fhlz1-1.fna&oh=80eefb467d21a4aaa2a1e9d91788730b&oe=5DB90FB7");
            mTitle.add(title);
            mDesc.add(desc);
            mVideoUrl.add("android.resource://" + getPackageName() + "/" + R.raw.test);
        }
        if (showlist.get(2).equals("3") || showlist.get(2).equals("4")) {
            title = getString(R.string.activity3_title_en);
            desc = getString(R.string.activity3_desc_en);
            mImageUrl.add("https://scontent.fhlz1-1.fna.fbcdn.net/v/t1.15752-9/64533203_885092358513768_9144110081854406656_n.png?_nc_cat=110&_nc_oc=AQlyRy3yktSJmXh4R7aBlouTXp_xOiJMvNKkC961lB-XvTUBoOFWKPTYbyCiFMzH8YA&_nc_ht=scontent.fhlz1-1.fna&oh=651e11b34a5ff81e3b0748e42adb5f82&oe=5DBA5310");
            mTitle.add(title);
            mDesc.add(desc);
            mVideoUrl.add("android.resource://" + getPackageName() + "/" + R.raw.walking);
        }
        if (showlist.get(3).equals("3") || showlist.get(3).equals("4")) {
            title = getString(R.string.activity4_title_en);
            desc = getString(R.string.activity4_desc_en);
            mImageUrl.add("https://scontent.fhlz1-1.fna.fbcdn.net/v/t1.15752-9/64572177_538398813363625_6369625908025753600_n.png?_nc_cat=103&_nc_oc=AQktebUS_TvjR-smgM8fzNvZTmqCqvKCi_OT-AyQpDYHMp7hS4Ar0KUXboa21pvBenI&_nc_ht=scontent.fhlz1-1.fna&oh=0fe2ba4d437d6630c3b10083e2beb4e2&oe=5DBBA371");
            mTitle.add(title);
            mDesc.add(desc);
            mVideoUrl.add("android.resource://" + getPackageName() + "/" + R.raw.walking);
        }

        if (showlist.get(4).equals("3") || showlist.get(4).equals("4")) {
            title = getString(R.string.activity5_title_en);
            desc = getString(R.string.activity5_desc_en);
            mImageUrl.add("https://scontent.fhlz1-1.fna.fbcdn.net/v/t1.15752-9/65374400_401153843940949_2373971129082576896_n.png?_nc_cat=106&_nc_oc=AQlpRcVCefSY7tC-rWTSBw-oBo2g1HIEsxeSyVEspcqkdJ8yHN9p0wvD1rrT9DdPjQg&_nc_ht=scontent.fhlz1-1.fna&oh=b3b89f73e998bbe197db22fb451d2323&oe=5D8D37D8");
            mTitle.add(title);
            mDesc.add(desc);
            mVideoUrl.add("android.resource://" + getPackageName() + "/" + R.raw.walking);
        }
        if (showlist.get(5).equals("3") || showlist.get(5).equals("4")) {
            title = getString(R.string.activity6_title_en);
            desc = getString(R.string.activity6_desc_en);
            mImageUrl.add("https://scontent.fhlz1-1.fna.fbcdn.net/v/t1.15752-9/65289992_496861674385430_3886415335196196864_n.png?_nc_cat=100&_nc_oc=AQnardEj-YWEz-027VMR5HutiUUZgM5qOglMcKm4UYYy-jLTRxfOTesb6TsAeWTNk_4&_nc_ht=scontent.fhlz1-1.fna&oh=af2da82a13f6a038d46252cf436e69ca&oe=5D797983");
            mTitle.add(title);
            mDesc.add(desc);
            mVideoUrl.add("android.resource://" + getPackageName() + "/" + R.raw.walking);
        }
        if (showlist.get(6).equals("3") || showlist.get(6).equals("4")) {
            title = getString(R.string.activity7_title_en);
            desc = getString(R.string.activity7_desc_en);
            mImageUrl.add("https://scontent.fhlz1-1.fna.fbcdn.net/v/t1.15752-9/65045849_712502149185896_5792283300152213504_n.png?_nc_cat=109&_nc_oc=AQkBJIifnFO9X5eAD5Ny_U5XgrxBfD-IuHqFEVhE9x7tY3Y-3FqeGzb-Yzfj55ZCL5w&_nc_ht=scontent.fhlz1-1.fna&oh=15f72a114e47b63132f4615c07bcad08&oe=5DBD34ED");
            mTitle.add(title);
            mDesc.add(desc);
            mVideoUrl.add("android.resource://" + getPackageName() + "/" + R.raw.walking);
        }
        if (showlist.get(7).equals("3") || showlist.get(7).equals("4")) {
            title = getString(R.string.activity8_title_en);
            desc = getString(R.string.activity8_desc_en);
            mImageUrl.add("https://scontent.fhlz1-1.fna.fbcdn.net/v/t1.15752-9/65524399_383222512320945_2758945536202506240_n.png?_nc_cat=110&_nc_oc=AQkOPVSDBPejKL_YJ0dta35Ox6U1rvBkNuhkTJQdJm0NvTorl1-mb-VaurXMpIJxz-c&_nc_ht=scontent.fhlz1-1.fna&oh=9838013b81a66c232d2d8cb68177f4ac&oe=5D7EF4DB");
            mTitle.add(title);
            mDesc.add(desc);
            mVideoUrl.add("android.resource://" + getPackageName() + "/" + R.raw.walking);
        }

        //Always show at least 1 activity
        title = getString(R.string.activity9_title_en);
        desc = getString(R.string.activity9_desc_en);
        mImageUrl.add("https://scontent.fhlz1-1.fna.fbcdn.net/v/t1.15752-9/65288824_1048666632189427_5716350245453955072_n.png?_nc_cat=105&_nc_oc=AQlefdHdn4XjdnuKdU0AnxPYqyLIrHAfleeNUrhiHOak69X6OeBtTHaKUeJaFt8gVDk&_nc_ht=scontent.fhlz1-1.fna&oh=3f1afd83f9b86429d9246d4fd9558bd9&oe=5D792955");
        mTitle.add(title);
        mDesc.add(desc);
        mVideoUrl.add("android.resource://" + getPackageName() + "/" + R.raw.walking);

        intiRecyclerView();
    }

    private void intiRecyclerView() {
        Log.d(TAG, "intiRecyclerView: inti Recycler View");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mTitle, mDesc, mImageUrl, mVideoUrl, this);
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
