package epoog;

public class Diamond extends Parallelogram {

    protected double majorDiagonal;
    protected double minorDiagonal;

    public Diamond(double sideA, double majorDiagonal, double minorDiagonal) {
        super(sideA, sideA, 0);
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
    }

    @Override
    public double getArea() {
        return (majorDiagonal * minorDiagonal) / 2;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

    @Override
    public String toString() {
        return "[sideA = " + sideA + ", majorDiagonal = " + majorDiagonal + ", minorDiagonal = " + minorDiagonal + "]";
    }

}
