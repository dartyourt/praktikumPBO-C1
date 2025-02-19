package Praktikum1;

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // konstruktor untuk membuat Titik dengan absis dan ordinat 0
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    // konstruktor untuk membuat Titik dengan nilai tertentu
    Titik(double a, double o) {
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    // mengembalikan jumlah Titik yang telah dibuat
    static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengubah nilai absis
    void setAbsis(double a) {
        absis = a;
    }

    // mengubah nilai ordinat
    void setOrdinat(double o) {
        ordinat = o;
    }

    // menggeser nilai absis dan ordinat sebesar dx dan dy
    void geser(double dx, double dy) {
        absis = absis + dx;
        ordinat = ordinat + dy;
    }
    
    // mencetak koordinat Titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // mengembalikan kuadran dari titik
    int getKuadran() {
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
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // mengembalikan jarak antara dua titik dengan input titik lain
    double getJarak(Titik T) {
        return Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
    }

    // membuat prosedur untuk melakukan refleksi titik terhadap sumbu x
    void refleksiX() {
        ordinat = -ordinat;
    }

    // membuat prosedur untuk melakukan refleksi titik terhadap sumbu y
    void refleksiY() {
        absis = -absis;
    }

    // membuat fungsi untuk melakukan refleksi titik terhadap sumbu x
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // membuat fungsi untuk melakukan refleksi titik terhadap sumbu y
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}
