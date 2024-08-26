package epoog;

public class Rectangulo extends Paralelogramo {

    public Rectangulo(double ladoA, double ladoB) {
        super(ladoA, ladoB, ladoB);
    }

    @Override
    public String toString() {
        return "[ladoA = " + ladoA + ", ladoB = " + ladoB + "]";
    }

}
