/* 
 * Nama File : Pegawai.java 
 * Nama Pembuat : Dina Amelia
 * NIM : 24060123120016
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    protected String NIP;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    // Constructor
    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    // Getter dan Setter
    public String getNIP() {
        return NIP; 
    }
    public void setNIP(String NIP) {
        this.NIP = NIP; 
    }
    public String getNama() {
        return nama; 
    }
    public void setNama(String nama) {
        this.nama = nama; 
    }
    public LocalDate getTanggalLahir() {
        return tanggalLahir; 
    }
    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir; 
    }
    public LocalDate getTMT() {
        return TMT; 
    }
    public void setTMT(LocalDate TMT) {
        this.TMT = TMT; 
    }
    public double getGajiPokok() {
        return gajiPokok; 
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok; 
    }

    // Method untuk menghitung masa kerja
    protected Period hitungMasaKerja(LocalDate TMT) {
        return Period.between(TMT, LocalDate.now());
    }

    // Method untuk menampilkan informasi umum pegawai
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id"));
        System.out.println("NIP           : " + NIP);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + formatter.format(tanggalLahir));
        System.out.println("TMT           : " + formatter.format(TMT));
        System.out.println("Gaji Pokok    : Rp " + formatCurrency(gajiPokok));
    }

    // Method untuk memformat mata uang
    protected String formatCurrency(double value) {
        return String.format("%,.0f", value);
    }
}