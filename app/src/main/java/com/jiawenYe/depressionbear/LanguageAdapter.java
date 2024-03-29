package com.jiawenYe.depressionbear;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LanguageAdapter extends ArrayAdapter<LanguageItem> {
    public LanguageAdapter(Context context, ArrayList<LanguageItem> languagelist) {
        super(context, 0, languagelist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.country_spinner_row, parent, false
            );
        }
        ImageView imageViewFlag = convertView.findViewById(R.id.language_flag);
        TextView textViewName = convertView.findViewById(R.id.language_title);

        LanguageItem currentItem = getItem(position);
        if (currentItem != null) {
            imageViewFlag.setImageResource(currentItem.getmFlagImage());
            textViewName.setText(currentItem.getmLanguageName());
        }
        return convertView;
    }
}
