package exercicios3oo;

import java.util.Scanner;

public class Aluno {

    Scanner sc = new Scanner(System.in);

    private String nome, materia;
    private int idade;
    private double nota1, nota2, nota3;

    public Aluno() {
        this.nome = "";
        this.materia = "";
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

    public void verificarNotas() {
        if (getNota1() < 0 || getNota1() > 10 || getNota2() < 0 || getNota2() > 10 || getNota3() < 0 || getNota3() > 10) {
            System.out.printf("\nInsira uma nota de 0 a 10!");
            System.exit(0);
        }
    }

    public double calcularMedia() {

        return (getNota1() + getNota2() + getNota3()) / 3;
    }

    public void verificarSituacao() {
        if (calcularMedia() >= 6) {
            System.out.printf("A média do %s  foi : %.2f \nVocê foi Aprovado na materia de %s!", getNome(), calcularMedia(), getMateria());
        } else {
            System.out.printf("A média do %s  foi : %.2f \nVocê foi Reprovado na materia de %s!", getNome(), calcularMedia(), getMateria());
        }
    }

    @Override
    public String toString() {
        return " \nNome do Aluno : " + nome +
                "\nIdade do Aluno : " + idade +
                "\n Materia do Aluno : " + materia +
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


