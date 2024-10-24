package exercicios3oo;

import java.util.Scanner;

public class Aluno {

    Scanner sc = new Scanner(System.in);

    private String nome, materia;
    private int idade;
    private double nota1, nota2, nota3;


    public Aluno() {
        this.nome = "";
    }

    public Aluno(String nome, int idade, double n1, double n2, double n3, String materia) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.materia = materia;
    }

    public double calcularMedia() {
        return (getNota1() + getNota2() + getNota3()) / 3;
    }

    public void inserirnota() {
        int opcao = 0;
        int opcaoNOTAS = 0;
        do {
            System.out.printf("\nListas de Matérias na Escola do 1º ano do Ensino médio ");
            System.out.printf("\n 1 | Matemática");
            System.out.printf("\n 2 | Física");
            System.out.printf("\n 3 | Química");
            System.out.printf("\n 4 | Biologia");
            System.out.printf("\n 5 | História");
            System.out.printf("\n 6 | Geografia");
            System.out.printf("\n 7 | Língua Portuguesa");
            System.out.printf("\n 8 | Inglês // Espanhol");
            System.out.printf("\n 9 | Educação Física");
            System.out.printf("\n10 | Introdução à computação");
            System.out.printf("\n11 | Manutenção e Configurações de Computadores");
            System.out.printf("\n0 | Digite para sair");
            System.out.printf("\n Digite o código da matéria : ");
            opcaoNOTAS = sc.nextInt();


            if (opcaoNOTAS == 1) {
                setMateria("Matemática");
                System.out.printf("\n 1 | Matemática");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 2) {
                setMateria("Física");
                System.out.printf("\n 2 | Física");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 3) {
                System.out.printf("\n 3 | Química");
                setMateria("Química");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 4) {
                System.out.printf("\n 4 | Biologia");
                setMateria("Biologia");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 5) {
                setMateria("História");
                System.out.printf("\n 5 | História");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 6) {
                setMateria("Geografia");
                System.out.printf("\n 6 | Geografia");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 7) {
                setMateria("Língua Poruguesa");
                System.out.printf("\n 7 | Língua Portuguesa");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 8) {
                setMateria("História");
                System.out.printf("\n 8 | Inglês // Espanhol");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 9) {
                setMateria("Educação Física");
                System.out.printf("\n 9 | Educação Física");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("D\nigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 10) {
                setMateria("Introdução à computação");
                System.out.printf("\n10 | Introdução à computação");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            } else if (opcaoNOTAS == 11) {
                setMateria("Manutenção e Configurações de Computadores");
                System.out.printf("\n11 | Manutenção e Configurações de Computadores");
                System.out.printf("\nDigite a primeira nota do %s : ", getNome());
                setNota1(sc.nextDouble());

                System.out.printf("\nDigite a segunda nota do %s : ", getNome());
                setNota2(sc.nextDouble());

                System.out.printf("\nDigite a terceira nota do %s : ", getNome());
                setNota3(sc.nextDouble());
                break;
            }

            break;
        } while (opcaoNOTAS != 0);

    }

    public void verificarSituacao() {
        if (calcularMedia() >= 7) {
            System.out.printf("A média do %s  foi : %.2f \nVocê foi Aprovado na materia de %s!", getNome(), calcularMedia(), getMateria());
        } else {
            System.out.printf("A média do %s  foi : %.2f \nVocê foi Reprovado na materia de %s!", getNome(), calcularMedia(), getMateria());
        }
    }

    @Override
    public String toString() {
        return " \nNome do Aluno : " + nome +
                "\nIdade do Aluno : " + idade +
                "\n Nota 1 : " + nota1 +
                "\n Nota 2 : " + nota2 +
                "\n Nota 3 : " + nota3;

    }

    public int getidade() {
        return this.idade;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getNota3() {
        return this.nota3;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}


