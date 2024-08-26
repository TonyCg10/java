package epoog;

import java.util.ArrayList;
import java.util.List;

public class Figura {

    private List<PoligonoRegular> figuras = new ArrayList<PoligonoRegular>();

    public void addFigura(PoligonoRegular p) {
        figuras.add(p);
    }

    public int cantFigPorTipo(String tipo) {
        int contador = 0;
        tipo = tipo.toLowerCase();
        for (PoligonoRegular poligonoRegular : figuras) {
            switch (tipo) {
                case "paralelogramo":
                    if (poligonoRegular instanceof Paralelogramo) {
                        contador++;
                    }
                    break;
                case "cuadrado":
                    if (poligonoRegular instanceof Cuadrado) {
                        contador++;
                    }
                    break;
                case "rectangulo":
                    if (poligonoRegular instanceof Rectangulo) {
                        contador++;
                    }
                    break;
                case "rombo":
                    if (poligonoRegular instanceof Rombo) {
                        contador++;
                    }
                    break;
                case "triangulo":
                    if (poligonoRegular instanceof Triangulo) {
                        contador++;
                    }
                    break;
                case "circunferencia":
                    if (poligonoRegular instanceof Circunferencia) {
                        contador++;
                    }
                    break;
                case "trapecio":
                    if (poligonoRegular instanceof Trapecio) {
                        contador++;
                    }
                    break;
                default:
                    break;
            }
        }
        return contador;
    }

    public double areaTotal() {

        double total = 0;
        for (int i = 0; i < figuras.size(); i++) {
            PoligonoRegular f = figuras.get(i);
            total += f.getArea();
        }
        return total;
    }

    public double periTotal() {

        double total = 0;
        for (PoligonoRegular poligonoRegular : figuras) {

            total += poligonoRegular.getPeri();
        }
        return total;
    }

    public PoligonoRegular mayorArea() {

        PoligonoRegular p = figuras.get(0);
        for (int i = 1; i < figuras.size(); i++) {
            PoligonoRegular pU = figuras.get(i);
            if (p.getArea() < pU.getArea()) {
                p = pU;
            }
        }
        return p;
    }

    public PoligonoRegular mayorPeri() {

        PoligonoRegular p = figuras.get(0);
        for (int i = 1; i < figuras.size(); i++) {
            PoligonoRegular pD = figuras.get(i);
            if (p.getPeri() < pD.getPeri()) {
                p = pD;
            }
        }
        return p;
    }

    public double promAreaGen() {

        double promedio = 0;
        for (int i = 0; i < figuras.size(); i++) {
            PoligonoRegular f = figuras.get(i);
            promedio = promedio + f.getArea() ;
        }
        return promedio/figuras.size();
    }

    public double promPeriGen() {

        double promedio = 0;
        for (PoligonoRegular poligonoRegular : figuras) {

            promedio = promedio + poligonoRegular.getPeri() ;
        }
        return promedio/ figuras.size();
    }

    public double promAreaPorTipo(String tipo) {
        double promAreaTipo = 0;
        for (PoligonoRegular poligonoRegular : figuras) {
            switch (tipo) {
                case "cuadrado":
                    if (poligonoRegular instanceof Cuadrado) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
                        }
                    }
                    break;
                case "paralelogramo":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
                        }
                    }
                    break;
                case "rombo":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
                        }
                    }
                    break;
                case "rectangulo":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
                        }
                    }
                    break;
                case "triangulo":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
                        }
                    }
                    break;
                case "trapecio":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
                        }
                    }
                    break;
                case "circunferencia":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promAreaTipo = (promAreaTipo + f.getArea()) / figuras.size();
                        }
                    }
                    break;
                default:
                    break;

            }
        }
        return promAreaTipo;
    }

    public double promAreaPorTipo2(String tipo) {
        double promAreaTipo = 0;
        int cantidad =0;
        for (PoligonoRegular poligonoRegular : figuras) {
            if(poligonoRegular.getClass().getSimpleName().equalsIgnoreCase(tipo.toLowerCase())){
                promAreaTipo += poligonoRegular.getArea();
                cantidad ++;
            }
        }
        return promAreaTipo / cantidad;
    }

    public double promPeriPorTipo(String tipo) {
        double promPeriTipo = 0;
        for (PoligonoRegular poligonoRegular : figuras) {
            switch (tipo) {
                case "cuadrado":
                    if (poligonoRegular instanceof Cuadrado) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
                        }
                    }
                    break;
                case "paralelogramo":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
                        }
                    }
                    break;
                case "rombo":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
                        }
                    }
                    break;
                case "rectangulo":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
                        }
                    }
                    break;
                case "triangulo":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
                        }
                    }
                    break;
                case "trapecio":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
                        }
                    }
                    break;
                case "circunferencia":
                    if (poligonoRegular instanceof Paralelogramo) {
                        for (int i = 0; i < figuras.size(); i++) {
                            PoligonoRegular f = figuras.get(i);
                            promPeriTipo = (promPeriTipo + f.getPeri()) / figuras.size();
                        }
                    }
                    break;
                default:
                    break;

            }
        }
        return promPeriTipo;
    }

}
