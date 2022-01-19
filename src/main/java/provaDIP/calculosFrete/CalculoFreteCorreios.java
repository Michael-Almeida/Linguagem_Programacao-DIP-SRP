package provaDIP.calculosFrete;

public class CalculoFreteCorreios implements CalculoDeFretes {

    // implementa o Calculo de Fretes da interface
    public double calcularFrete(double valorOriginal) {

        return valorOriginal + 10;
    }
}
