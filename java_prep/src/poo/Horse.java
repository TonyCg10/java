package poo;

public class Horse extends Animal {

    private double speed;

    public Horse(String n, String c, int l, double w, double speed) {
        super(n, c, l, w);
        this.speed = speed;
    }

    @Override
    public void makeSound() {
        System.out.println("uijiji!!");
    }

    public double getSpeed() {
        return speed;
    }

}
