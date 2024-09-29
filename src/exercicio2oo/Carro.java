package exercicio2oo;
//Rafael e Warley e Pablo

public class Carro {
    private String modelo;
    private double velocidade;

    public void acelerar(double acelerar){
        velocidade += acelerar;
        System.out.printf("\nAcelerando...");
    }
    public void freiar(double freiar){
        velocidade -= freiar;
        System.out.printf("\nFreando...");
    }
    public void velocidadeAtual() {
        System.out.printf("\nSua velocidade atual é %.0f Km/h",getvelocidade() );
    }
    public void imprimir(){
        System.out.printf("\no modelo do carro é %s", getModelo());
        System.out.printf("\nSua velocidade atual é %.0f Km/h",getvelocidade()) ;
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

