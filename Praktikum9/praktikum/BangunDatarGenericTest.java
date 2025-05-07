package Praktikum9.praktikum;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(2);
        System.out.println("Keliling Lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());
    }
}
