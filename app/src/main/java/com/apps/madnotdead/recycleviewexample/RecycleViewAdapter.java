package com.apps.madnotdead.recycleviewexample;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by O23002 on 2016-12-28.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    //FUUUUUCK

    ArrayList<Person> mPeople;

    public RecycleViewAdapter(ArrayList<Person> people){
        mPeople = people;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_recycle_view, parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public int getItemCount() {
        return mPeople.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Person person = mPeople.get(position);

        holder.mTitleView.setText(person.mName);
        holder.mSubTitleView.setText(person.mAge);
        //holder.mImageView.setImageResource();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public CardView mCardView;
        public ImageView mImageView;
        public TextView mTitleView;
        public TextView mSubTitleView;

        public MyViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView)itemView.findViewById(R.id.cardview);
            mImageView = (ImageView)itemView.findViewById(R.id.person_photo);
            mTitleView = (TextView)itemView.findViewById(R.id.person_name);
            mSubTitleView = (TextView)itemView.findViewById(R.id.person_age);

        }
    }
}
