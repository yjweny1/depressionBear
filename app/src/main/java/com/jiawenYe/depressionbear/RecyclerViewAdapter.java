package com.jiawenYe.depressionbear;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mTitle;
    private ArrayList<String> mDesc;
    private ArrayList<String> mImage;
    private ArrayList<String> mVideo;
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> mTitle, ArrayList<String> mDesc, ArrayList<String> mImage, ArrayList<String> mVideo, Context mContext) {
        this.mTitle = mTitle;
        this.mDesc = mDesc;
        this.mImage = mImage;
        this.mVideo = mVideo;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: called.");
        Glide.with(mContext)
                .asBitmap()
                .load(mImage.get(i))
                .into(viewHolder.image);

        viewHolder.title.setText(mTitle.get(i));
        viewHolder.desc.setText(mDesc.get(i));
viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick: clicked on: " + mTitle.get(i));
        Toast.makeText(mContext, mTitle.get(i), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(mContext, GalleryActivity.class);
        intent.putExtra("image_url", mImage.get(i));
        intent.putExtra("image_title", mTitle.get(i));
        intent.putExtra("image_desc", mDesc.get(i));
        intent.putExtra("video", mVideo.get(i));
        mContext.startActivity(intent);
    }
});

    }

    @Override
    public int getItemCount() {
        return mTitle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;
        TextView desc;
        LinearLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imagelogo);
            title = itemView.findViewById(R.id.textview1);
            desc = itemView.findViewById(R.id.textview2);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
