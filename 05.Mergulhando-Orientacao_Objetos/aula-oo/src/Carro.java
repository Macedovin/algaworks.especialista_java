public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
//    -> Nova VARIÁVEL DE INSTÂNCIA para ser utilizada no MÉTODO
    double precoCompra;
    Pessoa proprietario;

//    -> Método que IMPRIME resultados na SAÍDA PADRÃO
    void imprimirResumoDepreciacao() {

        double valorRevendaMeuCarro = calcularValorRevenda();

        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

//        -> Prints com os RESULTADOS do MÉTODO "calcularValorRevenda()"
        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }

//    Indo além... MÉTODO que IMPRIME o valor do IPVA
    void imprimirValorIpva() {

        double valorIpva = calcularIpva();

        System.out.printf("Valor do IPVA: %6.2f%n", valorIpva);
    }

//    -> Novo MÉTODO que calcula valor do IPVA
    double calcularIpva() {

        return calcularValorRevenda() * 0.04;
    }

//    -> Refatorando para evitar repetição de código
    int calcularTempoDeUsoEmAnos() {
        return 2024 - anoFabricacao;
    }

//    -> Cria o PRIMEIRO MÉTODO - Neste caso, MÉTODO  DE INSTÂNCIA
//    Refatora o MÉTODO definindo um TIPO de RETORNO
    double calcularValorRevenda() {

        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {

            valorRevenda = 0;
        }

//      -> Removidos do MÉTODO as linhas de print( )

//      -> Print simples para teste do MÉTODO
//        System.out.printf("Calcular valor de revenda de: %s %d%n", modelo, anoFabricacao);

//        INSTRUÇÃO DE RETORNO
        return valorRevenda;
    }
}
