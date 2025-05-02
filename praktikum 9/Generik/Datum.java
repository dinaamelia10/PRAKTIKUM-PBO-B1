/* Nama File: Datum.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 29 April 2025
 */

/**
 * Kelas generik yang menyimpan data dengan tipe generik T
 * @param <T> Tipe data yang akan disimpan oleh objek Datum
 */
public class Datum<T> {
    /* ATRIBUT */
    private T isi;
    
    /* METHOD */
    // Konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }
    
    // Konstruktor default
    public Datum() {
        this.isi = null;
    }
    
    // Getter dan Setter
    public T getIsi() {
        return isi;
    }
    
    public void setIsi(T isi) {
        this.isi = isi;
    }
    
    // Method untuk menampilkan informasi isi
    public void printInfo() {
        if (isi != null) {
            System.out.println("Isi Datum: " + isi.getClass().getSimpleName());
            
            // Jika isi adalah instance dari Anabul, tampilkan informasi anabul
            if (isi instanceof Anabul) {
                ((Anabul) isi).printInfo();
                ((Anabul) isi).bersuara();
                ((Anabul) isi).bergerak();
            }
        } else {
            System.out.println("Datum kosong");
        }
    }
}