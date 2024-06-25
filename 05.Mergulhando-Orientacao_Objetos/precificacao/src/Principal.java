public class Principal {

    public static void main(String[] args) {

//        double precoCompraFornecedor = 140;
//        -> INSTANCIO um Produto
        Produto produto = new Produto();
        produto.precoCompra = 100;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
//        servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);
//        -> REFATORO a chamada do métooo
        servicoDePrecificacao.definirPrecoVenda(produto, 20);
//      -> AQUI o método REGISTRA EM MEMÓRIA o RETORNO do métod chamado
//       double precoVenda = servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);

//        -> Referencio VARIÁVEL DE INSTÂNCIA de "produto"
        System.out.printf("Preço: %.2f%n", produto.precoVenda);
//        System.out.printf("Preço: %.2f%n", precoCompraFornecedor);
//    -> Não referencio mais a VARIÁVEL LOCAL
//        System.out.printf("Preço: %.2f%n", precoVenda);
    }
}
