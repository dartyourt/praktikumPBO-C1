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
        /*  harusnya gunakan if else assert(jari2<=0):"Jari-jari tidak boleh nol!!!";
            kalau seperti di atas, maka akan muncul AssertionError
            kalau seperti kode awal, maka tidak akan muncul AssertionError ketika jari2<=0
            Sehingga Asersi di kode awal digunakan pada kondisi yang tidak diinginkan 
        */
    }

}
