package exercicios3oo;

public class Circulo {
    private double raio;


    public Circulo() {}

    public Circulo(double raio) {
    this();
    this.raio = raio;
}
public void verificarRaio() {
        if (raio > 0){

        }else if (raio < 0) {
            System.out.println("Raio negativo!!");
        System.exit(0);
    }
}

    public double calcularPerimetro() {
            return 2*Math.PI*getRaio();


    }
    public double calcularDiametro() {
        return 2*getRaio();

    }

    public double calcularArea() {
        return Math.PI*Math.pow(raio,2);
    }

    @Override
    public String toString() {
    return "\nRaio=" + raio ;
    }

    public double getRaio() {
        return this.raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}
