public class ServicoDePrecificacao {

    // -> O MÉTODO agora rcebe um OBEJTO como PARÂMETRO
    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        // Poderia ter cálculos muito mais complexos aqui

        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
    }
    /*
//  -> REFATORANDO para que o método tenha RETORNO
//    double calcularPrecoVenda(double precoCusto) {
    void calcularPrecoVenda(double precoCusto) {

        // Adiciona 20% de margem de lucro
        // return precoCusto = precoCusto * 1.20;
        precoCusto = precoCusto * 1.20;

        // Faz várias outras coisas
    }*/
}
