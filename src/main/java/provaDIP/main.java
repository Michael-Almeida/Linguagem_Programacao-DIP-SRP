package provaDIP;

import provaDIP.calculosFrete.CalculoDeFretes;
import provaDIP.confirmacaoFrete.ConfirmacaoPorEmail;
import provaDIP.confirmacaoFrete.ConfirmacaoPorSms;
import provaDIP.confirmacaoFrete.EnviarConfirmacao;
import provaDIP.fabricaFrete.FabricaFrete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Cria a interação do usuário e salva em uma variável.
        System.out.println("Escolha o tipo de frete: \n 1 - CORREIOS \n 2 - FEDEX \n 3 - TERCEIRIZADO \n 1000 - CHINA");
        Long opcao = teclado.nextLong();

        //chama a interface do método que escolhe o tipo de frete através da opcao armazenada a cima
        CalculoDeFretes calculoFabricado = FabricaFrete.tipoDeFrete(opcao);

        //chama a calculadora de Frete e instancia ela
        CalculadoraDeFrete novaCalculadoraDeFrete = new CalculadoraDeFrete();

        //cria a interação do usuário e salva na variável
       System.out.println("Digite o valor do produto");
       Double valorProduto = teclado.nextDouble();

       /*
       Chama o EnviarConfirmacao intanciando o mesmo em um arrayList
       adiciona o tipo de confirmação de envio
        */
        List<EnviarConfirmacao> listaDeNotificacoes = new ArrayList<>();
        listaDeNotificacoes.add(new ConfirmacaoPorEmail());
        listaDeNotificacoes.add(new ConfirmacaoPorSms());

        /*
        Nova Calculadora = calculadora instanciada na linha 27
        .calcula = método da Calculadora de Frete
        calculoFabricado = nome da variável da linha 24 que acessa uma fábrica que escolhe um tipo de frete pela opção
         */
        novaCalculadoraDeFrete.calcula(valorProduto, calculoFabricado,listaDeNotificacoes);
    }

}
