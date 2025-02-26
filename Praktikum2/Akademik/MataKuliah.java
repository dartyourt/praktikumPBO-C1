package Praktikum2.Akademik;

public class MataKuliah {
    private String idMatkul;
    private String namaMatkul;
    private int sks;

    public MataKuliah() {
        idMatkul = "";
        namaMatkul = "";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String namaMatkul, int sks) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }
}
