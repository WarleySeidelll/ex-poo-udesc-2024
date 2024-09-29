package exercicio2oo;
//Rafael e Warley e Pablo

public class Circulo {
    private double raio;

    public double perimetro() {
        return 2*Math.PI*getRaio();
    }
    public double diametro() {
        return 2*getRaio();
    }
    public double area() {
        return Math.PI*Math.pow(raio,2);
    }
    public void imprimirCirculo() {
        System.out.printf("\nPerimetro : %.2f",perimetro());
        System.out.printf("\nDiametro: %.2f",diametro());
        System.out.printf("\nArea: %.2f",area());
    }
    public double getRaio() {
        return this.raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}
