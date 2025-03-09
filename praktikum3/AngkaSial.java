/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi,yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 */
public class AngkaSial {
    
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");

        }
    }
}

/*PERTANYAAN: 
 * 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java diatas dieksekusi?
 * 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * 
 * JAWAB : 
 * 1. Baris 12 tidak dieksekusi. Jika eksepsi terjadi di baris sebelumnya(misalnya, baris 11), 
 *    baris 12 akan dilewati karena kontrol langsung pindah ke blok catch
 * 2. Baris 21 pasti dieksekusi. Baris 21 berada dalam blok finally, 
 *    yang selalu dijalankan terlepas dari apakah eksepsi terjadi atau tidak . 
 *    Blok finally digunakan untuk membersihkan resource atau mengeksekusi kode yang harus berjalan meskipun terjadi error.
 */ 

 /*CONTOH ALUR EKSEKUSI*/ 
// try {
//     // Baris 10: Kode yang mungkin melempar eksepsi
//     if (angka == 13) {
//         throw new AngkaSialException(); // Eksepsi terjadi di sini
//     }
//     // Baris 12: Tidak dieksekusi karena eksepsi sudah terjadi
// } catch (AngkaSialException e) {
//     // Menangani eksepsi
// } finally {
//     // Baris 21: Dieksekusi setelah try/catch selesai
// }
