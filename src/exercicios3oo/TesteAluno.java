package exercicios3oo;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        int opcaoTesteAluno;
        Aluno a1 = new Aluno("", 0, 0, 0, 0, "");

        Scanner sc = new Scanner(System.in);

        System.out.printf("\nDigite a matéria :");
        a1.setMateria(sc.nextLine());
        System.out.printf("\nDigite o nome do Aluno : ");
        a1.setNome(sc.nextLine());
        System.out.printf("\nDigite a idade do %s : ", a1.getNome());
        a1.setIdade(sc.nextInt());


        do {
            System.out.printf("\nBem vindo ao Sistema Escolar do Horizonte Inexplorado  !!");
            System.out.printf("\n 1- Inserir notas do Aluno");
            System.out.printf("\n 2- Calcular Média do Aluno");
            System.out.printf("\n 3- Verificar Situação do Aluno");
            System.out.printf("\n 4- Verificar Informações do Aluno");
            System.out.printf("\n 0- Sair");
            System.out.printf("\n Escolha uma opção: ");
            opcaoTesteAluno = sc.nextInt();
            switch (opcaoTesteAluno) {
                case 1:
                    System.out.printf("\nDigite a primeira nota : ");
                    a1.setNota1(sc.nextDouble());
                    a1.verificarNotas();

                    System.out.printf("\nDigite a segunda nota : ");
                    a1.setNota2(sc.nextDouble());
                    a1.verificarNotas();
                    System.out.printf("\nDigite a terceira nota : ");
                    a1.setNota3(sc.nextDouble());
                    a1.verificarNotas();
                    break;
                case 2:
                    a1.calcularMedia();
                    break;
                case 3:
                    a1.verificarSituacao();
                    break;
                case 4:
                    System.out.printf(a1.toString());
                    break;
            }

        } while (opcaoTesteAluno != 0);
        sc.close();

    }


}


