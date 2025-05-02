package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public void isiPeluru(int jumlah) {
        int peluruSekarang = senjata.getPeluru();
        senjata.setPeluru(peluruSekarang + jumlah);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public boolean isPeluruHabis() {
        return senjata.getPeluru() <= 0;
    }

public void menembak(int jumlah) {
    System.out.println(">> Siap menembak " + jumlah + " kali");

    if (isPeluruHabis()) {
        System.out.println("Peluru Habis");
    } else {
        for (int i = 0; i < jumlah; i++) {
            if (isPeluruHabis()) {
                System.out.println("Gagal tembak, Peluru Habis");
            } else {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
}


    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang!");
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("Menusuk musuh!");
        } else {
            System.out.println("Gagal menusuk, bayonet belum terpasang!");
        }
    }
}