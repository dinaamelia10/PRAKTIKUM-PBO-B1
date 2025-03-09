/*
 * File : AngkaSialException.java
 * Deksripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama Pembuat: Dina Amelia
 * NIM : 24060123120016
 */
public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!!!");   
    }
}