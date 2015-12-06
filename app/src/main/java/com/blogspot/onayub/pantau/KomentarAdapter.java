package com.blogspot.onayub.pantau;

import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class KomentarAdapter extends RecyclerView.Adapter<KomentarAdapter.PersonViewHolder>{


    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        ImageView foto;
        TextView nama;
        TextView komentar;

        PersonViewHolder(View itemView) {
            super(itemView);
            foto=(ImageView) itemView.findViewById(R.id.foto_komen);
            nama=(TextView) itemView.findViewById(R.id.nama_komen);
            komentar=(TextView) itemView.findViewById(R.id.komen);
        }
    }
    List<Komentar> komentars;

    KomentarAdapter(List<Komentar> komentars){
        this.komentars = komentars;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.summary_tab, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.nama.setText(komentars.get(i).getNama());
        personViewHolder.komentar.setText(komentars.get(i).getKomentar());
        personViewHolder.foto.setImageResource(komentars.get(i).getFoto());
    }

    @Override
    public int getItemCount() {
        return komentars.size();
    }
}
