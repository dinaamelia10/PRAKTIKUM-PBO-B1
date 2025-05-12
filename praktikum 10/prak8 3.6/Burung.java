/* Nama File: Burung.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 */
public class Burung extends Anabul {
    /*ATRIBUT */
    private String jenisParuh;
    
    /*METHOD */
    // Konstruktor
    public Burung(String nama, int umur, String jenisParuh) {
        super(nama, umur);
        this.jenisParuh = jenisParuh;
    }
    
    // Getter dan Setter
    public String getJenisParuh() {
        return jenisParuh;
    }
    
    public void setJenisParuh(String jenisParuh) {
        this.jenisParuh = jenisParuh;
    }
    
    // Override method abstract dari kelas induk
    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Cuit!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan cara terbang.");
    }
    
    // Override method tampilInfo dari kelas induk
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Burung");
        System.out.println("Jenis Paruh: " + jenisParuh);
    }
}