package exercicio2oo;
//Rafael e Warley e Pablo

public class Aluno {
        private String nome;
        private int idade;
        private double nota1,nota2,nota3;

        public  double calcularMedia(){
            return (getNota1()+getNota2()+getNota3())/3;
        }
        public void verificarSituacao(){

            if(calcularMedia()>=7){
                System.out.printf("A média do %s  foi : %.2f \nVocê foi Aprovado!" , nome, calcularMedia());
            }else{
                System.out.printf("A média do %s  foi : %.2f \nVocê foi Reprovado!", nome, calcularMedia());
            }
        }

        public int getidade(){
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

    }

