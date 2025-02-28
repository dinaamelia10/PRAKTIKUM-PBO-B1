/*Nama File: Mmain.java 
 * Deskripsi: berisi Main program untuk menguji class Dosen, Kendaraan, Mata Kuliah, Mahasiswa
 * Pembuat: Dina Amelia
 * Tanggal: 26 Februari 2025
*/
public class Mmain {
    public static void main(String[] args) {
        // Membuat objek mata kuliah
        MataKuliah ALPRO = new MataKuliah("ALP", "Algoritma Pemrograman", 4);
        MataKuliah KALKULUS = new MataKuliah("KAL", "Kalkulus Dasar", 3);
        MataKuliah FISIKA = new MataKuliah("FIS", "Fisika Dasar", 3);

        // Membuat objek dosen wali
        Dosen D1 = new Dosen("D001", "Dr. Arya Wijaya", "Informatika");
        Dosen D2 = new Dosen("D002", "Prof. Lina Hartati", "Teknik Elektro");

        // Mahasiswa 1: Memiliki kendaraan, mengambil banyak mata kuliah
        Mahasiswa M1 = new Mahasiswa("M001", "Aditya Pratama", "Informatika", D1);
        Kendaraan K1 = new Kendaraan("B1234XYZ", "motor");
        M1.setKendaraan(K1);
        M1.addMatKul(ALPRO);
        M1.addMatKul(KALKULUS);
        M1.addMatKul(FISIKA);
        System.out.println("======= Mahasiswa 1 =======");
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

        // Mahasiswa 2: Tidak memiliki kendaraan, mengambil sedikit mata kuliah
        Mahasiswa M2 = new Mahasiswa("M002", "Budi Santoso", "Teknik Elektro", D2);
        M2.addMatKul(ALPRO);
        System.out.println("\n======= Mahasiswa 2 =======");
        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());

        // Mahasiswa 3: Tidak memiliki kendaraan dan belum mengambil mata kuliah
        Mahasiswa M3 = new Mahasiswa("M003", "Citra Dewi", "Informatika", D1);
        System.out.println("\n======= Mahasiswa 3 =======");
        M3.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M3.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M3.getJumlahSKS());

        // Mahasiswa 4: Memiliki kendaraan, mengambil mata kuliah maksimal (50)
        Mahasiswa M4 = new Mahasiswa("M004", "Dewi Anggraeni", "Teknik Elektro", D2);
        Kendaraan K4 = new Kendaraan("B9876ABC", "mobil");
        M4.setKendaraan(K4);
        for (int i = 1; i <= 50; i++) {
            M4.addMatKul(new MataKuliah("MK" + i, "Mata Kuliah " + i, 3));
        }
        System.out.println("\n======= Mahasiswa 4 =======");
        M4.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M4.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M4.getJumlahSKS());

        //Mahasiswa 5: Mahasiswa tidak mengambil mata kuliah karena baru masuk semester pertama 
        Mahasiswa M5 = new Mahasiswa("019", "Jesper Fahey", "Teknik Elektro", D2);
        System.out.println("\n======= Mahasiswa 5 =======");
        M3.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M5.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M5.getJumlahSKS());
        }
}