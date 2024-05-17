public class TesteInicializacao {

    public static void main(String[] args) {

//        Instanciando um OBJETO DO TIPO "Carro"
        Carro meuCarro = new Carro();

//      ATRIBUINDO NOVOS VALORES aos atributos do OBJETO "meuCarro"
        meuCarro.fabricante = "Honda";
        meuCarro.anoFabricacao = 2021;
//        Sobreescrevendo ATRIBUTOS de OBJETOS COMPOSTOS
        meuCarro.proprietario.nome = "Maria";

//      Referênciando o OBJETO para mantê-lo na MEMÓRIA
        Pessoa proprietarioAntigo = meuCarro.proprietario;

//        Associando NOVO OBJETO a "meuCarro"
        meuCarro.proprietario = new Pessoa();

//      Imprimindo valores de ATRIBUTOS na saída padrão
        System.out.println(meuCarro.fabricante);
        System.out.println(meuCarro.modelo);
//      Acessando MÉTODO DE OBJETO COMPOST0 -> NULO/ NULL, num primeiro momento
        System.out.println(meuCarro.modelo.toLowerCase());
        System.out.println(meuCarro.anoFabricacao);
//      Acessando ATRIBUTO DE OBJETO COMPOST0 -> NULO/ NULL, num primeiro momento
        System.out.println(meuCarro.proprietario.nome);
    }
}