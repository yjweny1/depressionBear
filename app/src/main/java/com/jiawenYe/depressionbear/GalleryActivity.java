package com.jiawenYe.depressionbear;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {
    private static final String TAG = "GalleryActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();

    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: Checking Incoming intents.");
        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_title") && getIntent().hasExtra("image_desc")){
            Log.d(TAG, "getIncomingIntent: found information");
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageTitle = getIntent().getStringExtra("image_title");
            String imageDesc = getIntent().getStringExtra("image_desc");
            Boolean imageShow = getIntent().getBooleanExtra("showlist", true);
            setImage(imageTitle, imageUrl, imageDesc);
        }
    }

    private void setImage (String title, String image, String desc){
        Log.d(TAG, "setImage: setting image, title and desc");
        TextView gtitle = findViewById(R.id.sg_title);
        gtitle.setText(title);
        TextView gDesc = findViewById(R.id.sg_desc);
        gDesc.setText(desc);
        ImageView gimage = findViewById(R.id.sg_image);
        Glide.with(this)
                .asBitmap()
                .load(image)
                .into(gimage);
    }
}
