package PostTest;

public class Manager extends Pegawai{
    private final int tunjangan = 700000;

    public Manager(String nama) {
        setNama(nama);
    }

    public int getTunjangan() {
        return tunjangan;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + getTunjangan());
        System.out.println("Gaji Total: " + getGaji());
    }
}
