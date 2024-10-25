package exercicios3oo;
import java.util.Scanner;


public class TesteCarro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        Carro carro = new Carro();

        System.out.printf("\nQual o modelo do Carro : ");
        carro.setModelo(sc.nextLine());

        System.out.printf("\nQual o ano do Carro : ");
        carro.setAno(sc.nextInt());

        do{
            System.out.printf("\n");
            System.out.printf("\nO que você deseja fazer : ");
            System.out.printf("\n1 | Ligar o Carro! ");
            System.out.printf("\n2 | Acelar");
            System.out.printf("\n3 | Frear");
            System.out.printf("\n4 | Informações do Carro");
            System.out.printf("\n5 | Exibir Velocidade Atual");
            System.out.printf("\n6 | Desligar o Carro! ");
            System.out.printf("\n0 | Para Sair! ");
            opcao = sc.nextInt();

        switch(opcao){

            case 1:
                carro.ligarCarro();
            break;

            case 2:
                carro.acelerar();
                break;
            case 3 :
                carro.freiar();
                break;
            case 4 :
                System.out.printf(carro.toString());
                break;
            case 5 :
                carro.exibirvelocidadeAtual();
                break;
                case 6 :
                    carro.desligarCarro();
                    break;
        }


        }while(opcao!=0);

        sc.close();

    }
}
