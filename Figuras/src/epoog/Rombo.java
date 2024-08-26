package epoog;

public class Rombo extends Paralelogramo {

    protected double diagMay;
    protected double diagMen;

    public Rombo(double ladoA, double diagMay, double diagMen) {
        super(ladoA, ladoA, 0);
        this.diagMay = diagMay;
        this.diagMen = diagMen;
    }

    @Override
    public double getArea() {
        return (diagMay * diagMen) / 2;
    }

    @Override
    public double getPeri() {
        return 4 * ladoA;
    }

    @Override
    public String toString() {
        return "[ladoA = " + ladoA + ", diagMay = " + diagMay + ", diagMen = " + diagMen + "]";
    }

}
