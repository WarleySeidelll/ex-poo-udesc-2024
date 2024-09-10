package exercicio2oo;

public class Aluno {
    private String nome;
    private int idade;
    private double nota1,nota2,nota3;
    public void definirAluno(String nomealuno,int idadealuno,double n1,double n2,double n3) {
        this.nome = nomealuno;
        this.idade = idadealuno;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }
    public double mediaAluno(){
        return (nota1+nota2+nota3)/3;
    }
    public double verificarAluno(){
        double media = mediaAluno();

        if(media>=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }return media;
    }
    public void imprimirAluno(){
        System.out.println("seu nome:"+this.nome+"\nsua idade:"+this.idade);
        System.out.println("sua primeira nota:"+this.nota1);
        System.out.println("sua segunda nota:"+this.nota2);
        System.out.println("sua terceira nota:"+this.nota3);
        System.out.println("sua media:"+this.mediaAluno());
    }


}
