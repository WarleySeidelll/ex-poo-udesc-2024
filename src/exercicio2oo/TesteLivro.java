//Rafael e Warley e Pablo
package exercicio2oo;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Livro livro1 = new Livro("","");

        System.out.println("Qual o nome do livro : ");
        String nome = sc.nextLine();
        livro1.setNome(nome);

        System.out.println("Qual o nome do autor :");
        String autor = sc.nextLine();
        livro1.setAutor(autor);

        livro1.exibirDisponibilidade();
        livro1.alugar();
        livro1.exibirDisponibilidade();
        livro1.devolver();
        livro1.exibirDisponibilidade();
    }
}
