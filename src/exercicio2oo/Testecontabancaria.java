//Rafael e Warley e Pablo
package exercicio2oo;

public class Testecontabancaria {
    public static void main(String[] args){
        Contabancaria cn1 = new Contabancaria();
        cn1.setNumero("1",10);
        cn1.getDepositar(20);
        cn1.getSaque(30);
        cn1.getImprimir();
    }
}
