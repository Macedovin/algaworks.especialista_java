public class PrincipalForStatic {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

//        produto1.custoEmbalagem = 10;
//        produto2.custoEmbalagem = 15;

        // -> ACESSSANDO devidamente uma VARIÁVEL ESTÁTICA
        Produto.custoEmbalagem = 20;

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }
}
