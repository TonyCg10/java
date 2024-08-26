package epoog;

public class Triangle implements RegularPolygon {

    private double sideA;
    private double sideB;
    private double sideC;
    private double heightA;

    public Triangle(double sideA, double sideB, double sideC, double heightA) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightA = heightA;
    }

    @Override
    public double getArea() {
        return sideA * heightA / 2;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "[sideA = " + sideA + ", sideB = " + sideB + ", sideC = " + sideC + ", heightA = " + heightA + "]";
    }

}
