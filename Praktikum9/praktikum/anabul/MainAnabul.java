package Praktikum9.praktikum.anabul;

public class MainAnabul {
    public static void main(String[] args) {
        KoleksiAnabul k = new KoleksiAnabul(10);
        k.add(new Anjing("Doggo"));
        k.add(new Kucing("Kitty"));
        k.add(new Burung("Tweety"));
        k.add(new Anabul("Anabul"));
        k.add(new Anabul("Anabul2"));
        k.add(new Anabul("Anabul3"));
        k.add(new Kucing("Meong"));
        k.add(new Burung("Cuit"));
        k.add(new Anjing("GukGuk"));
        k.add(new Anabul("Anabul4"));

        k.showAll();
    }
}
