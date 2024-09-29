package exercicio2oo;

public class TesteContaBancaria {
    public static void main (String [] args){
        ContaBancaria cn1 = new ContaBancaria();
        cn1.setNumero("321");
        cn1.setSaldo(100);
        cn1.depositar(20);
        cn1.saque(20);
        cn1.imprimirInformacao();
    }
    }

