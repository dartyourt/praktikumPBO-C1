package praktikum9.praktikum.koleksi;

public class koleksi <T> {
    private T[] wadah;
    private int nbElm;

    public koleksi(int size) {
        wadah = (T[]) new Object[size];
        nbElm = 0;
    }

    public void setSize(int nbElm) {
        this.nbElm = nbElm;
    }

    public int getSize() {
        return nbElm;
    }
}