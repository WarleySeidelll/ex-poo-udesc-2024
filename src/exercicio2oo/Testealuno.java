//Rafael e Warley e Pablo
package exercicio2oo;

public class Testealuno {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.setNome("Rafael");
        a1.setIdade(25);
        a1.setNota1(10);
        a1.setNota2(5);
        a1.setNota3(6);
        a1.calcularMedia();
        a1.verificarSituacao();
    }
}
