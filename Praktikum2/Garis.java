package Praktikum2;
public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;
    /* METHOD */
    // konstruktor untuk membuat Garis dengan titik awal dan titik akhir (0,0) dan (1,1)
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }
    public Garis(Titik T1, Titik T2) {
        titikAwal = T1;
        titikAkhir = T2;
        counterGaris++;
    }

    // mengembalikan jumlah Garis yang telah dibuat
    public static int getCounterGaris() {
        return counterGaris;
    }
    
    // mengembalikan nilai titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // mengembalikan nilai titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // mengubah nilai titik awal
    public void setTitikAwal(Titik T) {
        titikAwal = T;
    }

    // mengubah nilai titik akhir
    public void setTitikAkhir(Titik T) {
        titikAkhir = T;
    }

    // mengembalikan nilai panjang garis
    public double panjangGaris() {
        return Math.sqrt((titikAkhir.getAbsis() - titikAwal.getAbsis())*(titikAkhir.getAbsis() - titikAwal.getAbsis()) + 
        (titikAkhir.getOrdinat() - titikAwal.getOrdinat())*(titikAkhir.getOrdinat() - titikAwal.getOrdinat()));
    }
    
    // mengembalikan nilai gradien garis
    public double gradienGaris() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }
    
    // mengembalikan nilai titik tengah garis
    public Titik titikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }
    
    // mengecek apakah garis sejajar dengan garis lain 
    public boolean isSejajar(Garis G) {
        return this.gradienGaris() == G.gradienGaris();
    }

    // mengecek apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis G) {
        return this.gradienGaris() * G.gradienGaris() == -1;
    }

    // mencetak garis
    public void printGaris() {
        System.out.println("Garis(" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + "),(" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");

    }

    // Persamaan Garis Linear
    public String persamaanGaris() {
        double m = gradienGaris();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        if (c < 0) {
            return "y = " + m + "x - " + Math.abs(c);
        } else {
            return "y = " + m + "x + " + c;
        }
    }
}