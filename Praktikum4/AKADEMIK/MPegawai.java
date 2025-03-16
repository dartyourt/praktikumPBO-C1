package Praktikum4.AKADEMIK;

import java.time.LocalDate;

public class MPegawai {
        public static void main(String[] args) {
        // Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap(
                "57638652",
                "Haidar Ali Laudza",
                LocalDate.of(2003, 5, 3),
                LocalDate.of(2020, 1, 1),
                5000000.0,
                "Fakultas Sains dan Matematika",
                "812753"
        );
        // print dosen tetap
        System.out.println("===== Dosen Tetap =====");
        dosenTetap.printInfo();
        System.out.println();

       // Dosen Tamu
       DosenTamu dosenTamu = new DosenTamu(
        "84638936",
        "Susanto",
        LocalDate.of(1990, 6, 12),
        LocalDate.of(2017, 3, 10),
        4500000.0,
        "Fakultas Psikologi",
        "334834637",
        LocalDate.of(2025, 12, 31)
    );       
    // print dosen tamu
    System.out.println("===== Dosen Tamu =====");
    dosenTamu.printInfo();
    System.out.println();

    // Membuat objek Tendik
    Tendik tendik = new Tendik(
            "123456789",
            "Susanti",
            LocalDate.of(1992, 10, 20),
            LocalDate.of(2016, 7, 15),
            4000000.0,
            "Kemahasiswaan"
        );

    // print tendik
    System.out.println("===== Tendik =====");
    tendik.printInfo();
    System.out.println();
    }

}
