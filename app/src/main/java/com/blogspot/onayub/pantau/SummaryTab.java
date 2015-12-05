package com.blogspot.onayub.pantau;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SummaryTab extends Fragment {
    private List<Summary> summaries;
    private RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.summary_tab_rv, container, false);
        rv = (RecyclerView)rootView.findViewById(R.id.rv2);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);

        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.aku);
        RoundedImageView.getCroppedBitmap(bm, 55);


        Summary jogja=new Summary("Yogyakarta","Departemen Kesehatan",
                            4000,10,5);

        summaries = new ArrayList<Summary>();
        summaries.add(jogja);

        SummaryAdapter adapter = new SummaryAdapter(summaries);
        rv.setAdapter(adapter);
        return rootView;
    }
}