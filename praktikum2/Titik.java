/*Nama File: Titik.java 
 * Deskripsi: berisi atribut dan method dalam class Titik
 * Pembuat: Dina Amelia
 * Tanggal: 18 Februari 2025
*/

public class Titik {
    /* States/Atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* Behavior/Method */

    // Konstruktor
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Titik(double x, double y){
    //     absis = x;
    //     ordinat = y;
    // }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // //konstruktor untuk membuat titik (0,0)
    // Titik(){
    //     this(0,0);
    // }


    //mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }
    
    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    public void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    //Mendapatkan kuadran 
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; // Titik berada di sumbu
        }
    }

    // Method refleksi terhadap sumbu X
    public void refleksiX() {
        this.ordinat = this.ordinat * (-1);
    }

    // Merefleksikan titik terhadap sumbu Y
    public void refleksiY() {
        this.absis = this.absis * (-1);
    }

    // Menghitung jarak antara dua titik
    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(T.getAbsis() - this.absis, 2) + Math.pow(T.getOrdinat() - this.ordinat, 2));
    }

    // Menghitung jarak dari titik ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }
    
    // Mengembalikan titik hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, ordinat * (-1));
    }

    // Mengembalikan titik hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(absis * (-1), ordinat);
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}