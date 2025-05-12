/* Nama File: Main.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 */

 public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM KOLEKSI ANABUL ===");
        System.out.println();
        
        // Membuat objek KoleksiAnabul dengan kapasitas 10
        KoleksiAnabul koleksiAnabul = new KoleksiAnabul(10);

        // Mengisi koleksi dengan 10 anabul acak
        koleksiAnabul.isiKoleksiAcak(10);
        System.out.println();
        
        // Menampilkan semua anabul dalam koleksi
        koleksiAnabul.tampilkanSemuaAnabul();
        
        // Demonstrasi manipulasi koleksi
        System.out.println("\n=== DEMONSTRASI MANIPULASI KOLEKSI ===");
        
        // 1. Menambahkan anabul spesifik
        System.out.println("\n1. Menambahkan anabul spesifik:");
        System.out.println("Mencoba menambahkan anabul baru (akan gagal karena koleksi sudah penuh):");
        Kucing kucingBaru = new Kucing("Whiskers", 4, "Hitam-Putih");
        boolean hasilTambah = koleksiAnabul.tambahAnabul(kucingBaru);
        System.out.println("Berhasil menambahkan? " + hasilTambah);
        
        // 2. Menghapus anabul dari koleksi
        System.out.println("\n2. Menghapus anabul dari koleksi:");
        System.out.println("Menghapus anabul pada indeks 0:");
        boolean hasilHapus = koleksiAnabul.hapusAnabul(0);
        System.out.println("Berhasil menghapus? " + hasilHapus);
        
        // Sekarang koleksi memiliki 9 anabul
        System.out.println("\nSetelah menghapus anabul pertama, jumlah anabul: " + 
                          koleksiAnabul.getKoleksi().getSize());
        
        // 3. Menambahkan anabul spesifik lagi (sekarang akan berhasil)
        System.out.println("\n3. Menambahkan anabul spesifik lagi:");
        System.out.println("Mencoba menambahkan Whiskers kembali:");
        hasilTambah = koleksiAnabul.tambahAnabul(kucingBaru);
        System.out.println("Berhasil menambahkan? " + hasilTambah);
        
        // 4. Menampilkan koleksi setelah manipulasi
        System.out.println("\n4. Menampilkan koleksi setelah manipulasi:");
        koleksiAnabul.tampilkanSemuaAnabul();
        
        // 5. Mengakses dan memodifikasi anabul spesifik
        System.out.println("\n5. Mengakses dan memodifikasi anabul spesifik:");
        Anabul anabulTertentu = koleksiAnabul.getKoleksi().getIsi(5);
        System.out.println("Informasi anabul indeks 5 sebelum dimodifikasi:");
        anabulTertentu.printInfo();
        
        // Mengubah nama anabul
        System.out.println("\nMengubah nama anabul indeks 5:");
        anabulTertentu.setNama("Jagoan");
        
        System.out.println("\nInformasi anabul indeks 5 setelah dimodifikasi:");
        anabulTertentu.printInfo();
        anabulTertentu.bersuara();
        anabulTertentu.bergerak();
    }
}