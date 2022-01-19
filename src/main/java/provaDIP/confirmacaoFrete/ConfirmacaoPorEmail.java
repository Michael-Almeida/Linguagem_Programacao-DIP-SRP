package provaDIP.confirmacaoFrete;

public class ConfirmacaoPorEmail implements EnviarConfirmacao {

    //implementa o método de confirmação da interface
    public void confirmacao(Double valorProduto) {

        System.out.println(" ------- Enviando E-mail ------- " + valorProduto);


    }

}
