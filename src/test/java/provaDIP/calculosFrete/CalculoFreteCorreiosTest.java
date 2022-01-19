package provaDIP.calculosFrete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoFreteCorreiosTest {

    @Test
    void calculoFreteCorreiosAcrescendoValorDezReais(){

        //given dado que..

        CalculoFreteCorreios calculoFreteCorreios = new CalculoFreteCorreios();
        double valorOriginal = 50;

        //when quando..

        double resultado = calculoFreteCorreios.calcularFrete(valorOriginal);

        //then então..

        assertEquals(60,resultado);
    }
}