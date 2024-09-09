package exercicio1oo;

import java.util.Scanner;

public class Testecarro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("Digite o modelo do carro: ");
        carro.Modelo(sc.next());

        System.out.println("O modelo do seu carro é "+carro.modelo);

        carro.acelerar();
        carro.acelerar();
        carro.frear();

    }
}
