package poo;

public class Cow extends Animal {

    private double milkAmount;

    public Cow(String n, String c, int l, double w) {
        super(n, c, l, w);
        milkAmount = 4.3;
    }

    @Override
    public void makeSound() {
        System.out.println("Muuuu!!");
    }

    public double getMilkAmount() {
        return milkAmount;
    }

    public void setMilkAmount(double milkAmount) {
        this.milkAmount = milkAmount;
    }
}
