/* 
 * File   : MUniversitas.java
 * Deskripsi : program untuk mendefinikan main Universitas 
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 28 Maret 2025
 */

public class MUniversitas{
    public static void main(String[] args) {
        // fakultas\
        Fakultas ti = new Fakultas("Teknik Informatika", 5000000, 7800000);
        Fakultas feb = new Fakultas("Eknomi dan Bisnis", 4000000, 4000000);

        //Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Ayaka Kamisato", "kamisatoaya1@gmail.com", "2406060606125", feb, 2);
        Mahasiswa mhs2 = new Mahasiswa("Sung Jin Woo","jinwooOP@gmail.com" , "2406160606126", ti, 3);

        //Dosen
        Dosen dosen1 = new Dosen("Ardhianto Purnomo", "ardhiP@yahoo.co.id", "7652371478", 5, ti);
        Dosen dosen2 = new Dosen("Gibran Ahmad", "gibranWapres@gmail.com", "98625417", 4, feb);

        // Tendik
        Tendik tendik1 = new Tendik("Galing Nugra", "Galgaling@gmail.com", "7293618912", 3);
        Tendik tendik2 = new Tendik("Purwanto", "wantowant@gmail.com", "7293618912", 2);

        // Tampilkan Informasi
        mhs1.printInfo();
        mhs2.printInfo();
        dosen1.printInfo(); 
        dosen2.printInfo();
        tendik1.printInfo();
        tendik2.printInfo();

    } 
}     