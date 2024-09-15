//Rafael e Warley e Pablo

package exercicio2oo;

public class Livro {
    private String nome;
    private String autor;
    private boolean emprestado;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.emprestado = false;
    }

    public void alugar() {
        emprestado = true;
        System.out.println("O livro " + getNome() + " foi alugado com sucesso.");

    }
    public void devolver() {
        emprestado =false;
        System.out.println("O livro " + getNome()  + " foi devolvido com sucesso.");

    }
    public void exibirDisponibilidade() {
        if (getEmprestado()==false) {
            System.out.println("Nome: " + getNome() + " | Autor: " + getAutor() + "| Disponível");
        } else if(getEmprestado()==true) {
            System.out.println("Nome: " + getNome() + " | Autor: " + getAutor()  + "| Não disponível");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean getEmprestado() {
        return emprestado;
}
}