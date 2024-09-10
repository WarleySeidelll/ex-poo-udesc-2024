package exercicio1oo;

import java.util.Scanner;

public class Testelivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Scanner sc = new Scanner(System.in);
        int opcao=0;
        do {
            System.out.println("\nSistema de Empréstimo de Livros");
            System.out.println("1-Emprestar livro");
            System.out.println("2-Devolver livro");
            System.out.println("3-Verificar se o livro está emprestado");
            System.out.println("0-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    livro1.emprestar();
                    break;
                case 2:
                    livro1.devolver();
                    break;
                case 3:
                    if(livro1.estaEmprestado()){
                        System.out.println("O livro"+ livro1 +"está emprestado.");
                    } else{
                        System.out.println("O livro"+livro1+"está disponível.");
                    }
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}