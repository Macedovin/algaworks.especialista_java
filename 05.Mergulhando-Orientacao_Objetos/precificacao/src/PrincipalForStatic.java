public class PrincipalForStatic {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        // -> ACESSSANDO devidamente uma VARIÁVEL ESTÁTICA
        // Produto.custoEmbalagem = 20;

        // -> Nova forma de ALTERAR a VAIÁVEL ESTÁTICA - CUIDADO!
        produto1.alterarCustoEmbalagem(12);
        produto2.alterarCustoEmbalagem(20);

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }
}
