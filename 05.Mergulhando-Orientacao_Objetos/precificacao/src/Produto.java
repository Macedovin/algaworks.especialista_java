public class Produto {

    // -> Preco de custo NÃO é o mesmo que preço de compra
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
}
