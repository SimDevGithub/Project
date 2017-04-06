package com.example.android.project.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.project.R;

import java.util.List;

/**
 * Created by Android on 2017/4/1.
 */

public class AdapterImage extends RecyclerView.Adapter {

    private List<String> list;
    private Context context;

    public AdapterImage(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageHolder(LayoutInflater.from(context).inflate(R.layout.item_image, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ImageHolder imageHolder = ((ImageHolder) holder);
        Glide.with(context).load(list.get(position)).fitCenter().centerCrop().into(imageHolder.imageView);
        imageHolder.textview.setText("美图");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ImageHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textview;

        public ImageHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textview = (TextView) itemView.findViewById(R.id.textview);
        }
    }
}
