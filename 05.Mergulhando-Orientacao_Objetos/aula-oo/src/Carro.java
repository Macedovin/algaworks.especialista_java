public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
//    -> Nova VARIÁVEL DE INSTÂNCIA para ser utilizada no MÉTODO
    double precoCompra;
    Pessoa proprietario;

//    -> Cria o PRIMEIRO MÉTODO - Neste caso, MÉTODO  DE INSTÂNCIA
    void calcularValorRevenda() {

        int tempoDeUsoEmAnos = 2024 - anoFabricacao;

        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {

            valorRevenda = 0;
        }

//        -> Prints com os RESULTADOS do MÉTODO
        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoEmAnos);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);

//      -> Print simples para teste do MÉTODO
//        System.out.printf("Calcular valor de revenda de: %s %d%n", modelo, anoFabricacao);
    }
}
