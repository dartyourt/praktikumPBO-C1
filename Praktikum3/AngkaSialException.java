/* 
 * File   : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 7 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan masukkan angka 13 soale sial!");
    }
    
}
