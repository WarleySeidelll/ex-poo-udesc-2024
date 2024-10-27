package exercicios3oo;

import java.util.Scanner;

public class TesteCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo c1 = new Circulo();
        int opcao = 0;

        System.out.printf(" Informe o raio do circulo: ");
        c1.setRaio(sc.nextDouble());
        c1.verificarRaio();

        do {
            System.out.printf(" \nO que deseja fazer : ");
            System.out.printf("\n1 | Calcular Diametro");
            System.out.printf("\n2 | Calcular Area");
            System.out.printf("\n3 | Calcular Perimetro");
            System.out.printf("\n4 | Imprimir informações");
            System.out.printf("\n0 | Sair");
            System.out.printf("\nDigite o código : ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Diametro : %.2f", c1.calcularDiametro());
                    break;
                case 2:
                    System.out.printf("Area : %.2f", c1.calcularArea());
                    break;
                case 3:
                    System.out.printf("Area : %.2f", c1.calcularPerimetro());
                    break;
                case 4:
                    System.out.printf(c1.toString());
            }
        } while (opcao != 0);
        sc.close();
    }
}
