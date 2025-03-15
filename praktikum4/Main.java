//package praktikum4;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi2 = new Persegi();
        System.out.println("Informasi Persegi:");
        persegi2.printInfo();
        System.out.println();

        Persegi persegi = new Persegi(5.0, "Merah", "Solid");
        System.out.println("Informasi Persegi:");
        persegi.printInfo(); 
        System.out.println();

        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterBangunDatar();
        System.out.println();

        // Membuat objek Lingkaran dengan konstruktor tanpa parameter
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.setJariJari(7); // Mengatur jari-jari lingkaran
        lingkaran1.setWarna("Merah"); // Mengatur warna
        lingkaran1.setBorder("Hitam"); // Mengatur border
        System.out.println();

        // Mencetak informasi lingkaran pertama
        System.out.println("Informasi Lingkaran 1:");
        lingkaran1.printInfo();
        System.out.println();

        // Membuat objek Lingkaran dengan konstruktor berparameter
        Lingkaran lingkaran2 = new Lingkaran(10, "Biru", "Putih");

        // Mencetak informasi lingkaran kedua
        System.out.println("Informasi Lingkaran 2:");
        lingkaran2.printInfo();

    }
}