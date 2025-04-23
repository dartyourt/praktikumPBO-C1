package PostTest;
import java.util.ArrayList;

public class Mainan {
   public static void main(String[] args) {
      Pegawai pegawai = new Programmer("Mira");
      Pegawai peagawai2 = new Manager("Joko");
      Manager pegawai3 = new Manager("Argo");

      ArrayList<Pegawai> emps = new ArrayList<>();
      emps.add(pegawai);
      emps.add(peagawai2);
      emps.add(pegawai3);
      for (Pegawai emp : emps) {
         emp.tampilData();
      }
    }
}