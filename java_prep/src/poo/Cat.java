package poo;

public class Cat extends Animal{
    
    private int sleepHours;

    public Cat(String n, String c, int l, double w) {
        super(n, c, l, w);
        sleepHours = 14;
    }

    @Override
    public void makeSound() {
        System.out.println("meou!");
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(int sleepHours) {
        this.sleepHours = sleepHours;
    }
}
