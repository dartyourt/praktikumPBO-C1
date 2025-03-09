/* 
 * File   : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library java
 * Pembuat : Haidar Ali Laudza /24060123140151
 * Tanggal : 7 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer [] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Clean up code....");
        }
    }
}
