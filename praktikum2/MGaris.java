//Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;

public class MGaris {
   public MGaris() {
   }

   public static void main(String[] var0) {
      System.out.println("***********Membuat Objek Garis**********");
      Garis var1 = new Garis();
      var1.tampilkanGaris();
      System.out.println("Panjang garis G1: " + var1.getPanjang());
      System.out.print("\n");
      System.out.println("************Membuat Objek Garis dengan Parameter***********");
      Titik var2 = new Titik(-2.0, 0.0);
      Titik var3 = new Titik(0.0, 4.0);
      Garis var4 = new Garis(var2, var3);
      var4.tampilkanGaris();
      System.out.println("Panjang garis G2: " + var4.getPanjang());
      Titik var5 = new Titik(1.0, 3.0);
      Titik var6 = new Titik(3.0, 7.0);
      Garis var7 = new Garis(var5, var6);
      var7.tampilkanGaris();
      System.out.print("\n");
      System.out.println("************Menampilkan Titik Tengah dari sebuah Garis************");
      PrintStream var10000 = System.out;
      double var10001 = var1.getTitikTengah().getAbsis();
      var10000.println("Titik tengah garis: (" + var10001 + ", " + var1.getTitikTengah().getOrdinat() + ")");
      System.out.print("\n");
      System.out.println("************Menghitung gradien dari garis G2************");
      System.out.println("Panjang gradien G2: " + var4.getGradien());
      System.out.print("\n");
      System.out.println("************Mengecek apakah G2 sejajar dengan G3************");
      var10000 = System.out;
      boolean var8 = var4.isSejajar(var7);
      var10000.println("Apakah G2 sejajar dengan G3? " + var8);
      System.out.print("\n");
      System.out.println("************Mengecek apakah tegak lurus************");
      var10000 = System.out;
      var8 = var4.isTegakLurus(var7);
      var10000.println("Apakah G1 dan G2 tegak lurus? " + var8);
      System.out.print("\n");
      System.out.println("************ Menghitung persamaan Garis dalam bentuk string************");
      System.out.println("Persamaan garis G2: " + var4.getPersamaanGaris());
   }
}
