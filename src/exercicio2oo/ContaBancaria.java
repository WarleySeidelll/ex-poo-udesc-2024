package exercicio2oo;

public class ContaBancaria {
    private String numero;
    private double saldo;

    public void numero(String numeroconta,double saldoconta){
        this.numero= numeroconta;
        this.saldo = saldoconta;
    }
    public double depositar(double deposito){
        if(deposito>0){
            System.out.printf("\nVocê depositou %.2f R$", deposito);
            return this.saldo += deposito;
        }else{
            System.out.printf("\nNão é possível depositar esse valor!");
            return 0;
        }
    }
    public double saque(double sacar){
        if(sacar>0 && sacar<=getSaldo()){
            System.out.printf("\nVocê sacou %.2f R$",sacar);
            return this.saldo-=sacar;
        }else{
            System.out.printf("\nNão é possível sacar o valor, seu saldo disponível é de %.2f R$",getSaldo());
            return 0;
        }
    }
    public void imprimirInformacao(){
        System.out.printf("\nO numero da sua conta é %s",getNumero());
        System.out.printf("\nO saldo da sua conta é %.2f R$",getSaldo());
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
