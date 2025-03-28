public class Tendik extends Karyawan {
    private static int counterTendik = 0;

    public Tendik(String nama, String email, String nip, double masaKerja) {
        super(nama, email, nip, masaKerja);
        counterTendik++;
    }

    public static int getCounterTendik() {
        return counterTendik;
    }

    @Override
    public double hitungGaji() {
        return 4000000 + (getMasaKerja() * 0.01 * 4000000);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
    
}
