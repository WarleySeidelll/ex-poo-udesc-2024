//Rafael e Warley e Pablo
package exercicio2oo;

public class Contabancaria {
    private String numero;
    private double saldo;
    private double depositar;
    private double saque;
    public void setNumero(String numeroconta,double saldoconta){
        this.numero= numeroconta;
        this.saldo = saldoconta;
    }
    public double getDepositar(double deposito){
        return saldo += deposito;
    }
    public double getSaque(double sacar){
        return saldo -= sacar;
    }
    public void getImprimir(){
        System.out.println("o numero da sua conta é:"+numero);
        System.out.println("o saldo da sua conta é:"+saldo);
    }


}
