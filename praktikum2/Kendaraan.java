/*Nama File: Kendaraan.java 
 * Deskripsi: berisi atribut dan method dalam class Kendaraan
 * Pembuat: Dina Amelia
 * Tanggal: 26 Februari 2025
*/
public class Kendaraan {
    /*ATRIBUT */
    private String noPlat;
    private String jenis;
    
    /*METHOD */
    //Konstruktor tanpa parameter 
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    public String getNoPlat() { 
        return noPlat; 
    }
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat; 
    }
    public String getJenis() {
        return jenis; 
    }
    public void setJenis(String jenis) {
        this.jenis = jenis; 
    }
    //Menampilkan kendaraan mahasiswa 
    public void printKendaraan(){
        System.out.println("Kendaraan: " + getJenis() );
        System.out.println("No Plat: " + getNoPlat());
    }  
}