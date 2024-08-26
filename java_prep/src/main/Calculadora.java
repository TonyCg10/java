package main;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            String operation = scan.nextLine();
            String[] operationArray = operation.split(" ");

            if (operationArray[1].equals("+")) {

                int x = Integer.parseInt(operationArray[0]);
                int y = Integer.parseInt(operationArray[2]);

                int result = x + y;
                System.out.println(result);

            } else if (operationArray[1].equals("-")) {

                int x = Integer.parseInt(operationArray[0]);
                int y = Integer.parseInt(operationArray[2]);

                int result = x - y;
                System.out.println(result);

            } else if (operationArray[1].equals("*")) {

                int x = Integer.parseInt(operationArray[0]);
                int y = Integer.parseInt(operationArray[2]);

                int result = x * y;
                System.out.println(result);

            } else if (operationArray[1].equals("/")) {

                int x = Integer.parseInt(operationArray[0]);
                int y = Integer.parseInt(operationArray[2]);

                int result = x / y;
                System.out.println(result);

            } else if (operationArray[0].equalsIgnoreCase("ce")) {

                return;

            }
        }
    }
}
