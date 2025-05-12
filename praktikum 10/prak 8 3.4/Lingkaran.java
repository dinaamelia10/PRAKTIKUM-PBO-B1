/**
 * File : Lingkaran.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
    
    public double hitungLuas(){
        return jejari * jejari * 3.14; // Luas lingkaran = πr²
    }
}