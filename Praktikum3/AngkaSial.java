public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " angkanya nggak sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException e) {
            System.out.println(e.getMessage());
            System.out.println("hati2 masukin angka");
        }
    }
    /*
     * Ketika eksepsi terjadi, line 12 (atau di kode ini line 7) tidak akan dieksekusi
     * karena program akan langsung melompat ke blok catch
     * dan line 16 yang berisi block catch akan dieksekusi 
     * sehingga muncul Message dari AngkaSialException
     * dan pesan "hati2 masukin angka"
     * Ya, line 21 (atau di kode ini line 16) akan dieksekusi
     * karena pada line 14 mencoba menginput 3 yang akan merujuk pada line 4
     * dan line 4 akan melempar eksepsi AngkaSialException
     * dan line 16 akan menangkap eksepsi tersebut
     */
}
