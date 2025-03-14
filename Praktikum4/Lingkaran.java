/* 
 * File   : Lingkaran.java
 * Deskripsi : program untuk mendefinisikan child class BangunDatar, Lingkaran 
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 14 Maret 2025
 */


package Praktikum4;

public class Lingkaran extends BangunDatar{
    private double jari;

    public void setJari(double jari){
        this.jari = jari;
    }
    public double getJari(){
        return jari;
    }
    public Lingkaran(){
        setJmlSisi(0);
        setJari(0);
    }

    public Lingkaran(double jari, String warna, String border){
        setWarna(warna);
        setBorder(border);
        setJari(jari);
    }

    public double getLuas(){
        return Math.PI*jari*jari;
    }

    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    @Override
    public void printInfo(){
        System.out.println("****Lingkaran****");
        /*System.out.println("Jumlah Sisi : " +getJmlSisi());
        System.out.println("Warna : "+getWarna());
        System.out.println("Border : "+getBorder());*/
        super.printInfo();
        System.out.println("Jari-jari : "+getJari());
        System.out.println("Luas : "+getLuas());
        System.out.println("Keliling : "+getKeliling());
    }

}
