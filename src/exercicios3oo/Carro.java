package exercicios3oo;

public class Carro {
    private String modelo;
    private int ano;
    private double velocidade;
    private boolean carro = false;


    public Carro() {
        this.modelo = "";
        this.velocidade = 0;
    }


    public Carro(String modelo, double velocidade, int ano, boolean carro) {
        this();
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.ano = ano;
        this.carro = carro;

    }

    public void ligarCarro() {
        if (getCarro() == false) {
            carro = true;
            System.out.printf("\nO carro está ligando...");
        } else if (getCarro() == true) {
            System.out.printf("\nO carro já está ligado!!");
        }
    }

    public void desligarCarro() {
        if (getCarro() == true) {
            carro = false;
            System.out.printf("\nO carro está desligando...");
        } else if (getCarro() == false) {
            System.out.printf("\nO carro já está desligado!");
        }
    }

    public void acelerar() {
        if (getCarro() == true) {
            velocidade += 10;
            System.out.printf("\nAcelerando...");
        } else if (getCarro() == false) {
            System.out.printf("\nO carro está desligado... \n Ligue o Carro!");
        }
    }

    public void freiar() {
        if (getCarro() == true && getvelocidade() >= 10) {
            velocidade -= 10;
            System.out.printf("\nFreando...");
        } else if (getCarro() == false) {
            System.out.printf("\nO carro está desligado... \n Ligue o Carro! ");
        } else if (getvelocidade() <= 0) {
            System.out.printf("\nO carro já está parado!");
        }

    }

    public void exibirvelocidadeAtual() {
        System.out.printf("\nSua velocidade atual é %.0f Km/h", getvelocidade());
    }

    @Override
    public String toString() {
        return "Modelo=" + getModelo() + " \n" +
                "Ano : " + getAno() + "\n" +
                "Velocidade=" + getvelocidade() + "Km/h";

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getvelocidade() {
        return velocidade;
    }

    public void setvelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean getCarro() {
        return carro;
    }

    public void setCarro(boolean carro) {
        this.carro = carro;
    }
}

