package Praktikum2.Akademik;

public class Dosen {
    private String nama;
    private String nip;
    private String prodi;
    
    // konstruktor tanpa parameter
    public Dosen() {
        nama = "";
        nip = "";
        prodi = "";
    }

    // konstruktor dengan parameter
    public Dosen(String nama, String nip, String prodi) {
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
