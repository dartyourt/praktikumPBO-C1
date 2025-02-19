package Praktikum1;

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(3,5);
        Titik T3 = new Titik();
        T1.printTitik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(2, 3);
        System.out.println("T1: ");
        T1.printTitik();
        System.out.println("T2: ");
        T2.printTitik();
        System.out.println("Jumlah titik yang telah dibuat: " + Titik.getCounterTitik());
        System.out.println("Jumlah titik yang telah dibuat: " + T2.getCounterTitik());
        T1.refleksiY();
        T1.printTitik();
        T3 = T1.getRefleksiX();
        T3.printTitik();
        
    }
}
