package AKADEMIK;

public class Dosen extends Orang {
    private String nip;
    private String prodi;

    public Dosen(String nama, String alamat, String email, String nip, String prodi) {
        super(nama, alamat, email);
        this.nip = nip;
        this.prodi = prodi;
    }

    public String getNip() {
        return nip;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void mengajar(MataKuliah mk) {
        System.out.println(nama + " mengajar mata kuliah " + mk.getNama());
    }
}
