package com.blogspot.onayub.pantau;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personJob;
        ImageView personPhoto;
        ImageView nota;
        ImageView in_out;
        TextView nominal;
        Button komentar;
        Button rincian;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            personName = (TextView)itemView.findViewById(R.id.nama);
            personPhoto= (ImageView)itemView.findViewById(R.id.foto_profil);
            personJob = (TextView)itemView.findViewById(R.id.jabatan);
            nota = (ImageView)itemView.findViewById(R.id.nota);
            in_out=(ImageView)itemView.findViewById(R.id.tanda);
            nominal=(TextView)itemView.findViewById(R.id.nominal);
            komentar=(Button)itemView.findViewById(R.id.komentar);
            rincian=(Button)itemView.findViewById(R.id.rincian);
        }
    }
    List<Card> cards;

    RVAdapter(List<Card> cards){
        this.cards = cards;
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.overview_tab, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(cards.get(i).getNama());
        personViewHolder.personJob.setText(cards.get(i).getJabatan());
        personViewHolder.personPhoto.setImageResource(cards.get(i).getFoto());
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
}
