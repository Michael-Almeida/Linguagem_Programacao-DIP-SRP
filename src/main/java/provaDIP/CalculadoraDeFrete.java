package provaDIP;

import provaDIP.confirmacaoFrete.EnviarConfirmacao;
import provaDIP.calculosFrete.CalculoDeFretes;

import java.util.List;

// Parte da calculadora que acessa a interface calculo de frete e a lista para envio de confirmação
public class CalculadoraDeFrete {

        /* CalculoDeFretes = interface Fretes
           EnviarConfirmacao = Lista da interface
         */
    public Double calcula(Double valorProduto, CalculoDeFretes calculoDeFretes, List<EnviarConfirmacao> listaEnvios) {

        /*
        valorProduto = parâmetro do calcula
        Calculuo de Fretes = interface
        Calcular Frete = método da interface
         */
        valorProduto = calculoDeFretes.calcularFrete(valorProduto);

        //Aqui dispararei todas as ações que existem na minha lista

        /*
        EnviarConfirmação = Interface EnviarConfirmação
        ListaEnvios = nome do parâmetro
        confirmação = método da interface
        valor do produto = parâmetro
         */
        for (EnviarConfirmacao envio : listaEnvios) {
            envio.confirmacao(valorProduto);
        }

        return valorProduto;
    }
}
