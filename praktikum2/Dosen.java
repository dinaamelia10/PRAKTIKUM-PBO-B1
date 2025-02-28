/*Nama File: Dosen.java 
 * Deskripsi: berisi atribut dan method dalam class Dosen
 * Pembuat: Dina Amelia
 * Tanggal: 26 Februari 2025
*/
public class Dosen {
    /*ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;
    
    /*METHOD */
    //Konstruktor tanpa parameter 
    public Dosen() {
        nip = "#";
        nama = "#";
        prodi = "#";
    }
    //Konstruktor dengan parameter 
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    //Selektor dan Mutator masing masing atribut 
    public String getNip() { 
        return nip; 
    }
    public void setNip(String nip) { 
        this.nip = nip; 
    }
    public String getNama() {
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public String getProdi() {
        return prodi; 
    }
    public void setProdi(String prodi) {
        this.prodi = prodi; 
    }
    //Menampilkan dosen sebagai dosen wali 
    public void printDosen() {
        System.out.println("Dosen Wali: " + getNama() + " \nNIP: " + getNip() + " \nProdi: " + getProdi() + "");
    }

}

