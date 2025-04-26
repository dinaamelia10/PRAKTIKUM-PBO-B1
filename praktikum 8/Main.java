/* Nama File: Main.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 25 April 2025
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SIMULASI ANABUL ===");
        System.out.println();
        
        // Membuat objek dari setiap kelas anak
        Kucing kucing = new Kucing("Milo", 3, "Oranye");
        Anjing anjing = new Anjing("Buddy", 5, "Golden Retriever");
        Burung burung = new Burung("Tweety", 2, "Pendek");
        
        // Array Anabul untuk menampung semua objek (Polimorfisme)
        Anabul[] daftarAnabul = {kucing, anjing, burung};
        
        // Mensimulasikan setiap anabul
        for (Anabul anabul : daftarAnabul) {
            System.out.println("=== Informasi Anabul ===");
            anabul.printInfo();
            System.out.println();
            
            // Late binding/dynamic binding - method yang dijalankan ditentukan saat runtime
            anabul.bersuara();
            anabul.bergerak();
            
            System.out.println("=======================");
            System.out.println();
        }
        
        // Menunjukkan penggunaan binding secara eksplisit
        System.out.println("=== DEMONSTRASI BINDING ===");
        Anabul anabulBaru = new Kucing("Kitty", 1, "Putih");
        anabulBaru.bersuara(); // akan memanggil method bersuara() dari kelas Kucing
        
        // Casting untuk mengakses method khusus dari kelas anak
        if (anabulBaru instanceof Kucing) {
            System.out.println("Warna bulu: " + ((Kucing)anabulBaru).getWarnaBulu());
        }
    }
}