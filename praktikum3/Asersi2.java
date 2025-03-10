/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi,yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 */
//class Lingkaran
class Lingkaran{
    private double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

/*PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 diatas. Jelaskan!!
 * JAWAB : 
 * 1. Asersi bukan untuk validasi input pengguna  : Asersi dirancang untuk mendeteksi bug atau kesalahan logika internal dalam kode, 
 *    bukan untuk menangani input eksternal yang tidak valid. Input pengguna(seperti jari - jari) adalah faktor eksternal yang berkemungkinan salah.
 *    Sehingga lebih sesuai ditangani dengan eksepsi(misalnya, IllegalArgumentException).
 * 2. Jika program dijalankan tanpa flag -enableassertions, asersi tidak dieksekusi. Akibatnya:
 *    Input jari-jari negatif tidak terdeteksi , dan program tetap menghitung keliling dengan nilai salah.
 *    Hal ini berisiko menghasilkan output yang tidak valid tanpa peringatan.
 * SOLUSI : 
 * Ganti asersi dengan eksepsi untuk validasi input: 
 * if (jariJari < 0) {
 *    throw new IllegalArgumentException("Jari-jari tidak boleh negatif!");
 * }
 */