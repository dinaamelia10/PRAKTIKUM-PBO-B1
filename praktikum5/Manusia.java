/* 
 * Nama File : Manusia.java 
 * Nama Pembuat : Dina Amelia
 * NIM : 24060123120016
 */
import java.text.DecimalFormat;

public abstract class Manusia {
    protected String nama;
    protected String alamat;
    protected double pendapatan;
    protected String tglMulaiKerja;
    private static int counterMns = 0;
    

    //Konstruktor tanpa parameter 
    public Manusia(){
        nama = " ";
        alamat = " ";
        pendapatan = 0.0;
        tglMulaiKerja = " ";
    }

    //Konstruktor dengan parameter 
    public Manusia(String nama, String tglMulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //getter dan setter nama 
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    //getter dan setter alamat
    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    //getter dan setter pendapatan 
    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    //Static getter untuk counter
    public static int getCounterMns(){
        return counterMns;
    }

    //getter dan setter tglMulaiKerja
    public String getTglMulaiKerja(){
        return tglMulaiKerja;
    }
    
    public void setTglMulaiKerja(String tglMulaiKerja){
        this.tglMulaiKerja = tglMulaiKerja;
    }

    //Metode Abstrak 
    public abstract double hitungMasaKerja();
    public abstract double hitungPajak();

    //Metode cetakInfo
    public void cetakInfo(){
        DecimalFormat df = new DecimalFormat("#, ###");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("Pendapatan: "+ df.format(pendapatan));
    }
}
