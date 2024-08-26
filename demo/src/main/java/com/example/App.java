package com.example;

import java.util.Scanner;

public final class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(mult(a, b));

        scan.close();
    }

    private static int mult(int a, int b) {
        int mult = a * b;
        return mult;
    }
}
