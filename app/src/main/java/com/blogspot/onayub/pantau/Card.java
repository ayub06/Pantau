package com.blogspot.onayub.pantau;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sendt on 12/5/2015.
 */
public class Card {
    private ImageView foto;
    private TextView nama;
    private TextView jabatan;
    private ImageView nota;
    private ImageView tanda;
    private TextView nominal;
    private Button komentar;
    private Button rincian;

    public ImageView getFoto() {
        return foto;
    }

    public void setFoto(ImageView foto) {
        this.foto = foto;
    }

    public TextView getNama() {
        return nama;
    }

    public void setNama(TextView nama) {
        this.nama = nama;
    }

    public TextView getJabatan() {
        return jabatan;
    }

    public void setJabatan(TextView jabatan) {
        this.jabatan = jabatan;
    }

    public ImageView getNota() {
        return nota;
    }

    public void setNota(ImageView nota) {
        this.nota = nota;
    }

    public ImageView getTanda() {
        return tanda;
    }

    public void setTanda(ImageView tanda) {
        this.tanda = tanda;
    }

    public TextView getNominal() {
        return nominal;
    }

    public void setNominal(TextView nominal) {
        this.nominal = nominal;
    }

    public Button getKomentar() {
        return komentar;
    }

    public void setKomentar(Button komentar) {
        this.komentar = komentar;
    }

    public Button getRincian() {
        return rincian;
    }

    public void setRincian(Button rincian) {
        this.rincian = rincian;
    }
}
