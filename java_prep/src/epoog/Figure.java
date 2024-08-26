package epoog;

import java.util.ArrayList;
import java.util.List;

public class Figure {

    private List<RegularPolygon> figures = new ArrayList<RegularPolygon>();

    public void addFigure(RegularPolygon p) {
        figures.add(p);
    }

    // public int cantFigPorTipo(String tipo) {
    // int contador = 0;
    // tipo = tipo.toLowerCase();
    // for (PoligonoRegular poligonoRegular : figuras) {
    // switch (tipo) {
    // case "paralelogramo":
    // if (poligonoRegular instanceof Paralelogramo) {
    // contador++;
    // }
    // break;
    // case "cuadrado":
    // if (poligonoRegular instanceof Cuadrado) {
    // contador++;
    // }
    // break;
    // case "rectangulo":
    // if (poligonoRegular instanceof Rectangulo) {
    // contador++;
    // }
    // break;
    // case "rombo":
    // if (poligonoRegular instanceof Rombo) {
    // contador++;
    // }
    // break;
    // case "triangulo":
    // if (poligonoRegular instanceof Triangulo) {
    // contador++;
    // }
    // break;
    // case "circunferencia":
    // if (poligonoRegular instanceof Circunferencia) {
    // contador++;
    // }
    // break;
    // case "trapecio":
    // if (poligonoRegular instanceof Trapecio) {
    // contador++;
    // }
    // break;
    // default:
    // break;
    // }
    // }
    // return contador;
    // }

    public int numberOfFiguresByType(String type) {
        int amount = 0;
        for (RegularPolygon regularPolygon : figures) {
            if (regularPolygon.getClass().getSimpleName().equalsIgnoreCase(type.toLowerCase())) {
                amount++;
            }
        }
        return amount;
    }

    public double totalArea() {

        double total = 0;
        for (int i = 0; i < figures.size(); i++) {
            RegularPolygon f = figures.get(i);
            total += f.getArea();
        }
        return total;
    }

    public double totalPerimeter() {

        double total = 0;
        for (RegularPolygon regularPolygon : figures) {

            total += regularPolygon.getPerimeter();
        }
        return total;
    }

    public RegularPolygon largerArea() {

        RegularPolygon p = figures.get(0);
        for (int i = 1; i < figures.size(); i++) {
            RegularPolygon pU = figures.get(i);
            if (p.getArea() < pU.getArea()) {
                p = pU;
            }
        }
        return p;
    }

    public RegularPolygon largerPerimeter() {

        RegularPolygon p = figures.get(0);
        for (int i = 1; i < figures.size(); i++) {
            RegularPolygon pD = figures.get(i);
            if (p.getPerimeter() < pD.getPerimeter()) {
                p = pD;
            }
        }
        return p;
    }

    public double generalAreaAverage() {

        double average = 0;
        for (int i = 0; i < figures.size(); i++) {
            RegularPolygon f = figures.get(i);
            average = average + f.getArea();
        }
        return average / figures.size();
    }

    public double generalPerimeterAverage() {

        double average = 0;
        for (RegularPolygon regularPolygon : figures) {

            average = average + regularPolygon.getPerimeter();
        }
        return average / figures.size();
    }

    // public double promAreaPorTipo(String tipo) {
    // double promAreaTipo = 0;
    // for (PoligonoRegular poligonoRegular : figuras) {
    // switch (tipo) {
    // case "cuadrado":
    // if (poligonoRegular instanceof Cuadrado) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
    // }
    // }
    // break;
    // case "paralelogramo":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
    // }
    // }
    // break;
    // case "rombo":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
    // }
    // }
    // break;
    // case "rectangulo":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
    // }
    // }
    // break;
    // case "triangulo":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
    // }
    // }
    // break;
    // case "trapecio":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
    // }
    // }
    // break;
    // case "circunferencia":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
    // }
    // }
    // break;
    // default:
    // break;

    // }
    // }
    // return promAreaTipo;
    // }

    public double averageAreaByType(String type) {
        double average = 0;
        int amount = 0;
        for (RegularPolygon regularPolygon : figures) {
            if (regularPolygon.getClass().getSimpleName().equalsIgnoreCase(type.toLowerCase())) {
                average += regularPolygon.getArea();
                amount++;
            }
        }
        return average / amount;
    }

    // public double promPeriPorTipo(String tipo) {
    // double promPeriTipo = 0;
    // for (PoligonoRegular poligonoRegular : figuras) {
    // switch (tipo) {
    // case "cuadrado":
    // if (poligonoRegular instanceof Cuadrado) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
    // }
    // }
    // break;
    // case "paralelogramo":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
    // }
    // }
    // break;
    // case "rombo":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
    // }
    // }
    // break;
    // case "rectangulo":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
    // }
    // }
    // break;
    // case "triangulo":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
    // }
    // }
    // break;
    // case "trapecio":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
    // }
    // }
    // break;
    // case "circunferencia":
    // if (poligonoRegular instanceof Paralelogramo) {
    // for (int i = 0; i < figuras.size(); i++) {
    // PoligonoRegular f = figuras.get(i);
    // promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
    // }
    // }
    // break;
    // default:
    // break;

    // }
    // }
    // return promPeriTipo;
    // }

    public double averagePerimeterByType(String type) {
        double average = 0;
        int amount = 0;
        for (RegularPolygon regularPolygon : figures) {
            if (regularPolygon.getClass().getSimpleName().equalsIgnoreCase(type.toLowerCase())) {
                average += regularPolygon.getPerimeter();
                amount++;
            }
        }
        return average / amount;
    }

}
