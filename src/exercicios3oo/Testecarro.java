package exercicios3oo;

public class Testecarro {

    public static void main(String[] args) {

        Carro carro = new Carro("Chevette",0);

        carro.acelerar();
        carro.freiar();
        carro.exibirvelocidadeAtual();
        carro.acelerar();
        carro.acelerar();
        carro.exibirvelocidadeAtual();
        System.out.printf("\n");
        System.out.printf(carro.toString());
    }
}
