/* Nama File: KoleksiAnabul.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 */

 import java.util.Random;

 /**
  * Kelas KoleksiAnabul yang menyimpan koleksi objek-objek Anabul
  */
 public class KoleksiAnabul {
     /* ATRIBUT */
     private Koleksi<Anabul> koleksiAnabul;
     private Random random = new Random();
     
     /* METHOD */
     // Konstruktor
     public KoleksiAnabul(int kapasitas) {
         this.koleksiAnabul = new Koleksi<>(kapasitas);
     }
     
     // Metode untuk mengisi koleksi dengan anabul secara acak
     public void isiKoleksiAcak(int jumlah) {
         if (jumlah > 0) {
             System.out.println("Mengisi koleksi dengan " + jumlah + " anabul acak...");
             for (int i = 0; i < jumlah; i++) {
                 tambahAnabulAcak();
             }
             System.out.println("Berhasil mengisi koleksi!");
         }
     }
     
     // Metode untuk menambahkan anabul acak ke koleksi
     public void tambahAnabulAcak() {
         // Menentukan jenis anabul acak (0=Kucing, 1=Anjing, 2=Burung)
         int jenisAnabul = random.nextInt(3);
         
         // Membuat nama acak
         String nama = generateRandomName();
         // Menentukan umur acak (1-10 tahun)
         int umur = random.nextInt(10) + 1;
         
         // Membuat objek anabul berdasarkan jenis yang dipilih secara acak
         Anabul anabul;
         switch (jenisAnabul) {
             case 0:
                 // Membuat kucing dengan warna bulu acak
                 String[] warnaKucing = {"Putih", "Hitam", "Oranye", "Abu-abu", "Belang"};
                 String warnaBulu = warnaKucing[random.nextInt(warnaKucing.length)];
                 anabul = new Kucing(nama, umur, warnaBulu);
                 break;
                 
             case 1:
                 // Membuat anjing dengan ras acak
                 String[] rasAnjing = {"Golden Retriever", "Siberian Husky", "Poodle", "Bulldog", "Chihuahua"};
                 String ras = rasAnjing[random.nextInt(rasAnjing.length)];
                 anabul = new Anjing(nama, umur, ras);
                 break;
                 
             case 2:
                 // Membuat burung dengan jenis paruh acak
                 String[] jenisParuh = {"Pendek", "Panjang", "Tebal", "Tipis", "Melengkung"};
                 String paruh = jenisParuh[random.nextInt(jenisParuh.length)];
                 anabul = new Burung(nama, umur, paruh);
                 break;
                 
             default:
                 // Default jika ada kesalahan
                 anabul = new Kucing(nama, umur, "Putih");
         }
         
         // Menambahkan anabul ke koleksi
         koleksiAnabul.add(anabul);
     }
     
     // Metode untuk menampilkan semua anabul dalam koleksi
     public void tampilkanSemuaAnabul() {
         System.out.println("=== KOLEKSI ANABUL ===");
         System.out.println("Jumlah anabul: " + koleksiAnabul.getSize());
         
         for (int i = 0; i < koleksiAnabul.getSize(); i++) {
             Anabul anabul = koleksiAnabul.getIsi(i);
             
             System.out.println("\n----- Anabul ke-" + (i + 1) + " -----");
             anabul.printInfo();
             anabul.bersuara();
             anabul.bergerak();
         }
         
         System.out.println("\n=====================");
     }
     
     // Metode untuk mendapatkan koleksi
     public Koleksi<Anabul> getKoleksi() {
         return koleksiAnabul;
     }
     
     // Metode untuk menambahkan anabul spesifik ke koleksi
     public boolean tambahAnabul(Anabul anabul) {
         return koleksiAnabul.add(anabul);
     }
     
     // Metode untuk menghapus anabul pada indeks tertentu
     public boolean hapusAnabul(int indeks) {
         return koleksiAnabul.delete(indeks);
     }
     
     // Metode pembantu untuk menghasilkan nama acak
     private String generateRandomName() {
         // Daftar nama-nama populer untuk hewan peliharaan
         String[] namaHewan = {
             "Max", "Bella", "Charlie", "Luna", "Lucy", "Daisy", "Simba", "Rocky", 
             "Milo", "Leo", "Nala", "Coco", "Oscar", "Ruby", "Jack", "Lily",
             "Toby", "Molly", "Rex", "Zoe", "Buddy", "Lola", "Duke", "Sophie",
             "Cooper", "Stella", "Bear", "Penny", "Tucker", "Angel", "Murphy", "Roxy"
         };
         
         return namaHewan[random.nextInt(namaHewan.length)];
     }
 }