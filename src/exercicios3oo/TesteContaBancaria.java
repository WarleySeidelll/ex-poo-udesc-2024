package exercicios3oo;

import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        ContaBancaria conta = new ContaBancaria();

        double depositar, sacar;

        System.out.printf("Digite o Titula" +
                "]r da Conta:  ");
        conta.setTitular(sc.next());

        System.out.printf("\nLista de bancos válidos:");
        System.out.printf("\n001 - Banco do Brasil");
        System.out.printf("\n104 - Caixa Econômica");
        System.out.printf("\n033 - Santander");
        System.out.printf("\n237 - Bradesco");
        System.out.printf("\n341 - Itaú");
        System.out.printf("\n356 - Banco Real");
        System.out.printf("\n389 - Banco Inter");
        System.out.printf("\n399 - NuBank");
        conta.verificarBanco();


        System.out.printf("\nDigite o numero da Conta:  ");
        conta.setNumeroConta(sc.nextInt());

        do {
            System.out.printf("\nBem vindo %s !!", conta.getTitular());
            System.out.printf("\nSistema Bancário da Agencia do %s ", conta.getAgencia());
            System.out.printf("\n 1- Depositar");
            System.out.printf("\n 2- Sacar");
            System.out.printf("\n 3- Verificar Saldo ");
            System.out.printf("\n 4- Verificar Informações da Conta");
            System.out.printf("\n 0-Sair");
            System.out.printf("\n Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("\nQual o valor deseja depositar :  ");
                    depositar = sc.nextDouble();
                    conta.depositar(depositar);
                    break;
                case 2:
                    System.out.printf("\nQual o valor deseja sacar :  ");
                    sacar = sc.nextDouble();
                    conta.sacar(sacar);
                    break;
                case 3:
                    conta.saldoDisponivel();
                    break;
                case 4:
                    System.out.printf(conta.toString());
            }

        } while (opcao != 0);

        sc.close();

    }
}
