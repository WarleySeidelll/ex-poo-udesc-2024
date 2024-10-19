package exercicios3oo;

import java.util.Scanner;

public class ContaBancaria {
  Scanner entrada = new Scanner(System.in);
    private String agencia;
    private String titular;
    private int numeroConta;
    private double saldo;
    private boolean bancoValido = false;

    public ContaBancaria() {
        agencia = "";
        titular = "";
    }

    public ContaBancaria(String agencia, String titular, int numeroConta, double saldo) {
        this.agencia = agencia;
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void verificarBanco() {
        do {
        System.out.printf("\nDigite o código do banco: ");
        String codigoBanco = entrada.nextLine();

            if (codigoBanco.equals("001")) {
                System.out.println("Banco válido: Banco do Brasil.");
                setAgencia("Banco do Brasil");
                bancoValido = true;
            }   else if (codigoBanco.equals("033")) {
                System.out.println("Banco válido: Santander.");
                setAgencia(" Banco Santander");
                bancoValido = true;
            } else if (codigoBanco.equals("104")) {
                System.out.println("Banco válido: Caixa Econômica.");
                setAgencia(" Banco Caixa Econômica");
                bancoValido = true;
            } else if (codigoBanco.equals("237")) {
                System.out.println("Banco válido: Bradesco.");
                setAgencia(" Banco Bradesco");
                bancoValido = true;
            } else if (codigoBanco.equals("341")) {
                System.out.println("Banco válido: Itaú.");
                setAgencia("Banco Itaú");
                bancoValido = true;
            } else if (codigoBanco.equals("356")) {
                System.out.println("Banco válido: Banco Real.");
                setAgencia("Banco Real");
                bancoValido = true;
            } else if (codigoBanco.equals("389")) {
                System.out.println("Banco válido: Banco Inter.");
                setAgencia("Banco Inter");
                bancoValido = true;
            } else if (codigoBanco.equals("399")) {
                System.out.println("Banco válido: NuBank.");
                setAgencia("Banco NuBank");
                bancoValido = true;
            } else {
                System.out.println("Banco inválido.");
            }

        } while (!bancoValido);
    }

    public double depositar(double deposito) {
        if (deposito > 0) {
            System.out.printf("\n");
            System.out.printf("\nVocê depositou %.2f R$", deposito);
            return this.saldo += deposito;
        } else {
            System.out.printf("\n");
            System.out.printf("\nNão é possível depositar esse valor!");
            return 0;
        }
    }

    public void  saldoDisponivel() {
        System.out.printf("\n");
        System.out.printf("O seu saldo é de R$ %.2f\n", getSaldo());
    }

    public double sacar(double sacar) {
        if (sacar > 0 && sacar <= getSaldo()) {
            System.out.printf("\n");
            System.out.printf("\nVocê sacou %.2f R$", sacar);
            return this.saldo -= sacar;
        } else {
            System.out.printf("\n");
            System.out.printf("\nNão é possível sacar o valor, seu saldo disponível é de %.2f R$", getSaldo());
            return 0;
        }
    }

    @Override
    public String toString(){
        return  "\nAgencia | " + agencia + "\n" +
                "Titutar | " + titular + "\n" +
                "Numero Conta | " + numeroConta + "\n" +
                "Saldo | " + saldo + "\n";

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}

