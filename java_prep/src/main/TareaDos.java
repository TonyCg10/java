package main;

import java.util.Arrays;
import java.util.Scanner;

public class TareaDos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] lista = Inicio(scan);
        Menu(scan, lista);
    }

    private static int[] Inicio(Scanner scan) {
        int num;
        System.out.println("Inserte su lista.");
        num = scan.nextInt();
        int[] lista = List(scan, num);
        return lista;
    }

    private static int[] List(Scanner scan, int num) {
        int[] list = new int[Math.abs(num)];
        if (num > 0) {
            for (int i = 0; i < list.length; i++) {
                list[i] = scan.nextInt();
            }
        } else {
            for (int i = 0; i < list.length; i++) {
                list = generateList(Math.abs(num));
            }
        }
        return list;
    }

    private static void Menu(Scanner scan, int[] lista) {
        String ordenes = "";
        System.out.println("\nprint para imprimir la lista lista\n");
        System.out.println("sort para ordenar lista\n");
        System.out.println("max para dar el valor maximo\n");
        System.out.println("min para dar el valor minimo\n");
        System.out.println("0 para salir\n");
        while (!ordenes.equals("0")) {
            ordenes = scan.next();

            switch (ordenes) {
                case "print":
                    System.out.println("La lista es: " + Arrays.toString(lista));
                    break;
                case "sort":
                    sort(lista);
                    break;
                case "max":
                    print(max(lista, 1));
                    break;
                case "min":
                    System.out.println("Minimo: ");
                    break;
                case "0":
                    System.out.println("Adios!!!");
                    return;
                default:
                    System.out.println("Caracter incorrecto. Ingrese nueva orden");
            }
        }
    }

    private static void sort(int[] lista) {
        int[] lista2 = Arrays.copyOf(lista, lista.length);
        Arrays.sort(lista2);
        System.out.println("Ordenada se ve: " + Arrays.toString(lista2));

    }

    private static int[] max(int[] lista, int num) {
        num = Math.min(lista.length, num);
        int[] gmax = new int[num];
        for (int i = 0; i < gmax.length; i++) {
            gmax[i] = lista[lista.length - 1 - i];
        }
        return gmax;
    }

    public static void min(int[] lista) {

    }

    public static int[] generateList(int size) {
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10 - 5);
        }
        return list;
    }

    public static void print(int[] lista) {
        System.out.println(Arrays.toString(lista));
    }
}
