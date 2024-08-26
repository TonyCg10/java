package poo;

public abstract class Animal implements IMakeSound {

    private String name;
    String color;
    private int legs;
    private double weight;

    public Animal(String n, String c, int l, double w) {
        name = n;
        color = c;
        legs = l;
        weight = w;
    }

    public String getAnimalId() {
        return name + " " + color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name: " + name + " color: " + color + " legs: " + legs + " weight: " + weight;
    }
}
