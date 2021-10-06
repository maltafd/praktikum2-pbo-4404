package com.company;

public class Buku {
    private String isbn;
    private String judul;
    private String thnterbit;
    private int harga;
    private float rating;

    public Buku(String isbn, String judul, String thnterbit, int harga, float rating) {
        this.isbn = isbn;
        this.judul = judul;
        this.thnterbit = thnterbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getisbn(){
        return isbn;
    }

    public String getjudul(){
        return judul;
    }

    public void setjudul(String judul){
        this.judul = judul;
    }

    public String getthnterbit(){
        return thnterbit;
    }

    public void setthnterbit(String thnterbit){
        this.thnterbit = thnterbit;
    }

    public int getharga(){
        return harga;
    }

    public void setharga(int harga){
        this.harga = harga;
    }

    public float getrating(){
        return rating;
    }

    public void setrating(float rating){
        this.rating = rating;
    }

    public void searchisbn(String isbn){
        if (this.isbn.equalsIgnoreCase(isbn)){
            System.out.println(isbn + " | " + judul + " | " + thnterbit + " | " + harga + " | " + rating + "\n");
        }
    }

    @Override
    public String toString(){
        return isbn + " | " + judul + " | " + thnterbit + " | " + harga + " | " + rating;
    }
}


