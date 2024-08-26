package poo;

public class Perro extends Animal{

    private String raza;

    public Perro(String n, String raza, String c, int l, double w) {
        super(n, c, l, w);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public void makeSound() {
        System.out.println("Guau guau!");

    }

}
