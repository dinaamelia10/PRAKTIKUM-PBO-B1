/* 
 * Nama File : PNS.java 
 * Nama Pembuat : Dina Amelia
 * NIM : 24060123120016
 */
public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;

    // Constructor
    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    // Static getter untuk counter
    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungMasaKerja() {
        //Memecah tglMulaiKerja menjadi array [dd, MM, yyyy]
        String[] parts = tglMulaiKerja.split("-");
        int tahunMulai = Integer.parseInt(parts[2]);
        
        // Asumsi format NIP valid, digit ke-14 digunakan untuk A
        int a = Character.getNumericValue(nip.charAt(13));
        //int tahunMulai = Integer.parseInt(tglMulaiKerja.split("-")[2]);
        return (2023 - tahunMulai) + a;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}