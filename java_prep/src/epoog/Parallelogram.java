package epoog;

public class Parallelogram implements RegularPolygon {

    protected double sideA;
    protected double sideB;
    protected double heightA;

    public Parallelogram(double sideA, double sideB, double heightA) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.heightA = heightA;
    }

    @Override
    public double getArea() {
        return sideA * heightA;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String toString() {
        return "[sideA = " + sideA + ", sideB = " + sideB + ", heightA = " + heightA + "]";
    }

}
