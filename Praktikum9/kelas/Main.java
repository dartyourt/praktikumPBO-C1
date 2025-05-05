package Praktikum9.kelas;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List<String> L;
        //Queue<String> L;
        //Iterator<String> i;
        //Set<String> L;
        Map<Integer, String> L;
        Set<Integer> i;
        //String o;

        //L = new ArrayList<>();
        //L = new LinkedList<>();
        //L = new HashSet<>();
        L = new HashMap<>();
        //L.add("Haidar");
        //L.add("Ali");
        //L.add("Haidar");
        L.put(1, "Haidar");
        L.put(48, "Ali");
        L.put(38, "Tampan");
        System.out.println("banyak elemen: " + L.size());
        /*for (int i = 1; i <= L.size(); i++) {
            System.out.println("elemen ke-" + i + ": " + L.get(i));
        }*/

        /*for (String s : L) {
            System.out.println(s);
        }*/ 
        // Menggunakan iterator
        /*i = L.iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.println(s);
        }*/
        // Menggunakan for
        /*for (int j = 0; j < L.size(); j++) {
            System.out.println(L.get(j));
        }*/
        //System.err.println("elemen first: " + L.peek());    
        //o = L.poll();
        /*for (String s : L) {
            System.out.println(s);
        }*/
        i = L.keySet();

        for (Integer x : i) {
            System.out.println("key: " + x + " value: " + L.get(x));    
        }
    }
}
    
