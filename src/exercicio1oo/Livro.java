package exercicio1oo;

public class Livro {
    String titulo;
    boolean emprestado;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.emprestado = false;
    }
    public void emprestar() {
        if (emprestado) {
            System.out.println("O livro"+titulo+"já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("O livro"+titulo+"foi emprestado com sucesso.");
        }
    }
    public void devolver() {
        if (!emprestado) {
            System.out.println("O livro "+titulo+" não está emprestado.");
        } else {
            emprestado = false;
            System.out.println("O livro "+titulo+" foi devolvido com sucesso.");
        }
    }
    public boolean estaEmprestado() {
        return emprestado;
    }
}