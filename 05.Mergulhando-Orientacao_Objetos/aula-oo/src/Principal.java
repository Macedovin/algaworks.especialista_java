public class Principal {

    public static void main(String[] args) {

//      Instanciando NOVOS OBJETOS do tipo "Pessoa"

        Pessoa eu = new Pessoa();

        eu.nome = "Vinicius Macedo";
        eu.cpf = "114.115.117-34";
        eu.anoNascimento = 1986;

        Pessoa voce = new Pessoa();

        voce.nome = "João das Couves";
        voce.cpf = "999.999.999-99";
        voce.anoNascimento = 1992;

        Carro meuCarro = new Carro();

//        Definindo ATRIBUTOS do OBEJTO "meuCarro"

        meuCarro.anoFabricacao = 2023;
        meuCarro.cor = "preto";
        meuCarro.modelo = "HR-V";
        meuCarro.fabricante = "Honda";
//        -> Atribui valor a nova VARIÁVEL DE INSTÂNCIA
        meuCarro.precoCompra = 120000;
        meuCarro.proprietario = eu;

//	    Instanciando e atribuindo NOVO OBJETO "Pessoa" diretamente a OUTRO OBJETO "meuCarro"

/*
        meuCarro.proprietario = new Pessoa();
        meuCarro.proprietario.nome = "Vinicius Macedo";
        meuCarro.proprietario.cpf = "114.115.117-34";
        meuCarro.proprietario.anoNascimento = 1986;
*/

        Carro seuCarro = new Carro();

//        Definindo ATRIBUTOS do OBEJTO "seuCarro"

        seuCarro.anoFabricacao = 2021;
        seuCarro.cor = "Branco";
        seuCarro.modelo = "X6";
        seuCarro.fabricante = "BMW";
//        -> Atribui valor a nova VARIÁVEL DE INSTÂNCIA
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

//        ->Refatoração para utilizar o RETORNO do MÉTODO
//        System.out.println(meuCarro.calcularValorRevenda());

//        ATRIBUINDO o VALOR do RETORNO a uma VARIÁVEL e imprimindo
        double valorRevendaMeuCarro = meuCarro.calcularValorRevenda();
//        System.out.println(valorRevendaMeuCarro);

//        Refatoração que utiliza o RETORNO do MÉTODO, bem como REUTILIZA OS prints anteriormente nele
//        -> Prints com os RESULTADOS do MÉTODO "calcularVAlorRevenda()"
        System.out.printf("Tempo de uso (anos): %d%n", 2024 - meuCarro.anoFabricacao);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);


//        -> Chamando/ Invocando o MÉTODO
//        meuCarro.calcularValorRevenda();
//        seuCarro.calcularValorRevenda();

//        Imprimindo conteúdos na saída padrão
//
//        System.out.println("Meu carro");
//        System.out.println("------------------------");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
//
//        System.out.println(); //-> Linha em branco/ QUEBRA DE LINHA
//
//        System.out.println("Seu carro");
//        System.out.println("------------------------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }
}
