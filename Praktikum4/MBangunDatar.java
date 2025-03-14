/* 
 * File   : MBangunDatar.java
 * Deskripsi : program main untuk menjalankan class BangunDatar
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 14 Maret 2025
 */

package Praktikum4;

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5, "Merah", "Hitam");
        persegi.printInfo();
        Lingkaran ling = new Lingkaran (14, "Biru", "Putih");
        ling.printInfo();
    }
    
}
