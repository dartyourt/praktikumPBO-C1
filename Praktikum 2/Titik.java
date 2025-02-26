package Praktikum1;

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    // konstruktor untuk membuat Titik dengan absis dan ordinat 0
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    // konstruktor untuk membuat Titik dengan nilai tertentu
    public Titik(double a, double o) {
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    // mengembalikan jumlah Titik yang telah dibuat
    public static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan absis
    public double getAbsis() {
        return absis;
    }

    // mengembalikan ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // mengubah nilai absis
    public void setAbsis(double a) {
        absis = a;
    }

    // mengubah nilai ordinat
    public void setOrdinat(double o) {
        ordinat = o;
    }

    // menggeser nilai absis dan ordinat sebesar dx dan dy
    public void geser(double dx, double dy) {
        absis = absis + dx;
        ordinat = ordinat + dy;
    }
    
    // mencetak koordinat Titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // mengembalikan kuadran dari titik
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // mengembalikan jarak titik dari titik pusat
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // mengembalikan jarak antara dua titik dengan input titik lain
    public double getJarak(Titik T) {
        return Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
    }

    // membuat prosedur untuk melakukan refleksi titik terhadap sumbu x
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // membuat prosedur untuk melakukan refleksi titik terhadap sumbu y
    public void refleksiY() {
        absis = -absis;
    }

    // membuat fungsi untuk melakukan refleksi titik terhadap sumbu x
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // membuat fungsi untuk melakukan refleksi titik terhadap sumbu y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}
