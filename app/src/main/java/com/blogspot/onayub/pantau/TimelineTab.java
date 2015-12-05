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

public class TimelineTab extends Fragment {

    private List<Card> card;
    private RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.timeline_tab, container, false);
        rv = (RecyclerView)rootView.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);

        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.aku);
        RoundedImageView.getCroppedBitmap(bm,55);


        card = new ArrayList<>();
        card.add(new Card("Ayyub", "Ketua Bidang SosHum", R.drawable.aku));
        card.add(new Card("Ayyub", "Ketua Bidang Ini", R.drawable.aku));
        card.add(new Card("Ayyub", "Ketua Bidang Lain", R.drawable.aku));

        TimelineAdapter adapter = new TimelineAdapter(card);
        rv.setAdapter(adapter);
        return rootView;
    }
}