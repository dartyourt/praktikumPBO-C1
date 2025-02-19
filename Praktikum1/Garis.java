package Praktikum1;

public class Garis {
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;
    /* METHOD */
    // konstruktor untuk membuat Garis dengan titik awal dan titik akhir (0,0) dan (1,1)
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }
    Garis(Titik T1, Titik T2) {
        titikAwal = T1;
        titikAkhir = T2;
        counterGaris++;
    }

    // mengembalikan jumlah Garis yang telah dibuat
    static int getCounterGaris() {
        return counterGaris;
    }
    
    // mengembalikan nilai titik awal
    Titik getTitikAwal() {
        return titikAwal;
    }

    // mengembalikan nilai titik akhir
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    // mengubah nilai titik awal
    void setTitikAwal(Titik T) {
        titikAwal = T;
    }

    // mengubah nilai titik akhir
    void setTitikAkhir(Titik T) {
        titikAkhir = T;
    }

    // mengembalikan nilai panjang garis
    double panjangGaris() {
        return Math.sqrt((titikAkhir.getAbsis() - titikAwal.getAbsis())*(titikAkhir.getAbsis() - titikAwal.getAbsis()) + 
        (titikAkhir.getOrdinat() - titikAwal.getOrdinat())*(titikAkhir.getOrdinat() - titikAwal.getOrdinat()));
    }
    
    // mengembalikan nilai gradien garis
    double gradienGaris() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }
    
    // mengembalikan nilai titik tengah garis
    Titik titikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }
    
    // mengecek apakah garis sejajar dengan garis lain 
    boolean isSejajar(Garis G) {
        return this.gradienGaris() == G.gradienGaris();
    }

    // mengecek apakah garis tegak lurus dengan garis lain
    boolean isTegakLurus(Garis G) {
        return this.gradienGaris() * G.gradienGaris() == -1;
    }

    // mencetak garis
    void printGaris() {
        System.out.println("Garis(" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + "),(" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");

    }
}