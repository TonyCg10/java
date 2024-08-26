package epoog;

public class Paralelogramo implements PoligonoRegular {

    protected double ladoA;
    protected double ladoB;
    protected double alturaA;

    public Paralelogramo(double ladoA, double ladoB, double alturaA) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.alturaA = alturaA;
    }

    @Override
    public double getArea() {
        return ladoA * alturaA;
    }

    @Override
    public double getPeri() {
        return 2 * (ladoA + ladoB);
    }

    @Override
    public String toString() {
        return "[ladoA = " + ladoA + ", ladoB = " + ladoB + ", alturaA = " + alturaA + "]";
    }

}
