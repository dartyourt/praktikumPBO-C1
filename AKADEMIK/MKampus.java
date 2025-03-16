package AKADEMIK;

public class MKampus {
    public static void main(String[] args) {
        try {
            MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
            Dosen D1 = new Dosen("Pak Budi", "Jl. Merdeka", "budi@kampus.ac.id", "123456", "Informatika");
            Kelas kelasPBO = new Kelas("IF101-PBO", PBO, D1);
            Mahasiswa M1 = new Mahasiswa("123", "Budi", "Jl. Mawar", "budi@student.ac.id", "Informatika");
            M1.setDosenWali(D1);
            kelasPBO.tambahMahasiswa(M1);
            M1.printDetailMhs();
            kelasPBO.printInfoKelas();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
