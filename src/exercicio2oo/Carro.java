//Rafael e Warley e Pablo
package exercicio2oo;

public class Carro {
    private String modelo;
    private double velocidade;

    public void setModelo(String modelocarro,double velocidadeatual){
        this.modelo= modelocarro;
        this.velocidade = velocidadeatual;
    }
    public double getAcelerar(double aumentar){
        return velocidade += aumentar;
    }
    public double getFreiar(double diminuir){
        return velocidade -= diminuir;
    }
    public void getImprimir(){
        System.out.println("o modelo do carro é:"+modelo);
        System.out.println("a sua velocidade é:"+velocidade);
    }
}
