//Rafael e Warley e Pablo
package exercicio2oo;

public class Retangulo {
    private double ld1;
    private double ld2;

    public double calcularArea(){
        return this.getLd1() * this.getLd2();
    }
    public void imprimirArea(){
        System.out.printf("A área do retângulo é %.2f: ",calcularArea());
    }
    public double getLd1() {
        return this.ld1;
    }
    public double getLd2() {
        return this.ld2;
    }
    public void setLd1(double ld1) {
        this.ld1 = ld1;
    }
    public void setLd2(double ld2) {
        this.ld2 = ld2;
    }
}
