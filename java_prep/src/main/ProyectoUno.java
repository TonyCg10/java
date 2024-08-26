package main;

import java.util.Arrays;
import java.util.Scanner;

public class ProyectoUno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        InicioYMenu(scan);

    }

    private static void InicioYMenu(Scanner scan) {

        System.out.println("Ingrese 'Quiero iniciar' para empezar: ");
        String inZ;
        inZ = scan.nextLine();
        String inI = "Quiero iniciar";
        int[] LA2 = ListaAleatoria(scan);

        if (inZ.equalsIgnoreCase(inI)) {

            Texto();

            while (inZ.equalsIgnoreCase(inI)) {
                String inS = scan.nextLine();

                switch (inS) {
                    case "cate":
                        case1();
                        break;
                    case "m":
                        int m = scan.nextInt();
                        if (m == 25) {
                            case2();
                            print(LA2);
                        } else {
                            System.out.println("Vuelve a intentar");
                        }
                        break;
                    case "Suma":
                        int su = scan.nextInt();
                        if (su == Suma(scan, LA2)) {

                            System.out.println("\n" + "Correcto");
                            System.out.println("Dime su mitad redondeado al numero inferior");
                        } else {
                            System.out.println("Vuelve a intentar");
                        }
                    case "Mitad":
                        int sum = Suma(scan, LA2);
                        int i = Mitad(scan, sum);
                        int x = scan.nextInt();

                        if (x == i) {

                            System.out.println("\n" + "Bien!");
                            System.out.println("Escribe 'continuar' para pasar al siguiente puzzle");
                        } else {
                            System.out.println("Vuelve a intentar");
                        }
                        break;
                    case "continuar":
                        System.out.println("Todavia en proceso");
                        break;
                    case "Salir":
                        System.out.println("Adios!!");
                        return;
                }
            }
        } else {
            System.out.println("Error");
        }
    }

    private static void case2() {
        System.out.println("\n" + "Correcto");
        System.out.println("Bien!!");
        System.out.println("Hagamos algo mas dificil!!");
        System.out.println("Dime la suma total de esta lista" + "\n");
        System.out.println("Escribe 'Suma' para resolver" + "\n");
    }

    private static void case1() {
        System.out.println("Correcto!!" + "\n");
        System.out.println("La siguiente es una multiplicacio 5 x 5 =");
        System.out.println("Escribe 'm' para responder");
    }

    private static void Texto() {
        System.out.println("Escriba 'Salir' para terminar.\n");
        System.out.println("Bienvenido!! ");
        System.out.println("Aqui deberas de acertar adivinanzas\ny operaciones para conseguir el premio\n");
        System.out.println("Empezemos con una falcil: \n");
        System.out.println("El aguacate es mitad agua y mitad...");
    }

    public static int[] ListaAleatoria(Scanner scan) {
        int[] LA = new int[4];
        for (int i = 1; i < LA.length; i++) {
            LA[i] = (int) (Math.random() * 10 * 2);
        }
        return LA;
    }

    private static int Mitad(Scanner scan, int sum) {
        int m = sum;
        m /= 2;
        return m;
    }

    private static int Suma(Scanner scan, int[] LA2) {
        int sum = 0;
        for (int item : LA2) {
            sum += item;
        }
        return sum;
    }

    public static void print(int[] LA2) {
        System.out.println(Arrays.toString(LA2));
    }

}
