package provaDIP.calculosFrete;

public class CalculoFreteChina implements CalculoDeFretes {

    // implementa o Calculo de Fretes da interface
    public double calcularFrete(double valorOriginal) {

        if (valorOriginal > 50) {
            return valorOriginal + 100;
        } else {
            return valorOriginal + 30;

        }

    }
}
