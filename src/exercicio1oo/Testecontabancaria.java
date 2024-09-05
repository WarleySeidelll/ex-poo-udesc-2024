package exercicio1oo;

public class Testecontabancaria{
    public static void main(String[] args){
        Contabancaria conta1 = new Contabancaria();
        conta1.numero = "1";
        conta1.depositar(200);
        conta1.sacar(100);
        System.out.println("o numero da conta é:"+conta1.numero);
        System.out.println("saldo da conta é R$"+conta1.saldo);
    }
}