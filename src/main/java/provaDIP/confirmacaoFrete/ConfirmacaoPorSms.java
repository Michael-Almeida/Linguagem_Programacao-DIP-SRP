package provaDIP.confirmacaoFrete;

public class ConfirmacaoPorSms implements EnviarConfirmacao {

    //implementa o método de confirmação da interface
    public void confirmacao(Double valorProduto) {

        System.out.println(" ------- Enviando SMS ------- " + valorProduto);


    }
}


