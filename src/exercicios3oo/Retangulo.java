package exercicios3oo;

public class Retangulo {
    private double ld1;
    private double ld2;

    public Retangulo(){}

    public Retangulo(double ld1, double ld2){
        this();
        this.ld1 = ld1;
        this.ld2 = ld2;
    }

    @Override
    public String toString(){
        return  "Lado 1 : " + ld1 +
                "\n" +
                "Lado 2 : " + ld2;
    }

    public double calcularArea(){
        return this.getLd1() * this.getLd2();
    }
    public void imprimirArea(){
        if(ld1 > 0 && ld2 > 0) {
            System.out.printf("A área do retângulo é %.2f: ", calcularArea());
        } else if (ld1 < 0 || ld2 < 0) {
            System.out.printf("Digite um valor válido para calcular a Área!!!");
            System.exit(0);
        } else if (ld1 == 0 && ld2 == 0) {
            System.out.printf("Digite um valor válido para calcular a Área!!!");
            System.exit(0);
        }
    }
    public double getLd1() {
        return ld1;
    }
    public double getLd2() {
        return ld2;
    }
    public void setLd1(double ld1) {
        this.ld1 = ld1;
    }
    public void setLd2(double ld2) {
        this.ld2 = ld2;
    }
}
