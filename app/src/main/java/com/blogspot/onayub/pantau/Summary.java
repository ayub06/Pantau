package com.blogspot.onayub.pantau;

import android.widget.Toast;

public class Summary {
    private String pemerintah;
    private String departemen;
    private long anggaran;
    private long pemasukan;
    private long pengeluaran;
    private float anggaran_percent;

    public Summary(String pemerintah, String departemen, long anggaran, long pemasukan, long pengeluaran) {
        this.pemerintah = pemerintah;
        this.departemen = departemen;
        this.anggaran = anggaran;
        this.pemasukan = pemasukan;
        this.pengeluaran = pengeluaran;
    }

    public Summary(String pemerintah, String departemen) {
        this.pemerintah = pemerintah;
        this.departemen = departemen;
    }

    public String getPemerintah() {
        return pemerintah;
    }

    public void setPemerintah(String pemerintah) {
        this.pemerintah = pemerintah;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public long getAnggaran() {
        return anggaran;
    }

    public void setAnggaran(long anggaran) {
        this.anggaran = anggaran;
    }

    public long getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(long pemasukan) {
        this.pemasukan = pemasukan;
    }

    public long getPengeluaran() {
        return pengeluaran;
    }

    public void setPengeluaran(long pengeluaran) {
        this.pengeluaran = pengeluaran;
    }

    public void setAnggaran_percent(float anggaran_percent) {
        this.anggaran_percent = anggaran_percent;
    }

    public float getAnggaran_percent() {
        return anggaran_percent;
    }

    public float getPemasukan_percent() {
        return (getPemasukan()/getAnggaran())*anggaran_percent;
    }

    public float getPengeluaran_percent() {
        return (getPengeluaran()/getAnggaran())*anggaran_percent;
    }

}
