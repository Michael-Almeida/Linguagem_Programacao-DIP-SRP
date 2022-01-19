package provaDIP;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import provaDIP.calculosFrete.CalculoDeFretes;
import provaDIP.confirmacaoFrete.EnviarConfirmacao;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeFreteTest {

    @Test
    void DeveRetornarOValorDoRetornoDeUmCalculoDeFrete() {

        //Given

        CalculadoraDeFrete calculadoraDeFrete = new CalculadoraDeFrete();

        //When

        CalculoDeFretes calculadoraMock = Mockito.mock(CalculoDeFretes.class);
        Mockito.when(calculadoraMock.calcularFrete(100d)).thenReturn(250d);

        List<EnviarConfirmacao> listaDeNotificacoes = new ArrayList<>();

        double resultado = calculadoraDeFrete.calcula(100d,calculadoraMock,listaDeNotificacoes);

        //Then

        Mockito.verify(calculadoraMock).calcularFrete(100d);
        assertEquals(250, resultado);

    }
}