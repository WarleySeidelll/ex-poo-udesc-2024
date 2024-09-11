//Rafael e Warley e Pablo
package exercicio2oo;

public class Retangulo {
    private double ld1;
    private double ld2;
    public void setRetangulo(double lado1, double lado2) {
        this.ld1 = lado1;
        this.ld2 = lado2;
    }
    public double setArea() {
        return (ld1*ld2);
    }
    public void getRetangulo() {
        System.out.println("o retangulo tem:"+setArea()+" de area");
    }
}
