package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DatastructureLesson {

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>(10);

        a.add("Hola");
        a.add("mi");
        a.add("nombre");
        a.add("es");
        a.add("David");

        System.out.println(a.size());

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println();
        a.set(4, "Antonio");

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println();
        a.remove(0);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println();

        a.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println();

        System.out.println(a.contains("nombre"));
        System.out.println(a.contains("David"));
    }
}
