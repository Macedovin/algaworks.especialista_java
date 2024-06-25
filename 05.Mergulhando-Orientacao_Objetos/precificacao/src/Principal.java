public class Principal {

    public static void main(String[] args) {

        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);
//      -> AQUI o método REGISTRA EM MEMÓRIA o RETORNO do métod chamado
//       double precoVenda = servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);

        System.out.printf("Preço: %.2f%n", precoCompraFornecedor);
//    -> Não referencio mais a VARIÁVEL LOCAL
//        System.out.printf("Preço: %.2f%n", precoVenda);
    }
}
