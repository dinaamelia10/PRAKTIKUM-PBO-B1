/* Nama File: Main.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 */

/**
 * Program aplikasi untuk mendemonstrasikan penggunaan kelas Koleksi dengan tipe data Character
 * untuk memenuhi tugas 3.5
 */
public class Main{
    public static void main(String[] args) {
        System.out.println("=== PROGRAM KOLEKSI CHARACTER ===");
        System.out.println();
        
        // Membuat objek Koleksi dengan tipe Character dan kapasitas 10
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);
        
        // Menambahkan 10 karakter ke koleksi
        char[] karakterUntukDitambahkan = {'J', 'A', 'V', 'A', 'P', 'R', 'O', 'G', 'R', 'M'};
        
        System.out.println("Menambahkan 10 karakter ke koleksi...");
        for (char c : karakterUntukDitambahkan) {
            koleksiKarakter.add(c);
            System.out.println("Menambahkan karakter: " + c);
        }
        System.out.println();
        
        // Menampilkan semua elemen koleksi
        System.out.println("Menampilkan semua elemen koleksi:");
        koleksiKarakter.showAll();
        System.out.println();
        
        // Mendemonstrasikan method getIsi
        System.out.println("Demonstrasi method getIsi:");
        System.out.println("Karakter pada indeks 2: " + koleksiKarakter.getIsi(2));
        System.out.println("Karakter pada indeks 7: " + koleksiKarakter.getIsi(7));
        System.out.println();
        
        // Mendemonstrasikan method setIsi (edit/update)
        System.out.println("Demonstrasi method setIsi (update):");
        System.out.println("Mengubah karakter pada indeks 9 dari 'M' menjadi 'A'");
        koleksiKarakter.setIsi(9, 'A');
        System.out.println("Setelah perubahan, karakter pada indeks 9: " + koleksiKarakter.getIsi(9));
        System.out.println();
        
        // Menampilkan koleksi setelah update
        System.out.println("Menampilkan koleksi setelah update:");
        koleksiKarakter.showAll();
        System.out.println();
        
        // Mendemonstrasikan method delete
        System.out.println("Demonstrasi method delete:");
        System.out.println("Menghapus karakter pada indeks 3");
        koleksiKarakter.delete(3);
        System.out.println();
        
        // Menampilkan koleksi setelah delete
        System.out.println("Menampilkan koleksi setelah delete:");
        koleksiKarakter.showAll();
        System.out.println();
        
        // Mendemonstrasikan method getSize
        System.out.println("Demonstrasi method getSize:");
        System.out.println("Ukuran koleksi saat ini: " + koleksiKarakter.getSize());
        System.out.println();
        
        // Mendemonstrasikan method setSize
        System.out.println("Demonstrasi method setSize:");
        System.out.println("Mengubah ukuran koleksi menjadi 7");
        koleksiKarakter.setSize(7);
        System.out.println("Ukuran koleksi setelah perubahan: " + koleksiKarakter.getSize());
        System.out.println();
        
        // Menampilkan koleksi setelah setSize
        System.out.println("Menampilkan koleksi setelah setSize:");
        koleksiKarakter.showAll();
        System.out.println();
        
        // Mencoba menambahkan karakter lagi
        System.out.println("Mencoba menambahkan karakter lagi:");
        koleksiKarakter.add('X');
        koleksiKarakter.add('Y');
        koleksiKarakter.add('Z');
        
        // Menampilkan koleksi final
        System.out.println("Menampilkan koleksi final:");
        koleksiKarakter.showAll();
    }
}