package AKADEMIK;

import java.util.ArrayList;

public class Fakultas {
    private String nama;
    private ArrayList<ProgramStudi> daftarProdi;

    public Fakultas(String nama) {
        this.nama = nama;
        this.daftarProdi = new ArrayList<>();
    }

    public void tambahProdi(ProgramStudi prodi) {
        daftarProdi.add(prodi);
    }

    public String infoFakultas() {
        return "Fakultas: " + nama;
    }
}