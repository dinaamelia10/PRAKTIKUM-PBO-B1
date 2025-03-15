/* 
 * Nama File : Dosen.java 
 * Nama Pembuat : Dina Amelia
 * NIM : 24060123120016
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Dosen extends Pegawai {
    protected String fakultas;

    // Constructor
    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    // Getter dan Setter
    public String getFakultas() { return fakultas; }
    public void setFakultas(String fakultas) { this.fakultas = fakultas; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas      : " + fakultas);
    }
}