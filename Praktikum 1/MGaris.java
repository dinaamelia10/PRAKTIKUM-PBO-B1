/*Nama File: Garis.java 
 * Deskripsi: berisi Main program untuk menguji class Garis
 * Pembuat: Dina Amelia
 * Tanggal: 18 Februari 2025
*/

public class MGaris {
    public static void main(String[] args) {
        System.out.println("***********Membuat Objek Garis**********");
        Garis G1 = new Garis();
        G1.tampilkanGaris();
        System.out.println("Panjang garis G1: " + G1.getPanjang());
        System.out.print("\n");

        System.out.println("************Membuat Objek Garis dengan Parameter***********");
        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);
        Garis G2 = new Garis(A, B);
        G2.tampilkanGaris();
        System.out.println("Panjang garis G2: " + G2.getPanjang());

        Titik C = new Titik(1, 3);
        Titik D = new Titik(3, 7);
        Garis G3 = new Garis(C, D);
        G3.tampilkanGaris();
        System.out.print("\n");
        
        System.out.println("************Menampilkan Titik Tengah dari sebuah Garis************");
        System.out.println("Titik tengah garis: (" + G1.getTitikTengah().getAbsis() + ", " + G1.getTitikTengah().getOrdinat() + ")");

        System.out.println("************Menghitung gradien dari garis G2************");
        System.out.println("Panjang gradien G2: " + G2.getGradien());
        
        System.out.println("************Mengecek apakah G2 sejajar dengan G3************");
        System.out.println("Apakah G2 sejajar dengan G3? " + G2.isSejajar(G3));

        System.out.println("************Mengecek apakah tegak lurus************");
        System.out.println("Apakah G1 dan G2 tegak lurus? " + G2.isTegakLurus(G3));

        System.out.println("************ Menghitung persamaan Garis dalam bentuk string************");
        System.out.println("Persamaan garis G2: " + G2.getPersamaanGaris());
    }
}
