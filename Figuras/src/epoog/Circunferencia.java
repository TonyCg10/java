package epoog;

public class Circunferencia implements PoligonoRegular {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia(float diametro) {
        this.radio = diametro / 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPeri() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "[radio = " + radio + "]";
    }
}