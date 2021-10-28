package com.example.tugasrumah4;

public class Item {
    private String nama,genre,asal;
    private int logo;

    public Item(String nama, String genre,String asal, int logo) {
        this.nama = nama;
        this.genre = genre;
        this.asal = asal;
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getgenre() {
        return genre;
    }

    public void setasal(String asal) {
        this.asal = asal;
    }

    public String getAsal(){return asal;}

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}

