package com.test.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ChordViewHolder> {

    private Context mContext;
    private int[] mChordList;
    private String[] mChordName;

    MyAdapter(Context mContext, int[] mChordList, String[] mChordName) {
        this.mContext = mContext;
        this.mChordList = mChordList;
        this.mChordName = mChordName;
    }

    public static class ChordViewHolder extends RecyclerView.ViewHolder {
        private ImageView mChord;
        private TextView mName;


        public ChordViewHolder(View itemView) {
            super(itemView);

            mChord = (ImageView) itemView.findViewById(R.id.chord);
            mName = itemView.findViewById(R.id.chord_name);
        }

        public void bind(int chordImage, String chordName) {
            mChord.setImageResource(chordImage);
            mName.setText(chordName);
        }
    }

    @Override
    public ChordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recycler_view_item,
                parent, false);
        return new ChordViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ChordViewHolder holder, int position) {
        holder.bind(mChordList[position], mChordName[position]);
    }


    @Override
    public int getItemCount() {

        return mChordList.length;
    }

}


