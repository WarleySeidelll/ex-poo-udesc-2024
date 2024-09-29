//Rafael e Warley e Pablo
package exercicio2oo;

public class Testecarro {
    public static void main(String[]args){
     Carro cv1 = new Carro();
     cv1.setModelo("Fusca");
     cv1.setvelocidade(40);
     cv1.getimprimir();
     cv1.getacelerar(30);
     cv1.getvelocidadeAtual();
     cv1.getfreiar(50);
     cv1.getvelocidadeAtual();
    }
}

