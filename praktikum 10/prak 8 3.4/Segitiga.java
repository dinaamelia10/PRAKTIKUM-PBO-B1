/**
 * File : Segitiga.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 */

public class Segitiga extends BangunDatar {
    private double sisiA;
    private double sisiB;
    private double sisiC;
    private double alas;
    private double tinggi;

    // Constructor untuk segitiga dengan tiga sisi (untuk menghitung keliling)
    // dan alas serta tinggi (untuk menghitung luas)
    public Segitiga(double sisiA, double sisiB, double sisiC, double alas, double tinggi) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Constructor sederhana untuk segitiga sama sisi
    public Segitiga(double sisi) {
        this.sisiA = sisi;
        this.sisiB = sisi;
        this.sisiC = sisi;
        this.alas = sisi;
        // Tinggi segitiga sama sisi = (sisi × √3)/2
        this.tinggi = (sisi * Math.sqrt(3)) / 2;
    }

    public double hitungKeliling() {
        return sisiA + sisiB + sisiC; // Keliling segitiga = jumlah ketiga sisi
    }
    
    public double hitungLuas() {
        return 0.5 * alas * tinggi; // Luas segitiga = 1/2 × alas × tinggi
    }
}