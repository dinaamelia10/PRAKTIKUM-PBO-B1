public class Lingkaran extends BangunDatar {
    private double jari; 

    public Lingkaran() {
        setJmlSisi(0); 
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border); 
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJariJari(double jariJari) {
        this.jari = jariJari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}