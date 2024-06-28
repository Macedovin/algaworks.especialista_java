public class Produto {

    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;

//  -> Mudando o nome do PARÂMETRO
//    void alterarPrecoCusto(double novoPrecoCusto) {
    void alterarPrecoCusto(double precoCusto) {

        // Também mudo aqui...
//        precoCusto = precoCusto;
//        precoCusto = novoPrecoCusto;
        // -> Utilizo a PALAVRA-CHAVE "this"
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {

        // -> BOA PRÁTICA - Deixar explícito o acesso a VARIÁVEL ESTÁTICA
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem);
    }
}
