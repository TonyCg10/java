package epoog;

public class Rectangle extends Parallelogram {

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB, sideB);
    }

    @Override
    public String toString() {
        return "[sideA = " + sideA + ", sideB = " + sideB + "]";
    }

}
