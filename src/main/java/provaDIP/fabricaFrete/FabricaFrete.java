package provaDIP.fabricaFrete;

import provaDIP.calculosFrete.CalculoDeFretes;
import provaDIP.calculosFrete.CalculoFreteChina;
import provaDIP.calculosFrete.CalculoFreteCorreios;
import provaDIP.calculosFrete.CalculoFreteFedex;

public class FabricaFrete {

    // Fabrica onde escolhe a opcao relacionada ao tipo de frete através do parâmetro "OPCAO"
    public static CalculoDeFretes tipoDeFrete(Long opcao) {

        //  chama o método adequadro de calculo conforme opção
        if (opcao == 1) {
            return new CalculoFreteCorreios();
        } else if (opcao == 2) {
            return new CalculoFreteFedex();
        } else if (opcao == 1000) {
            return new CalculoFreteChina();
        }
       throw new RuntimeException("Teste");
    }

}
