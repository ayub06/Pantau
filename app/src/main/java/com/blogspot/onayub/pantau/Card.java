package com.blogspot.onayub.pantau;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sendt on 12/5/2015.
 */
public class Card {
    private int foto;
    private String nama;
    private String jabatan;
    private int nota;
    private int tanda;
    private long nominal;
    private String komentar;
    private String rincian;

    public Card(String nama, String jabatan, int foto) {
        this.foto = foto;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getTanda() {
        return tanda;
    }

    public void setTanda(int tanda) {
        this.tanda = tanda;
    }

    public long getNominal() {
        return nominal;
    }

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public String getRincian() {
        return rincian;
    }

    public void setRincian(String rincian) {
        this.rincian = rincian;
    }
}
