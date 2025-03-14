/* 
 * File   : Persegi.java
 * Deskripsi : program untuk mendefinisikan child class BangunDatar, Persegi 
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 14 Maret 2025
 */
package Praktikum4;
public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }
    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }
    public double getDiagonal(){
        return Math.sqrt(2)*sisi;
    }


    @Override
    public void printInfo(){
        System.out.println("****Persegi****");
        /*System.out.println("Jumlah Sisi : " +getJmlSisi());
        System.out.println("Warna : "+getWarna());
        System.out.println("Border : "+getBorder());*/
        super.printInfo();
        System.out.println("Sisi : "+getSisi());
        System.out.println("Luas : "+getLuas());
        System.out.println("Keliling : "+getKeliling());
        System.out.println("Diagonal : "+getDiagonal());
    }

    /* @Override
     * public void printCBD(){
     *      System.out.println("Jml Bangun Datar : "+counterBDatar);
     * }
     * karena method printCBD() bersifat statis dimana static method terikat langsung
     * oleh class bukan instance class, sehingga tidak ada alasan untuk
     * melakukan override pada method tersebut.
     * 
     * 
     */


    /*
     * public Persegi(double sisi, String warna, String border){
     *     this.sisi = sisi;
     *     this.warna = warna;
     *     this.border = border;
     *  }
     * Kode ini tidak akan dapat dijalankan karena mencoba untuk mengakses atribut
     * di dalam class BangunDatar yang bersifat private. Solusinya adalah dengan
     * menggunakan setter dan getter yang telah disediakan oleh class BangunDatar
     * 
     */
}