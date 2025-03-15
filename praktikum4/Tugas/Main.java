/* 
 * Nama File : Main.java 
 * Nama Pembuat : Dina Amelia
 * NIM : 24060123120016
 */
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {        
        // Contoh data Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap(
                "9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1),
                5000000, "Fakultas Sains dan Matematika", "78647324"
        );
        dosenTetap.printInfo();

        System.out.println("\n---\n");

        // Contoh data Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu(
                "1234567890", "Budi", LocalDate.of(1985, 10, 10), LocalDate.of(2020, 1, 1),
                6000000, "Fakultas Teknik", "987654321", LocalDate.of(2026, 1, 1)
        );
        dosenTamu.printInfo();

        System.out.println("\n---\n");

        // Contoh data Tendik
        Tendik tendik = new Tendik(
                "0987654321", "Cici", LocalDate.of(1995, 8, 15), LocalDate.of(2021, 1, 1),
                4000000, "Akademik"
        );
        tendik.printInfo();
    }
}

