/* 
 * File   : MBangunDatar.java
 * Deskripsi : program main untuk menjalankan class BangunDatar
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 14 Maret 2025
 */

package Praktikum5;

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5, "Merah", "Hitam");
        persegi.printInfo();
        //Lingkaran ling = new Lingkaran (14, "Biru", "Putih");
        //ling.printInfo();
        //Persegi perper = new Persegi(5, "Hijay", "Putih");
        //System.out.println("Apakah sama luasnya? "+persegi.isEqualLuas(perper));
        //System.out.println("Apakah sama luasnya? "+persegi.isEqualLuas(ling));
        System.err.println("**************************************************");
        ((Persegi)persegi).zoomIn();
        System.out.println("Luas Persegi setelah zoom in : "+persegi.getLuas());
        ((Persegi)persegi).zoomOut();
        System.out.println("Luas Persegi setelah zoom out : "+persegi.getLuas());
        ((Persegi)persegi).zoom(10);
        System.out.println("Luas Persegi setelah zoom 10% : "+persegi.getLuas());
    }
    
}

/*
 * BangunDatar B2 = new BangunDatar(4, "Merah", "Hitam");
 * kode ini akan mengalami error karena class BangunDatar merupakan abstract class
 * dan tidak bisa diinstansiasi
 */
