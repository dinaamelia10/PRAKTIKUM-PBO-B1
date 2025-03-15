/* 
 * Nama File : DosenTamu.java 
 * Nama Pembuat : Dina Amelia
 * NIM : 24060123120016
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate kontrakAkhir;
    private double tunjangan;

    // Constructor
    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate kontrakAkhir) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrakAkhir = kontrakAkhir;
        this.tunjangan = hitungTunjangan();
    }

    // Method untuk menghitung sisa kontrak
    private long hitungSisaKontrak() {
        return Period.between(LocalDate.now(), kontrakAkhir).toTotalMonths();
    }
    // Method untuk menghitung tunjangan
    private double hitungTunjangan() {
        return 0.025 * getGajiPokok(); // 2,5% dari gaji pokok
    }
    

    // Getter dan Setter
    public String getNIDK() { return NIDK; }
    public void setNIDK(String NIDK) { this.NIDK = NIDK; }
    public LocalDate getKontrakAkhir() { return kontrakAkhir; }
    public void setKontrakAkhir(LocalDate kontrakAkhir) { this.kontrakAkhir = kontrakAkhir; }
    public double getTunjangan() { return tunjangan; }
    public void setTunjangan(double tunjangan) { this.tunjangan = tunjangan; }

    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id"));
        System.out.println("=== Informasi Dosen Tamu ===");
        System.out.println("NIP           : " + NIP);
        System.out.println("NIDK          : " + NIDK);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + formatter.format(tanggalLahir));
        System.out.println("TMT           : " + formatter.format(TMT));
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Fakultas      : " + fakultas);

        // Sisa Kontrak
        long sisaKontrak = hitungSisaKontrak();
        System.out.println("Sisa Kontrak  : " + sisaKontrak + " bulan");

        // Gaji Pokok
        System.out.println("Gaji Pokok    : Rp " + formatCurrency(gajiPokok));

        // Tunjangan
        System.out.println("Tunjangan     : 2,5% x Rp " + formatCurrency(gajiPokok) + " = Rp " + formatCurrency(tunjangan));
    }
}