/* 
 * File   : Asersi1.java
 * Deskripsi : Program untuk menjalankan asersi
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 7 Maret 2025
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x>0) {
            System.out.println("x is positive");
        } else {
            assert(x<0):"ada kesalahan kode";
            System.out.println("x is not positive");
        }
    
    }
}
