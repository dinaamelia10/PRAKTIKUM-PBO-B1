/* 
 * Nama File : DosenTetap.java 
 * Nama Pembuat : Dina Amelia
 * NIM : 24060123120016
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen {
    private String NIDN;
    private int BUP;
    private double tunjangan;

    // Constructor
    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
        this.BUP = 65; // Usia pensiun tetap 65 tahun
        this.tunjangan = hitungTunjangan();
    }

    // Method untuk menghitung tunjangan
    private double hitungTunjangan() {
        long masaKerja = hitungMasaKerja(TMT).getYears(); // Dalam tahun
        return 0.02 * masaKerja * gajiPokok;
    }
    // Method untuk menghitung BUP (Batas Usia Pensiun)
    protected LocalDate hitungBUP(int usiaPensiun) {
        return tanggalLahir.plusYears(usiaPensiun).withDayOfMonth(1).plusMonths(1);
    }
    
    // Getter dan Setter
    public String getNIDN() { 
        return NIDN; 
    }
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN; 
    }
    public int getBUP() {
        return BUP; 
    }
    public void setBUP(int BUP) {
        this.BUP = BUP; 
    }
    public double getTunjangan() {
        return tunjangan; 
    }
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan; 
    }

    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id"));
        System.out.println("=== Informasi Dosen Tetap ===");
        System.out.println("NIP           : " + NIP);
        System.out.println("NIDN          : " + NIDN);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + formatter.format(tanggalLahir));
        System.out.println("TMT           : " + formatter.format(TMT));
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + fakultas);

        // Masa Kerja
        Period masaKerja = hitungMasaKerja(TMT);
        System.out.println("Masa Kerja    : " + masaKerja.getYears() + " tahun, " +
                           masaKerja.getMonths() + " bulan");

        // BUP
        LocalDate bup = hitungBUP(BUP);
        System.out.println("BUP           : " + formatter.format(bup));

        // Gaji Pokok
        System.out.println("Gaji Pokok    : Rp " + formatCurrency(gajiPokok));

        // Tunjangan
        System.out.println("Tunjangan     : 2% x " + masaKerja.getYears() + " x Rp " +
                           formatCurrency(gajiPokok) + " = Rp " + formatCurrency(tunjangan));
    }
}