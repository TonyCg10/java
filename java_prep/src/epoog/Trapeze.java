package epoog;

public class Trapeze implements RegularPolygon {

    private double majorBase;
    private double minorBase;
    private double height;
    private double nonParallelSideA;
    private double nonParallelSideB;

    public Trapeze(double majorBase, double minorBase, double height, double nonParallelSideA,
            double nonParallelSideB) {
        this.majorBase = majorBase;
        this.minorBase = minorBase;
        this.height = height;
        this.nonParallelSideA = nonParallelSideA;
        this.nonParallelSideB = nonParallelSideB;
    }

    @Override
    public double getArea() {
        return (majorBase + minorBase) / 2 * height;
    }

    @Override
    public double getPerimeter() {
        return majorBase + minorBase + nonParallelSideA + nonParallelSideB;
    }

    @Override
    public String toString() {
        return "[majorBase = " + majorBase + ", minorBase  = " + minorBase + ", height = " + height
                + ", nonParallelSideA = "
                + nonParallelSideA + ", nonParallelSideB = " + nonParallelSideB + "]";
    }

}
