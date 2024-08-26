package main;

import java.util.Arrays;
import java.util.Scanner;

public class TareaRelt {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Type the length of the list or a negative number to randomly fill the list the absolute value as length");

        int l = scanner.nextInt();

        int list[] = buildList(l, scanner);

        int originalList[] = Arrays.copyOf(list, list.length);
        Arrays.sort(list);
        System.out.println("Type one of the following commands or 0 to exit the program");
        System.out.println("max\nmax (x)\nmin\nmin (x)\nprint\nsort\npairs\ndiv\ndiv (x)");
        scanner.nextLine();
        String command = scanner.nextLine().trim();
        while (!command.equals("0")) {
            String[] arg = command.split("\s");
            String c = arg[0];
            switch (c) {
                case "max":
                    if (arg.length == 1)
                        print(getMax(list, 1));
                    else
                        print(getMax(list, Integer.parseInt(arg[1])));
                    break;
                case "min":
                    if (arg.length == 1)
                        print(getMin(list, 1));
                    else
                        print(getMin(list, Integer.parseInt(arg[1])));
                    break;
                case "print":
                    print(originalList);
                    break;
                case "sort":
                    print(list);
                    break;
                case "pairs":
                    print(div(list, 2));
                    break;
                case "div":
                    if (arg.length == 1) {
                        print(div(list, 1));
                    } else {
                        print(div(list, Integer.parseInt(arg[1])));
                    }
                    break;
                case "sum":
                    System.out.println(sum(list));
                    break;
                default:
                    System.out.println("Command not available");
                    break;
            }
            command = scanner.nextLine().trim();
        }
        System.out.println("Bye!");
        scanner.close();
    }

    public static int[] buildList(int size, Scanner scanner) {
        int[] list = new int[Math.abs(size)];
        if (size > 0) {
            System.out.println("Type the list items");
            for (int i = 0; i < list.length; i++) {
                list[i] = scanner.nextInt();
            }
        } else {
            for (int i = 0; i < list.length; i++) {
                list[i] = (int) (Math.random() * 100) - 50;
            }
        }

        return list;
    }

    public static int[] getMax(int[] list, int size) {
        size = Math.min(list.length, size);
        int[] l = new int[size];
        for (int i = 0; i < l.length; i++) {
            l[i] = list[list.length - 1 - i];
        }
        return l;
    }

    public static int[] getMin(int[] list, int size) {
        size = Math.min(list.length, size);
        // int[] l = new int[size];
        // for (int i = 0; i < l.length; i++) {
        // l[i] = list[i];
        // }
        return Arrays.copyOf(list, size);
    }

    public static void print(int[] list) {
        System.out.println(Arrays.toString(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;
    }

    public static int[] div(int[] list, int d) {
        int[] l = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            int item = list[i];
            if (item % d == 0)
                l[index++] = item;
        }
        return Arrays.copyOf(l, index);
    }
}