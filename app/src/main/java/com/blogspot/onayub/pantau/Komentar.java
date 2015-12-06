package com.blogspot.onayub.pantau;

import java.util.Date;

public class Komentar {
    private int foto;
    private String nama;
    private Date timestamp;
    private String komentar;

    public Komentar(int foto, String nama, String komentar) {
        this.foto = foto;
        this.nama = nama;
        this.komentar = komentar;
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }
}