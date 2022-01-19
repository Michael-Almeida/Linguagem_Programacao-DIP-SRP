package provaDIP.calculosFrete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoFreteFedexTest {

    @Test
    void calcularFreteFedexAcrescendoVinteReais() {

        //Given
        CalculoFreteFedex calculoFreteFedex = new CalculoFreteFedex();
        double valorOriginal = 50;

        //When

        double resultado = calculoFreteFedex.calcularFrete(valorOriginal);

        //Then

        assertEquals(70, resultado);

    }
}