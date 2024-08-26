package epoog;

public class Trapecio implements PoligonoRegular {

    private double baseMay;
    private double baseMen;
    private double altura;
    private double ladoNoParaU;
    private double ladoNoParaD;

    public Trapecio(double baseMay, double baseMen, double altura, double ladoNoParaU, double ladoNoParaD) {
        this.baseMay = baseMay;
        this.baseMen = baseMen;
        this.altura = altura;
        this.ladoNoParaU = ladoNoParaU;
        this.ladoNoParaD = ladoNoParaD;
    }

    @Override
    public double getArea() {
        return baseMay + baseMen / 2 * altura;
    }

    @Override
    public double getPeri() {
        return baseMay + baseMen + ladoNoParaU + ladoNoParaD;
    }

    @Override
    public String toString() {
        return "[BaseMay = " + baseMay + ", BaseMen  = " + baseMen + ", alturaMay = " + altura + ", ladoNoParaU = "
                + ladoNoParaU + ", ladoNoParaD = " + ladoNoParaD + "]";
    }

}
