/* Nama File: ContohMetodeGenerik.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 29 April 2025
 */

/**
 * Kelas yang memiliki metode generik untuk mengendalikan kelas Datum
 */
public class ContohMetodeGenerik {
    
    /**
     * Method generik untuk mengisi Datum dengan nilai baru
     * @param <T> Tipe data yang akan disimpan
     * @param datum Objek Datum yang akan diisi
     * @param nilai Nilai baru yang akan disimpan
     */
    public <T> void isiDatum(Datum<T> datum, T nilai) {
        datum.setIsi(nilai);
        System.out.println("Berhasil mengisi Datum dengan " + nilai.getClass().getSimpleName());
    }
    
    /**
     * Method generik untuk menampilkan isi dari Datum
     * @param <T> Tipe data yang disimpan di Datum
     * @param datum Objek Datum yang akan ditampilkan isinya
     */
    public <T> void tampilkanIsi(Datum<T> datum) {
        T isi = datum.getIsi();
        
        if (isi != null) {
            System.out.println("=== Isi Datum ===");
            
            if (isi instanceof Anabul) {
                Anabul anabul = (Anabul) isi;
                anabul.printInfo();
                System.out.println();
                anabul.bersuara();
                anabul.bergerak();
            } else {
                System.out.println(isi);
            }
            
            System.out.println("=================");
            System.out.println();
        } else {
            System.out.println("Datum kosong");
        }
    }
    
    /**
     * Method untuk membandingkan dua Datum apakah memiliki tipe objek yang sama
     * @param <T> Tipe data Datum pertama
     * @param <U> Tipe data Datum kedua
     * @param datum1 Objek Datum pertama
     * @param datum2 Objek Datum kedua
     * @return true jika kedua objek memiliki kelas yang sama, false jika berbeda
     */
    public <T, U> boolean isSameClass(Datum<T> datum1, Datum<U> datum2) {
        if (datum1.getIsi() == null || datum2.getIsi() == null) {
            return false;
        }
        
        return datum1.getIsi().getClass() == datum2.getIsi().getClass();
    }
    
    /**
     * Method untuk mengganti nama Anabul dalam Datum
     * @param <T> Tipe objek dalam Datum
     * @param datum Objek Datum yang berisi Anabul
     * @param namaBaru Nama baru untuk Anabul
     * @return true jika berhasil mengganti nama, false jika gagal
     */
    public <T> boolean gantiNamaAnabul(Datum<T> datum, String namaBaru) {
        T isi = datum.getIsi();
        
        if (isi instanceof Anabul) {
            Anabul anabul = (Anabul) isi;
            anabul.setNama(namaBaru);
            System.out.println("Berhasil mengganti nama menjadi: " + namaBaru);
            return true;
        } else {
            System.out.println("Gagal mengganti nama: Objek bukan Anabul");
            return false;
        }
    }
}