public class Principal {

    public static void main(String[] args) {

//        double precoCompraFornecedor = 140;
//        -> INSTANCIO um Produto
        Produto novoProduto = new Produto();
//        novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(80);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
//        servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);
//        -> REFATORO a chamada do métooo
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);
//      -> AQUI o método REGISTRA EM MEMÓRIA o RETORNO do métod chamado
//       double precoVenda = servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);

//      -> Exibindo também na saída o VALOR "precoCusto"
        System.out.printf("Preço: %.2f%n", novoProduto.precoCusto);
//        -> Referencio VARIÁVEL DE INSTÂNCIA de "produto"
        System.out.printf("Preço: %.2f%n", novoProduto.precoVenda);
//        System.out.printf("Preço: %.2f%n", precoCompraFornecedor);
//    -> Não referencio mais a VARIÁVEL LOCAL
//        System.out.printf("Preço: %.2f%n", precoVenda);
    }
}
