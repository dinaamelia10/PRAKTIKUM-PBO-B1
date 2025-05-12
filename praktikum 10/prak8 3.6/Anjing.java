/* Nama File: Anjing.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 */
public class Anjing extends Anabul {
    /*ATRIBUT */
    private String ras;
    
    /*METHOD */
    // Konstruktor
    public Anjing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }
    
    // Getter dan Setter
    public String getRas() {
        return ras;
    }
    
    public void setRas(String ras) {
        this.ras = ras;
    }
    
    // Override method abstract dari kelas induk
    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Guk-guk!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan cara melata.");
    }
    
    // Override method tampilInfo dari kelas induk
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Anjing");
        System.out.println("Ras: " + ras);
    }
}