package main;

import java.util.ArrayList;
import java.util.List;

public class Excepciones {
    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();

        list.add(new Fruit("Orange", 3));
        //list.add(null);
        list.add(new Fruit("Guava", 1));
        list.add(new Fruit("Pineapple", 5));
        list.add(new Fruit("Apple", 2));

        try {

            print(list);
            System.out.println("Ok");

        } catch (MyCustomException e) {

            System.out.println(e);

        } catch (NullPointerException e) {

            System.out.println(333);

        } catch (Exception e) {

            System.out.println(e);

        }

        System.out.println("Done!");

    }

    static void print(List<Fruit> list) throws MyCustomException {

        for (Fruit fruit : list) {

            System.out.println(fruit.toString());

        }
    }

    static class MyCustomException extends Exception {

        public MyCustomException() {

            super("Mi mensaje personalizado");

        }

    }

    static class Fruit implements Comparable<Fruit> {

        private String name;
        private int acid;

        public Fruit(String name, int acid) {
            this.name = name;
            this.acid = acid;
        }

        public String getName() {
            return name;
        }

        public int getAcid() {
            return acid;
        }

        @Override
        public String toString() {

            return "Fruit\nname: " + name + "\nacid: " + acid;

        }

        @Override
        public int compareTo(Fruit o) {

            return o.getAcid() - acid;

        }
    }
}