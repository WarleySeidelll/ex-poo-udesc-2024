package exercicio1oo;

public class Retangulo {
    double lado1;
    double lado2;
    double area;

    public double getArea() {
        return lado1 * lado2;
    }

    public void setArea() {
        this.area = getArea();
    }
}