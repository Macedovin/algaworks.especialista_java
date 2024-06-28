public class Produto {

    // -> Separa VARIÁVEIS ESTÁTICAS da DE INSTÂNCIA
    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    void alterarCustoEmbalagem(double custoEmbalagem) {

        // -> Abaixo, estaria referenciando como VARIÁVEL DE INSTÂNCIA uma DE CLASSE
        //  this.custoEmbalagem = custoEmbalagem;

        Produto.custoEmbalagem = custoEmbalagem;  // Referencia correta
    }

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
