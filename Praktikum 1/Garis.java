/*Nama File: Garis.java 
 * Deskripsi: berisi atribut dan method dalam class Garis
 * Pembuat: Dina Amelia
 * Tanggal: 18 Februari 2025
*/
public class Garis {
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0; // Static counter untuk jumlah garis yang dibuat

    // Konstruktor tanpa parameter
    Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Getter dan Setter
    Titik getTitikAwal() {
        return titikAwal;
    }

    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    /*Method */
    // Mendapatkan panjang garis
    double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    //Mendapatkan Gradien 
    double getGradien(){
        //return ((titikAkhir.getOrdinat() - titikAwal.getOrdinat())/(titikAkhir.getAbsis() - titikAwal.getAbsis()));
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return deltaY/deltaX;
    }

    // Mendapatkan titik tengah garis
    Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    // Mengecek apakah dua garis sejajar
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }
    
    //Mengecek Apakah Garis tersebut Tegak Lurus
    boolean isTegakLurus(Garis G) {
        // Ambil koordinat titik awal dan akhir dari kedua garis
        double x1 = this.titikAwal.getAbsis(), y1 = this.titikAwal.getOrdinat();
        double x2 = this.titikAkhir.getAbsis(), y2 = this.titikAkhir.getOrdinat();
        double x3 = G.titikAwal.getAbsis(), y3 = G.titikAwal.getOrdinat();
        double x4 = G.titikAkhir.getAbsis(), y4 = G.titikAkhir.getOrdinat();
    
        // Hitung delta X dan delta Y
        double dx1 = x2 - x1, dy1 = y2 - y1;
        double dx2 = x4 - x3, dy2 = y4 - y3;
    
        // Cek apakah (dx1 * dx2) + (dy1 * dy2) == 0 (dot product = 0)
        return (dx1 * dx2 + dy1 * dy2) == 0;
    }

    // Menampilkan titik awal dan titik akhir
    void tampilkanGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    //Mendapatkan persamaan garis dalam bentuk y = mx + c
    String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
    
        // Format agar angka desimal yang .0 diubah jadi integer
        String gradienStr = (m % 1 == 0) ? String.format("%.0f", m) : String.valueOf(m);
        String konstantaStr = (c % 1 == 0) ? String.format("%.0f", c) : String.valueOf(c);
    
        // Format string agar tanda "+" otomatis disesuaikan
        return "y = " + gradienStr + "x " + (c >= 0 ? "+ " + konstantaStr : "- " + konstantaStr.substring(1));
    }
    
    
}
