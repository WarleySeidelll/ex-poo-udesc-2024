package exercicio1oo;

public class Circulo{
    double perimetro;
    double area;
    double raio;
    double diametro;
    public double getArea(){
        return area = Math.PI * Math.pow(raio, 2);
    }
    public double getPerimetro(){
        return perimetro = 2*Math.PI*raio;
    }
    public double getDiametro(){
        return diametro = raio*2;
    }
}

