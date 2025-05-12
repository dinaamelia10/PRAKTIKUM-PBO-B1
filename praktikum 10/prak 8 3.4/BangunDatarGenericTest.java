/**
 * File : BangunDatarGenericTest2.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 * Deskripsi : main class untuk menguji generic bangun datar dengan berbagai bentuk
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = 
            new BangunDatarGeneric<Lingkaran>();
        bdgLingkaran.set(lingkaran);
        
        // Membuat objek persegi
        Persegi persegi = new Persegi(5);
        BangunDatarGeneric<Persegi> bdgPersegi = 
            new BangunDatarGeneric<Persegi>();
        bdgPersegi.set(persegi);
        
        // Membuat objek persegi panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(8, 4);
        BangunDatarGeneric<PersegiPanjang> bdgPersegiPanjang = 
            new BangunDatarGeneric<PersegiPanjang>();
        bdgPersegiPanjang.set(persegiPanjang);
        
        // Membuat objek segitiga
        Segitiga segitiga = new Segitiga(6);
        BangunDatarGeneric<Segitiga> bdgSegitiga = 
            new BangunDatarGeneric<Segitiga>();
        bdgSegitiga.set(segitiga);
        
        // Menampilkan hasil keliling dan luas untuk setiap bangun datar
        System.out.println("==== Keliling dan Luas Bangun Datar ====");
        
        System.out.println("--- LINGKARAN ---");
        System.out.println("Keliling Lingkaran : " + bdgLingkaran.hitungKeliling());
        System.out.println("Luas Lingkaran : " + bdgLingkaran.hitungLuas());
        System.out.println("Tipe generic : " + bdgLingkaran.get().getClass().getName());
        System.out.println();
        
        System.out.println("--- PERSEGI ---");
        System.out.println("Keliling Persegi : " + bdgPersegi.hitungKeliling());
        System.out.println("Luas Persegi : " + bdgPersegi.hitungLuas());
        System.out.println("Tipe generic : " + bdgPersegi.get().getClass().getName());
        System.out.println();
        
        System.out.println("--- PERSEGI PANJANG ---");
        System.out.println("Keliling Persegi Panjang : " + bdgPersegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang : " + bdgPersegiPanjang.hitungLuas());
        System.out.println("Tipe generic : " + bdgPersegiPanjang.get().getClass().getName());
        System.out.println();
        
        System.out.println("--- SEGITIGA ---");
        System.out.println("Keliling Segitiga : " + bdgSegitiga.hitungKeliling());
        System.out.println("Luas Segitiga : " + bdgSegitiga.hitungLuas());
        System.out.println("Tipe generic : " + bdgSegitiga.get().getClass().getName());
    }
}