package provaDIP.calculosFrete;

import org.junit.jupiter.api.Test;
import provaDIP.CalculadoraDeFrete;

import static org.junit.jupiter.api.Assertions.*;

class CalculoFreteChinaTest {

    @Test
    void calcularFreteDaChinaQuandoValorForMaiorQueCinquentaDeveAcrescerCemReais() {

        //Given

        CalculoFreteChina calculoFreteChina = new CalculoFreteChina();
        double valorOriginal = 600;
        //When

        double resultado = calculoFreteChina.calcularFrete(valorOriginal);

        //Then

        assertEquals(700,resultado);
    }

    @Test
    void calcularFretedaChinaQuandoValorForMenorQueCinquentaDeveAcrescerTrintaReais(){

        //Given

        CalculoFreteChina calculoFreteChina = new CalculoFreteChina();
        double valorOriginal =10;

        //When

        double resultado = calculoFreteChina.calcularFrete(valorOriginal);

        //Then

        assertEquals(40,resultado);
    }
}