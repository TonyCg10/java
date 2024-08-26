package epoog;

public class Square extends Rectangle {

    public Square(double sideA) {
        super(sideA, sideA);
    }

    @Override
    public double getArea() {
        return Math.pow(sideA, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

    @Override
    public String toString() {
        return "[sideA = " + sideA + "]";
    }

}