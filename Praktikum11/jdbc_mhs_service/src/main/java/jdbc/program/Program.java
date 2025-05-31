/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Haidar Ali
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        System.out.println("Koneksi berhasil");

        // insert
        //System.out.println("\n===insert");
        //Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        //service.add(mhsAdd);
        //System.out.println("berhasil insert: " + mhsAdd);
        //displayAll();

        // update
        //System.out.println("\n===update");
        //Mahasiswa mhsUpdate = service.getById(5);
        //System.out.println("Akan diupdate data lama: " + mhsUpdate);
        //mhsUpdate.setNama("Dinaya");
        //System.out.println("dengan data baru: " + mhsUpdate);
        //service.update(mhsUpdate);
        //System.out.println("Berhasil update");
        //displayAll();

        // delete
        //System.out.println("\n===delete");
        //System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        System.out.println("Berhasil delete");
        displayAll();
    }

    static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> list = service.getAll();
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
    }
}
