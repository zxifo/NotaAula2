package AulasP2.NotaAula2.Questao1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Conta corrente = new Conta();
        Conta poupanca = new Conta();

        int menu;
        int menuCorrente = 1;
        int menuPoupanca = 1;

        do {
            System.out.println("\n-------------CHAIR BANK BANCO-------------");
            System.out.println("Digite seu nome: ");
            corrente.setTitular(sc1.nextLine());

            poupanca.setTitular(corrente.getTitular());
            System.out.println("Seja bem-vindo, " + corrente.getTitular() + "!");
            System.out.println("Digite [1] para acessar sua CONTA CORRENTE");
            System.out.println("Digite [2] para acessar sua CONTA POUPANÇA");
            System.out.println("Digite [0] para SAIR\n");
            System.out.print("Opção desejada: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    do {
                        System.out.println("\nBem-vindo, " + corrente.getTitular());
                        System.out.println("O saldo presente da sua conta corrente é de: R$" + corrente.getSaldo());
                        System.out.println("Que operação deseja realizar? ");
                        System.out.println("Digite [1] para DEPOSITAR");
                        System.out.println("Digite [2] para SACAR");
                        System.out.println("Digite [3] para USAR CHEQUE ESPECIAL");
                        System.out.println("Digite [4] para EXIBIR DADOS DA CONTA");
                        System.out.println("Digite [0] para SAIR");
                        System.out.println("Opção desejada: ");
                        menuCorrente = sc.nextInt();
                        switch (menuCorrente) {
                            case 1:
                                System.out.println("\nQuantidade a ser depositada: R$ ");
                                corrente.depositar(sc.nextDouble());
                                System.out.println("Valor depositado! \nSeu novo saldo da CONTA CORRENTE é: R$ " + corrente.getSaldo());
                                break;
                            case 2:
                                System.out.println("Quantidade a ser sacada: R$ ");
                                corrente.sacar(sc.nextDouble());
                                System.out.println("Valor sacado! \nSeu novo saldo da CONTA CORRENTE é: R$ " + corrente.getSaldo());
                                break;
                            case 3:
                                System.out.println("Quantidade a ser usada do Cheque Especial (máximo de R$ 1.000,00): R$ ");
                                corrente.chequeEspecial(sc.nextDouble());
                                System.out.println("Valor do cheque especial usado! \nO novo saldo do seu Cheque Especial é: R$ " + corrente.getChequeEspecial());
                                break;
                            case 4:
                                corrente.exibir();
                                break;
                            case 0:
                                System.out.println("Você escolheu SAIR. Até logo!");
                                break;
                        }
                    } while (menuCorrente != 0);
                    break;
                case 2:
                    do {
                        System.out.println("\n Bem-vindo, " + poupanca.getTitular());
                        System.out.println("O saldo presente da sua CONTA POUPANÇA é de : R$" + poupanca.getSaldo());
                        System.out.println("Que operação deseja realizar? ");
                        System.out.println("Digite [1] para DEPOSITAR");
                        System.out.println("Digite [2] para SACAR");
                        System.out.println("Digite [3] para CALCULAR RENDIMENTOS");
                        System.out.println("Digite [4] para EXIBIR DADOS DA CONTA");
                        System.out.println("Digite [0] para SAIR");
                        System.out.println("Opção desejada: ");
                        menuPoupanca = sc.nextInt();
                        switch (menuPoupanca) {
                            case 1:
                                System.out.println("Quantidade a ser depositada: R$ ");
                                poupanca.depositar(sc1.nextDouble());
                                System.out.println("Valor depositado! \nSeu novo saldo da CONTA POUPANÇA é: R$ " + poupanca.getSaldo());
                                break;
                            case 2:
                                System.out.println("Quantidade a ser sacada: R$ ");
                                poupanca.sacar(sc1.nextDouble());
                                System.out.println("Valor sacado! \nSeu novo saldo da CONTA POUPANÇA é: R$ " + poupanca.getSaldo());
                                break;
                            case 3:
                                System.out.println("Informe a taxa de juros (SELIC) atual: ");
                                poupanca.calcularRendimentos(sc1.nextDouble());
                                break;
                            case 4:
                                poupanca.exibir();
                                break;
                            case 0:
                                System.out.println("Você escolheu SAIR. Até logo!");
                                break;
                        }
                    } while (menuPoupanca != 0);
                    break;
            }
        } while (menu != 0);
    }
}

