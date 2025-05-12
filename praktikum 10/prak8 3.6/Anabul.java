/* Nama File: Anabul.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 */
public abstract class Anabul {
    /*ATRIBUT */
    private String nama;
    private int umur;
    
    /*METHOD */
    // Konstruktor
    public Anabul(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    // Method abstract yang akan diimplementasikan oleh kelas anak
    public abstract void bersuara();
    public abstract void bergerak();
    
    // Method untuk menampilkan informasi Anabul
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}