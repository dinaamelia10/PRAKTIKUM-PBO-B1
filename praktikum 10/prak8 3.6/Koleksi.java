/* Nama File: Koleksi.java
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 * Tanggal : 10 Mei 2025
 */

/**
 * Kelas generik Koleksi untuk menyimpan berbagai objek dengan tipe yang sama
 * @param <T> Tipe data yang akan disimpan dalam koleksi
 */
public class Koleksi<T> {
    /* ATRIBUT */
    private int nbelm;       // banyaknya elemen efektif koleksi
    private Object[] wadah;  // array untuk menyimpan nilai-nilai elemen dalam koleksi
    private int kapasitas;   // kapasitas maksimum koleksi
    
    /* METHOD */
    // Konstruktor
    public Koleksi(int kapasitas) {
        this.kapasitas = kapasitas;
        this.wadah = new Object[kapasitas];
        this.nbelm = 0;
    }
    
    // Getter untuk mendapatkan isi pada indeks tertentu
    @SuppressWarnings("unchecked")
    public T getIsi(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return (T) wadah[indeks];
        } else {
            throw new IndexOutOfBoundsException("Indeks berada di luar rentang koleksi");
        }
    }
    
    // Setter untuk mengupdate isi pada indeks tertentu
    public void setIsi(int indeks, T nilai) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah[indeks] = nilai;
        } else {
            throw new IndexOutOfBoundsException("Indeks berada di luar rentang koleksi");
        }
    }
    
    // Getter untuk mendapatkan ukuran koleksi (jumlah elemen efektif)
    public int getSize() {
        return nbelm;
    }
    
    // Setter untuk mengubah ukuran koleksi
    public void setSize(int newSize) {
        if (newSize >= 0 && newSize <= kapasitas) {
            this.nbelm = newSize;
        } else {
            throw new IllegalArgumentException("Ukuran baru tidak valid");
        }
    }
    
    // Metode untuk menambahkan elemen baru ke koleksi
    public boolean add(T elemen) {
        if (nbelm < kapasitas) {
            wadah[nbelm] = elemen;
            nbelm++;
            return true;
        } else {
            return false; // Koleksi sudah penuh
        }
    }
    
    // Metode untuk menghapus elemen pada indeks tertentu
    public boolean delete(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            // Geser semua elemen setelah indeks
            for (int i = indeks; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[nbelm - 1] = null; // Hapus referensi terakhir
            nbelm--;
            return true;
        } else {
            return false; // Indeks tidak valid
        }
    }
    
    // Metode untuk menampilkan semua elemen koleksi
    public void showAll() {
        if (nbelm == 0) {
            System.out.println("Koleksi kosong");
            return;
        }
        
        System.out.println("=== ISI KOLEKSI ===");
        System.out.println("Jumlah elemen: " + nbelm);
        
        for (int i = 0; i < nbelm; i++) {
            System.out.println("[" + i + "] " + wadah[i]);
        }
        
        System.out.println("==================");
    }
}