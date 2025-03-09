/* 
 * File   : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak
 *              input jari-jari lingkaran bernilai 0
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 7 Maret 2025
 */

class Lingkaran {
    private double jari2;
    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }
    public double hitungKeliling() {
        return 2*Math.PI*jari2;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jari2 = -1;
        assert(jari2>0):"Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jari2);
        double keliling = l.hitungKeliling();
        System.out.println("Keliling lingkaran: " + keliling);
        /*  harusnya gunakan if else assert(jari2<=0):"Jari-jari tidak boleh nol!!!"
            karena tetap saja tidak ada penanganan jika jari-jarinya 0
        */
    }

}
