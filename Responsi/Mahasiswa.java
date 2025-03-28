/* 
 * File   : Mahasiswa.java
 * Deskripsi : program untuk mendefinikan class Mahasiswa 
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 28 Maret 2025
 */

public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private Fakultas fakultas;
    private int Semester;
    private static int counterMahasiswa = 0;

    public Mahasiswa (String nama, String email, String NIM, Fakultas fakultas, int Semester) {
        super(nama, email);
        this.NIM = NIM;
        this.fakultas = fakultas;
        this.Semester = Semester;
        counterMahasiswa++;
    }
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public Fakultas getFakultas() {
        return fakultas;
    }
    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }
    public int getSemester() {
        return Semester;
    }
    public void setSemester(int Semester) {
        this.Semester = Semester;
    }
    public static int getCounterMahasiswa() {
        return counterMahasiswa;
    }

    public double hitungBiayaKuliah() {
        return this.fakultas.getTarifUKT() * Math.pow(0.95, this.Semester - 1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIM: " + getNIM());
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Semester: " + getSemester());
        System.out.println("Biaya Kuliah: " + hitungBiayaKuliah());
        System.out.println("Jumlah mhs: " + getCounterMahasiswa());
    }
}