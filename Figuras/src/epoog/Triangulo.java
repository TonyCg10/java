package epoog;

public class Triangulo implements PoligonoRegular {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double alturaA;

    public Triangulo(double ladoA, double ladoB, double ladoC, double alturaA) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.alturaA = alturaA;
    }

    @Override
    public double getArea() {
        return ladoA * alturaA / 2;
    }

    @Override
    public double getPeri() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public String toString() {
        return "[alturaA = " + alturaA + ", ladoA = " + ladoA + ", ladoB = " + ladoB + ", ladoC = " + ladoC + "]";
    }

}
