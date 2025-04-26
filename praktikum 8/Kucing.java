/* Nama File: Kucing.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 25 April 2025
 */
public class Kucing extends Anabul {
    /*ATRIBUT */
    private String warnaBulu;
    
    //*METHOD */
    // Konstruktor
    public Kucing(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }
    
    // Getter dan Setter
    public String getWarnaBulu() {
        return warnaBulu;
    }
    
    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }
    
    // Override method abstract dari kelas induk
    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Meong!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan cara melata.");
    }
    
    // Override method tampilInfo dari kelas induk
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Kucing");
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}