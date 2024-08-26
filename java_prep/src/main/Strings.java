package main;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        Polimorfismo();
        Anagrama();
        subString();

    }

    private static void Polimorfismo() {
        String a = "nisin";
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (b.equals(a)) {
            System.out.println("Palindormo");
        } else {
            System.out.println("No es palindromo");
        }
    }

    private static void Anagrama() {
        String palabraUno = "roOt";
        String palabraDos = "roto";
        char[] pU = palabraUno.toLowerCase().toCharArray();
        char[] pD = palabraDos.toLowerCase().toCharArray();
        Arrays.sort(pU);
        Arrays.sort(pD);
        // String nuevoPU = new String(pU);
        // String nuevoPD = new String(pD);

        if (Arrays.equals(pU, pD)) {
            System.out.println("Si es un anagrama");
        } else if (!Arrays.equals(pU, pD)) {
            System.out.println("No es un anagrama");
        }
    }

    private static void subString() {
        String word = "welcometojava";
        int subSize = 3;
        String max = word.substring(0, subSize);
        String min = word.substring(0, subSize);
        for (int i = 1; i <= word.length() - subSize; i++) {
            String current = word.substring(i, i + subSize);
            if (current.compareTo(max) > 0) {
                max = current;
            }
            if (current.compareTo(min) < 0) {
                min = current;
            }
        }
        System.out.printf("Min: %s\nMax: %s", min, max);
    }
}
