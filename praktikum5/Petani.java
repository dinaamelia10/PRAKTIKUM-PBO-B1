/* 
 * Nama File : Petani.java 
 * Nama Pembuat : Dina Amelia
 * NIM : 24060123120016
 */
public class Petani extends Manusia {
    private String daerahAsal;
    private static int counterPetani = 0;

    // Constructor
    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String daerahAsal) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.daerahAsal = daerahAsal;
        counterPetani++;
    }

    // Getter dan Setter
    public String getDaerahAsal() {
        return daerahAsal;
    }

    public void setDaerahAsal(String daerahAsal) {
        this.daerahAsal = daerahAsal;
    }

    // Static getter untuk counter
    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungMasaKerja() {
        // Memecah tglMulaiKerja menjadi array [dd, MM, yyyy]
        String[] parts = tglMulaiKerja.split("-");
        int tahunMulai = Integer.parseInt(parts[2]);

        // Validasi panjang daerahAsal sebelum mengakses karakter ke-12
        int c = 0;
        if (daerahAsal.length() >= 12) {
            c = Character.getNumericValue((daerahAsal.charAt(11)));
        }

        // Asumsi format daerahAsal valid, digit ke-12 digunakan untuk C
        //int c = Character.getNumericValue(daerahAsal.charAt(11));
        return (2023 - tahunMulai) + c;
}

    @Override
    public double hitungPajak() {
        return 0; // Petani tidak membayar pajak
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Daerah Asal: " + daerahAsal);
    }
}