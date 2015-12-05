package com.blogspot.onayub.pantau;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SummaryAdapter extends RecyclerView.Adapter<SummaryAdapter.PersonViewHolder>{


    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView pemerintah;
        TextView departemen;
        RelativeLayout anggar;
        RelativeLayout masuk;
        RelativeLayout keluar;
        TextView anggaran;
        TextView pemasukan;
        TextView pengeluaran;

        PersonViewHolder(View itemView) {
            super(itemView);

            cv = (CardView)itemView.findViewById(R.id.card_summary);
            pemerintah=(TextView)itemView.findViewById(R.id.pemerintah);
            departemen=(TextView)itemView.findViewById(R.id.departemen);

            anggar=(RelativeLayout)itemView.findViewById(R.id.anggaran);
            masuk=(RelativeLayout)itemView.findViewById(R.id.pemasukan);
            keluar=(RelativeLayout)itemView.findViewById(R.id.pengeluaran);

            anggaran=(TextView)itemView.findViewById(R.id.nominal_anggaran);
            pemasukan=(TextView)itemView.findViewById(R.id.nominal_pemasukan);
            pengeluaran=(TextView)itemView.findViewById(R.id.nominal_pengeluaran);
        }
    }
    List<Summary> summaries;

    SummaryAdapter(List<Summary> summaries){
        this.summaries = summaries;
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
        personViewHolder.pemerintah.setText(summaries.get(i).getPemerintah());
        personViewHolder.departemen.setText(summaries.get(i).getDepartemen());


        personViewHolder.anggaran.setText(String.valueOf(summaries.get(i).getAnggaran()));
        personViewHolder.pemasukan.setText(String.valueOf(summaries.get(i).getPemasukan()));
        personViewHolder.pengeluaran.setText(String.valueOf(summaries.get(i).getPengeluaran()));

        //summaries.get(i).setAnggaran_percent(personViewHolder.anggaran.getWidth());
        //int width= personViewHolder.anggar.getWidth();
        //personViewHolder.masuk.setScaleX((float) 0.50/*(Float.floatToIntBits(summaries.get(i).getPemasukan_percent()))*/);
        personViewHolder.masuk.setTranslationX((float) -0.5*400);
        personViewHolder.keluar.setTranslationX((float) -0.75*400);
        //personViewHolder.keluar.setScaleX((float)0.25/*(Float.floatToIntBits(summaries.get(i).getPengeluaran_percent()))*/);
    }

    @Override
    public int getItemCount() {
        return summaries.size();
    }
}
