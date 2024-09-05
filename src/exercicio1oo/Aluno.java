package exercicio1oo;

public class Aluno {
    String nome;
    String situacao;
    int idade;
    double nota1;
    double nota2;
    double nota3;
    double media=0;

    public double getMedia() {
        nota2+=nota1;
        nota3+=nota2;
        return media = (nota3 / 3);
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public String getSituacao() {
        if(media>=7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
    public void setSituacao() {
        this.situacao = situacao;
    }
}
