public class TesteInicializacao {

    public static void main(String[] args) {

//        Instanciando um OBJETO DO TIPO "Pessoa"
        Pessoa pessoa1 = new Pessoa();

//      ATRIBUINDO NOVOS VALORES aos atributos do OBJETO "meuCarro"
        pessoa1.nome = "João";

//        Instanciando um NOVO OBJETO DO TIPO "Pessoa"
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";

//        Instanciando um OBJETO DO TIPO "Carro"
        Carro meuCarro = new Carro();

//      ATRIBUINDO NOVOS VALORES aos atributos do OBJETO "meuCarro"
        meuCarro.modelo = "H-RV";
//        ATRIBUINDO OBJETO "pessoa1" como valor da VARIÁVEL DE INSTÂNCIA "proprietario" de "meuCarro"
        meuCarro.proprietario = pessoa1;

//        Instanciando um NOVO OBJETO DO TIPO "Carro"
        Carro seuCarro = new Carro();
        seuCarro.modelo = "X6";
        seuCarro.proprietario = pessoa1;

//     -> ALTERANDO o ATRIBUTO "nome" do MEMBRO "proprietario" da REFERENCIA "meuCarro"
//            ->  Qual vai ser o "nome" na REFERENCIA "seuCarro"?
        meuCarro.proprietario.nome = "Sebastião";

//      IMPRIMINDO valores na saída
        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);

//    Alterando valor da VARIÁVEL DE INSTÂNCIA "nome" de "proprietario" de "meuCarro"
//        meuCarro.proprietario.nome = "Maria";

//    Imprimindo na saída a VARIÁVEL DE INSTÂNCIA "nome" de "pessoa1
//      -> O que vai ser impresso?
//        System.out.println(pessoa1.nome);

//    INVERTENDO A LÓGICA ANTERIOR
//        pessoa1.nome ="Maria";
//        System.out.println(meuCarro.proprietario.nome);
    }
}
