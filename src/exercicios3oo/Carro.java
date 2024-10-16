package exercicios3oo;

public class Carro {
    private String modelo;
    private double velocidade = 0;

    public Carro(){
        this.modelo = "";
    }

    public Carro(String modelo, double velocidade){
        this();
        velocidade = 0;
        this.modelo=modelo;
        this.velocidade=velocidade;

    }
    public void acelerar(){
        velocidade += 10;
        System.out.printf("\nAcelerando...");
    }
    public void freiar(){
        velocidade -= 10;
        System.out.printf("\nFreando...");
    }
    public void exibirvelocidadeAtual() {
        System.out.printf("\nSua velocidade atual é %.0f Km/h",getvelocidade() );
    }

    @Override
    public String toString() {
           return "Carro{" +
                   "modelo=" + modelo +
                   "velocidade=" + velocidade +
                   '}';
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getvelocidade() {
        return velocidade;
    }
    public void setvelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}

