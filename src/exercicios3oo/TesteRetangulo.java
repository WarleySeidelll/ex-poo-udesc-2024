package exercicios3oo;

import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Retangulo ret = new Retangulo();
        System.out.printf("Digite o valor do 1º lado do retângulo : ");
        ret.setLd1(sc.nextDouble());

        System.out.printf("Digite o valor do 2º lado do retângulo : ");
        ret.setLd2(sc.nextDouble());


        ret.calcularArea();
        ret.imprimirArea();
        System.out.printf("\n");
        System.out.printf(ret.toString());
    }


}
