/*Nama File: Mahasiswa.java 
 * Deskripsi: berisi atribut dan method dalam class Mahasiswa
 * Pembuat: Dina Amelia
 * Tanggal: 26 Februari 2025
*/
import java.util.ArrayList;

public class Mahasiswa {
    /*ATRIBUT */
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    /*METHOD */
    //Konstruktor tanpa parameter
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>();
    }
    //Konstruktor dengan parameter 
    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali) {
        this.nim = nim;
        this.nama = nama;
        this.dosenWali = dosenWali;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }
    // Setter dan Getter untuk atribut-atribut
    public String getNim() {
        return nim; 
    }
    public void setNim(String nim) {
        this.nim = nim; 
    }
    public String getNama() {
        return nama; }
    public void setNama(String nama) {
        this.nama = nama; 
    }
    public String getProdi() {
        return prodi; 
    }
    public void setProdi(String prodi) {
        this.prodi = prodi; 
    }
    public Dosen getDosenWali() {
        return dosenWali; 
    }
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali; 
    }
    public Kendaraan getKendaraan() {
        return kendaraan; 
    }
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan; 
    }
    //Menambahkan sebuah Mata Kuliah
    public void addMatKul(MataKuliah matkul) {
        listMatKul.add(matkul);
    }
    //Memperoleh jumlah SKS
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }
    //Memperoleh jumlah matkul yang diambil setiap mahasiswa
    public int getJumlahMatKul() {
        return listMatKul.size();
    }
    //Menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi);
    }
    //Menampilkan detail
    public void printDetailMhs() {
        System.out.println("=== Detail Mahasiswa ===");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah matkul : listMatKul) {
            System.out.println("- " + matkul.getNama() + " (" + matkul.getSks() + " SKS)");
        }

        dosenWali.printDosen();

        if(getKendaraan() != null ){
            kendaraan.printKendaraan();
        }
        else{
            System.out.println();
        }
    }
}



