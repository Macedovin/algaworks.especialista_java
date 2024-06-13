import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

//      -> Acessa a clase Scanner para recebr NETRADAS SDO USUÁRIO
        Scanner entrada = new Scanner(System.in);

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        System.out.println("Digite a quantidade de horas normais trabalhadas: ");
        int horasNormaisInseridas = entrada.nextInt();

        System.out.println("Digite a quantidade de horas extras trabalhadas: ");
        int horasExtrasInseridas = entrada.nextInt();

        System.out.println("Digite o valor da hora normal: ");
        double valorHoraNormaInserido = entrada.nextDouble();

        System.out.println("Digite o valor da hora extra: ");
        double valorHoraExtraInserido = entrada.nextDouble();

        double salarioDevido = folhaPagamento.calcularSalario(horasNormaisInseridas, horasExtrasInseridas,
                valorHoraNormaInserido, valorHoraExtraInserido);

//      -> IMPRIMIE RESULTADO na saída
        System.out.println("-----------------------------------");
        System.out.printf("O valor do salário devido é de: R$%6.2f%n", salarioDevido);

        entrada.close();
    }
}
