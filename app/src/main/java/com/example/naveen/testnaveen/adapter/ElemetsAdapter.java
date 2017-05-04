package com.example.naveen.testnaveen.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.naveen.testnaveen.R;
import com.example.naveen.testnaveen.helpers.Elements;

import java.util.List;

/**
 * Created by USer on 5/4/2017.
 */

public class ElemetsAdapter extends RecyclerView.Adapter<ElemetsAdapter.MyViewHolder> {
    private List<Elements> elemetsList;
    private Context context;

    public ElemetsAdapter(Context context,List<Elements> elemetsList) {
        this.elemetsList = elemetsList;
        this.context=context;
    }

    @Override
    public ElemetsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elements_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Elements movie = elemetsList.get(position);
        holder.heading.setText(movie.getTitle());
        holder.time.setText(movie.getTime());
        holder.detail.setText(movie.getContent());

        ImageView icon = holder.imageView;
        Glide.with(context).load(movie.getImages()).into(icon);

    }

    @Override
    public int getItemCount() {
        return elemetsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView heading, time, detail;
        ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            heading = (TextView) view.findViewById(R.id.heading);
            time = (TextView) view.findViewById(R.id.time);
            detail = (TextView) view.findViewById(R.id.detail);
            imageView = (ImageView) view.findViewById(R.id.imageView);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
