package com.blogspot.onayub.pantau;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{


    List<Card> persons;

    RVAdapter(List<Card> persons){
        this.persons = persons;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

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

}
