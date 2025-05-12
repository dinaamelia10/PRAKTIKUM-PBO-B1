/**
 * File : PersegiPanjang.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 * Deskripsi : implementasi PersegiPanjang sebagai BangunDatar
 */

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar); // Keliling persegi panjang = 2 × (panjang + lebar)
    }
    
    public double hitungLuas() {
        return panjang * lebar; // Luas persegi panjang = panjang × lebar
    }
}