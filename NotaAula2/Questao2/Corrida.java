package AulasP2.NotaAula2.Questao2;

public class Corrida {
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public double calcularValor() {
        return (this.distancia * 2) + (this.tempoEspera * 0.5) + (this.tarifaBase * this.fatorDemanda);
    }

    public void exibirDetalhes(){
        System.out.println("Distancia da Corrida: " + this.distancia);
        System.out.println("Tempo de Espera: " + this.tempoEspera);
        System.out.println("Tarifa Base: " + this.tarifaBase);
        System.out.println("Fator de Demanda: " + this.fatorDemanda);
        System.out.println("Valor da Corrida: " + calcularValor());
    }
}