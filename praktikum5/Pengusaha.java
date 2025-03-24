/* 
 * Nama File : Pengusaha.java 
 * Nama Pembuat : Dina Amelia
 * NIM : 24060123120016
 */
public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha = 0;

    // Constructor
    public Pengusaha(String nama, String tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama,tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter dan Setter
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Static getter untuk counter
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungMasaKerja() {
        // Asumsi format NPWP valid, digit ke-13 digunakan untuk B
        int b = Character.getNumericValue(npwp.charAt(12));
        int tahunMulai = Integer.parseInt(tglMulaiKerja.split("-")[2]);
        return (2023 - tahunMulai) + b;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}