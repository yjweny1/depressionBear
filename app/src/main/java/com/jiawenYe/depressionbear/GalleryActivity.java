package com.jiawenYe.depressionbear;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

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
            String videov = getIntent().getStringExtra("video");
            setImage(imageTitle, videov, imageDesc);
        }
    }

    private void setImage (String title, String videov, String desc){
        Log.d(TAG, "setImage: setting image, title and desc");
        TextView gtitle = findViewById(R.id.sg_title);
        gtitle.setText(title);
        TextView gDesc = findViewById(R.id.sg_desc);
        gDesc.setText(desc);
        VideoView gimage = findViewById(R.id.sg_image);
        MediaController mc = new MediaController(this);
        Uri uri = Uri.parse(videov);
//        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.test;
//        Uri uri = Uri.parse(videopath);
        gimage.setVideoURI(uri);
        gimage.setMediaController(mc);
        gimage.start();

    }
}
