package epoog;

public class Cuadrado extends Rectangulo {

    public Cuadrado(double ladoA) {
        super(ladoA, ladoA);
    }

    @Override
    public double getArea() {
        return Math.pow(ladoA, 2);
    }

    @Override
    public double getPeri() {
        return 4 * ladoA;
    }

    @Override
    public String toString() {
        return "[ladoA = " + ladoA + "]";
    }

}