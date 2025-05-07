package Praktikum9.praktikum;

/*
 * Haidar Ali Laudza
 * 
 */


import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Haidar");
        strings.add("Ali");
        strings.add("Tampan");

        System.out.println(strings);
        for (String s : strings) {
            System.out.println(s);
        }
        strings.remove("Ali");
        System.out.println(strings);

    }
}
