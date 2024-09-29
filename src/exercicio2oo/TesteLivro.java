//Rafael e Warley e Pablo
package exercicio2oo;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Livro livro1 = new Livro("", "");
        System.out.printf("Qual o nome do livro : ");
        String nome = sc.nextLine();
        livro1.setNome(nome);
        System.out.printf("\nQual o nome do autor :");
        String autor = sc.nextLine();
        livro1.setAutor(autor);
        int opcao = 0;
        do {
            System.out.printf("\nSistema de Empréstimo de Livros");
            System.out.printf("\n 1-Emprestar livro");
            System.out.printf("\n 2-Devolver livro");
            System.out.printf("\n 3-Verificar se o livro está emprestado");
            System.out.printf("\n 0-Sair");
            System.out.printf("\n Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    livro1.alugar();
                    break;
                case 2:
                    livro1.devolver();
                    break;
                case 3:
                    livro1.exibirDisponibilidade();
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
