public class ServicoDePrecificacao {

    // -> O MÉTODO agora também recebe um OBJETO como PARÂMETRO
    // - ANTES, somente um tipo primitivo
    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        // Poderia ter cálculos muito mais complexos aqui

        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
        // -> Fazendo uso da VARIÁVEL ESTÁTICA
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
