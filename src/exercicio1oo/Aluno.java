package exercicio1oo;

public class Aluno {
    String nome;
    String situacao;
    int idade;
    double nota1;
    double nota2;
    double nota3;
    double media;


    public void CalcularMedia(double media) {
      media = nota1+nota2+nota3/3;
      System.out.printf("A média do %s ", nome ,  "foi : %f", media);
    }

    public void Situacao() {
        if(media>=7){
         System.out.printf("Aprovado");
        }else{
            System.out.printf("Reprovado");
        }
    }
    public void setSituacao() {
        this.situacao = situacao;
    }
    public void setMedia(double media) {

        this.media = media;
    }
}
