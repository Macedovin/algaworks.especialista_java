public class Principal {

    public static void main(String[] args) {

//      -> Definido CUSTO DE EMBALAGEM para este ESCOPO
        Produto.custoEmbalagem = 10;

//        -> INSTANCIO um Produto
        Produto novoProduto = new Produto();
        novoProduto.alterarPrecoCusto(80);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
//        -> REFATORO a chamada do métooo
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

//      -> Exibindo também na saída o VALOR "precoCusto"
        System.out.printf("Preço: %.2f%n", novoProduto.precoCusto);
//        -> Referencio VARIÁVEL DE INSTÂNCIA de "produto"
        System.out.printf("Preço: %.2f%n", novoProduto.precoVenda);
    }
}
