package PostTest;

public class Pegawai {
    private String nama;
    private final int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public int getGaji() {
        return gajiPokok;
    }
    
    public void tampilData() {
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
