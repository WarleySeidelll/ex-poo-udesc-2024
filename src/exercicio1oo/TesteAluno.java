package exercicio1oo;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        System.out.println("Digite o seu nome:");
        aluno1.nome = sc.nextLine();
        System.out.println("Digite a sua idade:");
        aluno1.idade = sc.nextInt();
        System.out.println("Digite a sua primeira nota:");
        aluno1.nota1 = sc.nextDouble();
        System.out.println("Digite a sua segunda nota:");
        aluno1.nota2 = sc.nextDouble();
        System.out.println("Digite a sua terceira nota:");
        aluno1.nota3 = sc.nextDouble();
        aluno1.media = aluno1.getMedia();
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("A sua media é:"+aluno1.media);
        System.out.println("voce foi:"+aluno1.getSituacao());
    }

}