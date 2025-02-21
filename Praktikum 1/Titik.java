/*Nama File: Titik.java 
 * Deskripsi: berisi atribut dan method dalam class Titik
 * Pembuat: Dina Amelia
 * Tanggal: 18 Februari 2025
*/

public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* Behavior/Method */

    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Titik(double x, double y){
    //     absis = x;
    //     ordinat = y;
    // }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // //konstruktor untuk membuat titik (0,0)
    // Titik(){
    //     this(0,0);
    // }


    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }
    
    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    //Mendapatkan kuadran 
    int getKuadran() {
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
    void refleksiX() {
        this.ordinat = this.ordinat * (-1);
    }

    // Merefleksikan titik terhadap sumbu Y
    void refleksiY() {
        this.absis = this.absis * (-1);
    }

    // Menghitung jarak antara dua titik
    double getJarak(Titik T) {
        return Math.sqrt(Math.pow(T.getAbsis() - this.absis, 2) + Math.pow(T.getOrdinat() - this.ordinat, 2));
    }

    // Menghitung jarak dari titik ke pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }
    
    // Mengembalikan titik hasil refleksi terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(absis, ordinat * (-1));
    }

    // Mengembalikan titik hasil refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(absis * (-1), ordinat);
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}