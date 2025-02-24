public class MTitik {
    public static void main(String[] args) {
        // Membuat objek Titik
        Titik T1 = new Titik(3, 4);
        Titik T2 = new Titik(-2, 5);

        // Menampilkan koordinat awal
        System.out.println("Titik T1: (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");
        System.out.println("Titik T2: (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");

        // Mengubah koordinat T1
        T1.setAbsis(5);
        T1.setOrdinat(7);
        System.out.println("Setelah diubah, Titik T1: (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");

        // Menggeser titik
        T1.geser(2, -3);
        System.out.println("Setelah digeser, Titik T1: (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");

        // Menampilkan kuadran masing-masing titik
        System.out.println("T1 berada di kuadran: " + T1.getKuadran());
        System.out.println("T2 berada di kuadran: " + T2.getKuadran());

        // Menampilkan jarak titik ke pusat (0,0)
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T2 ke pusat: " + T2.getJarakPusat());

        // Menampilkan jarak antara dua titik
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));

        // Refleksi terhadap sumbu X dan Y
        T1.refleksiX();
        System.out.println("Setelah refleksi terhadap sumbu X, T1: (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");

        T1.refleksiY();
        System.out.println("Setelah refleksi terhadap sumbu Y, T1: (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");

        // Mendapatkan titik hasil refleksi tanpa mengubah objek asli
        Titik refleksiT1X = T1.getRefleksiX();
        System.out.println("Refleksi T1 terhadap sumbu X menghasilkan titik: (" + refleksiT1X.getAbsis() + ", " + refleksiT1X.getOrdinat() + ")");

        Titik refleksiT1Y = T1.getRefleksiY();
        System.out.println("Refleksi T1 terhadap sumbu Y menghasilkan titik: (" + refleksiT1Y.getAbsis() + ", " + refleksiT1Y.getOrdinat() + ")");
    }
}
