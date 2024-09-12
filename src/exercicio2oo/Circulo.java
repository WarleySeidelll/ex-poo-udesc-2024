//Rafael e Warley e Pablo
package exercicio2oo;

public class Circulo {
    private double raio;
    private double perimetro;
    private double area;
    private double diametro;
    public void setCirculo(double tamcirculo) {
        this.raio = tamcirculo;
    }
    public double getPerimetro() {
        return perimetro=2*Math.PI*raio;
    }
    public double getDiametro() {
        return diametro=2*raio;
    }
    public double getArea() {
        return area=Math.PI*Math.pow(raio,2);
    }
    public void getCirculo() {
        System.out.println("Tamanho:"+raio);
        System.out.println("Perimetro:"+getPerimetro());
        System.out.println("Diametro:"+getDiametro());
        System.out.println("Area:"+getArea());
    }
}
