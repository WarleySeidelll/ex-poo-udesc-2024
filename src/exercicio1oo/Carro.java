package exercicio1oo;

public class Carro {

    String modelo;
    double velocidadeAtual=0;


    public Carro() {
        this.velocidadeAtual = 0;
    }


    public void Modelo(String modelo) {
        this.modelo = modelo;

    }

    public void acelerar() {
        velocidadeAtual +=10;
        System.out.println("Acelerando..... \n Velocidade atual: " + velocidadeAtual + " km/h");
    }


    public void frear() {
        velocidadeAtual -=10;
        System.out.println("Freando..... \n Velocidade atual: " + velocidadeAtual + " km/h");

    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
}