package exercicios3oo;

public class Livro {
    private String nome;
    private String autor;
    private boolean emprestado;

    public Livro() {
        this.nome="";
        this.autor="";
    }
    public Livro(String nome, String autor) {
        this();
        this.nome = nome;
        this.autor = autor;
        this.emprestado = false;
    }
    public void alugar() {
        if (getEmprestado()) {
            System.out.printf("\nO livro  %s está emprestado !", getNome());
        } else {
            emprestado = true;
            System.out.printf("\nO livro  %s foi alugado com sucesso.", getNome());
        }
    }
    public void devolver() {
        if (!getEmprestado()) {
            System.out.printf("\nO livro  %s não está emprestado! ", getNome());
        } else {
            emprestado = false;
            System.out.printf("\nO livro  %s foi devolvido com sucesso.", getNome());
        }
    }
    public void exibirDisponibilidade() {
        if (getEmprestado()==false) {
            System.out.println("\n Nome: " + getNome() + " | Autor: " + getAutor() + "| Disponível");
        } else if(getEmprestado()==true) {
            System.out.println("\n Nome: " + getNome() + " | Autor: " + getAutor()  + "| Não disponível");
        }
    }
    @Override
    public String toString() {
    return "Nome : " + nome + "\n" +
            "Autor : " + autor;

    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean getEmprestado() {
        return this.emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}

