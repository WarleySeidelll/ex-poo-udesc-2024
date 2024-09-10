//Rafael e Warley e Pablo
package exercicio2oo;

public class Retangulo {
    double area;
    double ld1;
    double ld2;
    public void definirRetangulo(double lado1, double lado2) {
        this.ld1 = lado1;
        this.ld2 = lado2;
    }
    public double tamanhoRetangulo() {
        return (ld1*ld2);
    }
    public void imprimirRetangulo() {
        System.out.println("o retangulo tem:"+tamanhoRetangulo()+" de area");
    }
}
