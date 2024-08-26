package main;

import java.util.Arrays;

public class List {

    public static int[] generateList(int randomList) {
        int[] list = new int[randomList];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10 - 10);
        }
        return list;
    }

    public static void print(int[] list) {
        String data[] = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            data[i] = String.valueOf(list[i]);
        }
        System.out.println(String.join(",", data));
    }

    private static void Multiplos() {
        int[] multiplos = new int[11];
        for (int i = 1; i < multiplos.length; i++) {
            System.out.println(" ");
            System.out.println("Multiplos de" + " " + i);
            System.out.println(" ");
            for (int j = 1; j <= 10; j++) {
                int mult = i * j;
                System.out.println(i + " x " + j + " = " + mult);
            }
        }
    }

    public static void main(String[] args) {
        int[] g = generateList(5);
        for (int i = 0; i < g.length; i++) {
        }
        print(g);

        Multiplos();

    }
}