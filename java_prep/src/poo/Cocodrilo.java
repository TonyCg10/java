package poo;

public class Cocodrilo extends Animal {

    private int skinHardness;

    public Cocodrilo(String n, String c, int l, double w, int sh) {
        super(n, c, l, w);
        skinHardness = sh;
    }

    public int getSkinHardness() {
        return skinHardness;
    }

    public void setSkinHardness(int skinHardness) {
        this.skinHardness = skinHardness;
    }

    @Override
    public void makeSound() {
        System.out.println();
    }
}
