//Rafael e Warley e Pablo
package exercicio2oo;

public class Testecontabancaria {
    public static void main(String[] args){
        Contabancaria cn1 = new Contabancaria();
        cn1.setNumero("321");
        cn1.setSaldo(1000.76);
        cn1.depositar(1000);
        cn1.saque(2000.44);
        cn1.imprimirInformacao();
    }
}
