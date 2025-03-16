package AKADEMIK;
import java.util.ArrayList;

public class Kelas {
    private String kodeKelas;
    private MataKuliah mataKuliah;
    private Dosen dosenPengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private final int kapasitasMaksimal = 30;

    public Kelas(String kodeKelas, MataKuliah mataKuliah, Dosen dosenPengampu) {
        this.kodeKelas = kodeKelas;
        this.mataKuliah = mataKuliah;
        this.dosenPengampu = dosenPengampu;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) throws Exception {
        if (daftarMahasiswa.size() >= kapasitasMaksimal) {
            throw new Exception("Kelas " + kodeKelas + " sudah penuh!");
        }
        daftarMahasiswa.add(mahasiswa);
        mahasiswa.addMatkul(mataKuliah);
        System.out.println(mahasiswa.getNama() + " berhasil masuk kelas " + kodeKelas);
    }

    public void printInfoKelas() {
        System.out.println("Kelas: " + kodeKelas);
        System.out.println("Mata Kuliah: " + mataKuliah.getNama());
        System.out.println("Dosen Pengampu: " + dosenPengampu.getNama());
        System.out.println("Jumlah Mahasiswa: " + daftarMahasiswa.size() + "/" + kapasitasMaksimal);
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("- " + mhs.getNama() + " (" + mhs.getNim() + ")");
        }
    }
}