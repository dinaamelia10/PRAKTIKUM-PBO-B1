//package praktikum4;

public class Persegi extends BangunDatar{
    // Atribut tambahan untuk Persegi
    private double sisi;

    // Konstruktor default
    public Persegi() {
        setJmlSisi(4); // Persegi selalu memiliki 4 sisi
    }

    // Konstruktor berparameter  
    //konstruktor dengan keyword super 
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    // public Persegi(double sisi, String warna, String border){
    //     this.jmlSisi = 4;
    //     this.warna = warna;
    //     this.border = border;
    //     this.sisi = sisi;
    // }

    // public Persegi(double sisi, String warna, String border) {
    //     this.sisi = sisi;
    //     setWarna(warna);
    //     setBorder(border);
    //     setJmlSisi(4);
    // }

    // Getter dan Setter untuk sisi
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    // Method untuk menghitung diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    //Override
    @Override 
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());

    }
    public static void printCounterBangunDatar(){
        System.out.println("Ini dari persegi");
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }

}
