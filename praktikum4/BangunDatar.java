//package praktikum4;

public class BangunDatar {
    // Atribut
    private int jmlSisi;  // Jumlah sisi
    private String warna; // Warna bangun datar
    private String border; // Jenis border
    public static int counterBangunDatar = 0;


    // Konstruktor default
    public BangunDatar() {
        counterBangunDatar++;
        // Konstruktor kosong
    }
    

    //Konstruktor dengan parameter 
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;


    }

     // Getter dan Setter untuk jmlSisi
     public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Getter dan Setter untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan Setter untuk border
    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Method untuk menampilkan informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }
}
