/* 
 * File   : CivitasAkademika.java
 * Deskripsi : program untuk mendefinikan parent class CivitasAkademika 
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 28 Maret 2025
 */

public abstract class CivitasAkademika {
    private String nama;
    private String email;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public void printInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }

}