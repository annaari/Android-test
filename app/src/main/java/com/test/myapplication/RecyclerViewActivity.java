package com.test.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewActivity extends Activity {
    RecyclerView mRecyclerView;
    int[] mChordList;
    String[] mChordNameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setActionBar(myToolbar);

        mRecyclerView = findViewById(R.id.recycler_view_main);
        LinearLayoutManager mGridLayoutManager = new GridLayoutManager(RecyclerViewActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        mChordList = new int[]{R.drawable.a_chord, R.drawable.am_chord, R.drawable.b_chord, R.drawable.bm_chord,
                R.drawable.c_chord, R.drawable.cm_chord, R.drawable.d_chord, R.drawable.dm_chord,
                R.drawable.e_chord, R.drawable.em_chord, R.drawable.f_chord, R.drawable.fm_chord,
                R.drawable.g_chord, R.drawable.gm_chord};
        mChordNameList = new String[]{"A", "Am", "B", "Bm", "C", "Cm", "D", "Dm", "E", "Em", "F", "Fm", "G", "Gm"};

        MyAdapter myAdapter = new MyAdapter(RecyclerViewActivity.this, mChordList, mChordNameList);
        mRecyclerView.setAdapter(myAdapter);
    }

}
