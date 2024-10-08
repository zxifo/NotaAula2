package AulasP2.NotaAula2.Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Corrida c = new Corrida();

        System.out.println("Programa de Cálculo de Corridas");
        System.out.println("Informe a distância da corrida (Km): ");
        c.setDistancia(sc.nextDouble());
        System.out.println("Informe o tempo de espera (Minutos): ");
        c.setTempoEspera(sc.nextInt());
        System.out.println("Informe a tarifa base: R$");
        c.setTarifaBase(sc.nextDouble());
        System.out.print("Informe o fator de demanda (1,0 = normal / 1,5 = pico): ");
        c.setFatorDemanda(sc.nextDouble());

        c.exibirDetalhes();
    }
}