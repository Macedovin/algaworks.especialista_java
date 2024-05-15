public class TesteInicializacao {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();

//      ATRIBUINDO NOVOS VALORES aos atributos do OBJETO "meuCarro"
        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricacao = 2021;

//      Imprimindo valores de ATRIBUTOS na saída padrão
        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.anoFabricacao);
    }
}
