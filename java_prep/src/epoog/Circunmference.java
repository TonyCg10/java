package epoog;

public class Circunmference implements RegularPolygon {

    private double radio;

    public Circunmference(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI + radio;
    }

    @Override
    public String toString() {
        return "[radio = " + radio + "]";
    }
}