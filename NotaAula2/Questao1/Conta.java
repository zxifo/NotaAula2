package AulasP2.NotaAula2.Questao1;

import java.util.Scanner;

public class Conta {
    private String titular;
    private double saldo = 0;
    private double chequeEspecial = 0;
    private double rendimento;

    Scanner sc = new Scanner(System.in);

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        while (valor > saldo) {
            System.out.println("Saldo Insuficiente. O seu saldo é de R$ " + saldo + "\nTente novamente.");
            System.out.println("Quantidade a ser sacada: R$ ");
            valor = sc.nextDouble();
        }
        saldo -= valor;
    }

    public void chequeEspecial(double valor) {
        if (valor > 1000) {
            System.out.println("Valor inválido. O limite do seu cheque especial é de R$ 1.000,00. Tente novamente.");
            System.out.println("\nQuantidade a ser usada do Cheque Especial (máximo de R$ 1.000,00): R$ ");
            valor = sc.nextDouble();
        }
        chequeEspecial += valor;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void calcularRendimentos(double taxa) {
        if (taxa > 8.5) {
            rendimento = 0.005 * saldo;
        }
        else {
            rendimento = 0.007 * taxa * saldo;
        }
        System.out.println("O rendimento da sua Conta Poupança é de R$" + rendimento);
    }

    public void exibir() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        if (chequeEspecial != 0) {
            System.out.println("Cheque Especial: " + chequeEspecial);
        } else if (chequeEspecial == 0) {
            System.out.println("Cheque Especial esgotado.");

        }
    }
}
