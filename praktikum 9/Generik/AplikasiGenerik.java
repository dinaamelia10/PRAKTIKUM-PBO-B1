/* Nama File: AplikasiGenerik.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 29 April 2025
 */

public class AplikasiGenerik {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SIMULASI ANABUL DENGAN GENERIK ===");
        System.out.println();
        
        // Membuat objek-objek Anabul
        Kucing kucing = new Kucing("Milo", 3, "Oranye");
        Anjing anjing = new Anjing("Buddy", 5, "Golden Retriever");
        Burung burung = new Burung("Tweety", 2, "Pendek");
        
        // a. Simulasi kelas generik Datum
        System.out.println("=== SIMULASI KELAS GENERIK DATUM ===");
        
        // Membuat objek Datum dengan tipe Kucing
        Datum<Kucing> datumKucing = new Datum<>(kucing);
        System.out.println("Datum dengan tipe Kucing:");
        datumKucing.printInfo();
        System.out.println();
        
        // Membuat objek Datum dengan tipe Anjing
        Datum<Anjing> datumAnjing = new Datum<>(anjing);
        System.out.println("Datum dengan tipe Anjing:");
        datumAnjing.printInfo();
        System.out.println();
        
        // Membuat objek Datum dengan tipe Burung
        Datum<Burung> datumBurung = new Datum<>(burung);
        System.out.println("Datum dengan tipe Burung:");
        datumBurung.printInfo();
        System.out.println();
        
        // Membuat objek Datum dengan tipe Anabul (polimorfisme)
        Datum<Anabul> datumAnabul = new Datum<>();
        datumAnabul.setIsi(kucing); // mengisi dengan objek Kucing
        System.out.println("Datum dengan tipe Anabul (diisi dengan Kucing):");
        datumAnabul.printInfo();
        System.out.println();
        
        // Mengganti isi datumAnabul dengan objek Anjing
        datumAnabul.setIsi(anjing);
        System.out.println("Datum dengan tipe Anabul (diisi dengan Anjing):");
        datumAnabul.printInfo();
        System.out.println();
        
        // b. Simulasi kelas ContohMetodeGenerik
        System.out.println("=== SIMULASI KELAS CONTOH METODE GENERIK ===");
        ContohMetodeGenerik metodeGenerik = new ContohMetodeGenerik();
        
        // Membuat objek Datum baru
        Datum<Kucing> datumKucingBaru = new Datum<>();
        Datum<Anabul> datumAnabulBaru = new Datum<>();
        
        // Menggunakan metode isiDatum
        System.out.println("Menggunakan metode isiDatum:");
        metodeGenerik.isiDatum(datumKucingBaru, new Kucing("Kitty", 2, "Putih"));
        metodeGenerik.isiDatum(datumAnabulBaru, new Burung("Rio", 1, "Panjang"));
        System.out.println();
        
        // Menggunakan metode tampilkanIsi
        System.out.println("Menggunakan metode tampilkanIsi:");
        metodeGenerik.tampilkanIsi(datumKucingBaru);
        metodeGenerik.tampilkanIsi(datumAnabulBaru);
        
        // Menggunakan metode isSameClass
        System.out.println("Menggunakan metode isSameClass:");
        boolean samaDatum1Dan2 = metodeGenerik.isSameClass(datumKucingBaru, datumAnjing);
        System.out.println("Apakah datumKucingBaru dan datumAnjing memiliki kelas yang sama? " + samaDatum1Dan2);
        
        boolean samaDatum2Dan3 = metodeGenerik.isSameClass(datumAnjing, datumBurung);
        System.out.println("Apakah datumAnjing dan datumBurung memiliki kelas yang sama? " + samaDatum2Dan3);
        System.out.println();
        
        // Menggunakan metode gantiNamaAnabul
        System.out.println("Menggunakan metode gantiNamaAnabul:");
        metodeGenerik.gantiNamaAnabul(datumKucingBaru, "Fluffy");
        System.out.println("Informasi setelah mengganti nama:");
        metodeGenerik.tampilkanIsi(datumKucingBaru);
        
        // Mencoba membuat Datum dengan tipe data non-Anabul
        System.out.println("Mencoba membuat Datum dengan tipe data non-Anabul:");
        Datum<String> datumString = new Datum<>("Ini adalah string");
        System.out.println("Isi datumString: " + datumString.getIsi());
        
        // Mencoba mengganti nama objek non-Anabul
        boolean hasilGantiNama = metodeGenerik.gantiNamaAnabul(datumString, "Nama Baru");
        System.out.println("Berhasil mengganti nama datumString? " + hasilGantiNama);
    }
}