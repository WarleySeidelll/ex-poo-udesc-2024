//Rafael e Warley e Pablo
package exercicio2oo;

public class Carro {
    private String modelo;
    private double velocidade;

    public void getacelerar(double acelerar){
    velocidade += acelerar;
    System.out.printf("\nAcelerando...");
    }
    public void getfreiar(double freiar){
        velocidade -= freiar;
        System.out.printf("\nFreando...");
    }
    public void getvelocidadeAtual() {
        System.out.printf("\nSua velocidade atual é %.0f Km/h",velocidade );
    }
    public void getimprimir(){
        System.out.printf("\no modelo do carro é %s", modelo);
        System.out.printf("\nSua velocidade atual é %.0f Km/h",velocidade) ;
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
