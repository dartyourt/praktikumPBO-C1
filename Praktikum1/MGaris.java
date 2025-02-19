package Praktikum1;

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        Garis G2 = new Garis (new Titik(1,2), new Titik(3,4));
        System.out.println("Panjang garis G1: " + G2.panjangGaris());
        G1.printGaris();
        G1.setTitikAwal(new Titik(2,3));
        G1.setTitikAkhir(new Titik(4,5));
        G1.printGaris();
        System.out.println("Panjang garis G1: " + G1.panjangGaris());
        System.out.println("Gradien garis G1: " + G1.gradienGaris());
        System.out.println("Gradien garis G1: " + G2.gradienGaris());
        System.out.println("Apakah sejajar G1 dan G2: " + G1.isSejajar(G2));
        System.out.println("Apakah tegak lurus G1 dan G2: " + G1.isTegakLurus(G2));
    }
}
