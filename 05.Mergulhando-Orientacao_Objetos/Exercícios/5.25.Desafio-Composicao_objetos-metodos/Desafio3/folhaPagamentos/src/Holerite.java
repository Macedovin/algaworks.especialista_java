public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalParaFilhos;

    double calcularValorTotal() {

        return valorTotalHorasNormais + valorTotalHorasExtras
                + valorAdicionalParaFilhos;
    }

    void imprimir() {

        System.out.println("--------------- HOLERITE ----------------\n");

        System.out.printf("Funcionario: %s%n", funcionario.nome);
        System.out.printf("Possui filhos: %b%n", funcionario.possuiFilhos());
        System.out.printf("Quantidade de filhos: %d%n", funcionario.quantidadeFilhos);

        System.out.println(); // LINHA EM BRANCO

        System.out.println("----------- VALORES DEVIDOS -------------\n");

        System.out.printf("Valor total de horas normais: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor total de horas extras: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor do adicional para filhos: %.2f%n", valorAdicionalParaFilhos);

        System.out.println("\n--------------------------------------------\n"); // LINHA EM BRANCO

        System.out.printf("SALARIO DEVIDO: %6.2f%n", calcularValorTotal());
    }
}
