package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Ficheros {

    public static void main(String[] args) {

        File file = new File("./main/sample.csv");

        try {
            Scanner scan = new Scanner(file);
            List<Persona> lista = new ArrayList<>();
            while (scan.hasNext()) {

                String[] str = scan.nextLine().split(",");

                Persona p = new Persona(str[0], Integer.parseInt(str[1]));
                lista.add(p);
            }
            System.out.println(lista);
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class Persona {

        String nombre;
        int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return nombre + "," + edad;
        }

    }
}
