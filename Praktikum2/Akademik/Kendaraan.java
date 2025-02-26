package Praktikum2.Akademik;

public class Kendaraan {
    private String jenis; // jenis kendaraan mobil atau motor

    private String noPlat;

    public Kendaraan() {
        jenis = "";
        noPlat = "";
    }

    public Kendaraan(String jenis, String noPlat) {
        this.jenis = jenis;
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
}
