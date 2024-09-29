package exercicio2oo;

public class TesteCarro {
    public static void main(String[]args){
        Carro cv1 = new Carro();
        cv1.setModelo("Fusca");
        cv1.setvelocidade(40);
        cv1.imprimir();
        cv1.acelerar(30);
        cv1.velocidadeAtual();
        cv1.freiar(50);
        cv1.velocidadeAtual();
    }
}
