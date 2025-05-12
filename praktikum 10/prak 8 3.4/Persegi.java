/**
 * File : Persegi.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 * Deskripsi : implementasi Persegi sebagai BangunDatar
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi; // Keliling persegi = 4 × sisi
    }
    
    public double hitungLuas() {
        return sisi * sisi; // Luas persegi = sisi × sisi
    }
}