import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

//      -> Acessa a clase Scanner para recebr NETRADAS SDO USUÁRIO
        Scanner entrada = new Scanner(System.in);

//      -> Recebendo novo FUNCIONÁRIO
        Funcionario joao = new Funcionario();

        joao.nome = "Joao da Silva";
        joao.quantidadeFilhos = 0;

//      -> Registrando novo CONTRATO DE TRABALHO
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

//        -> Define um OBJETO como valor de um ATRIBUTO
        contratoTrabalho.funcionario = joao;

        System.out.println("------------CONTRATO DE TRABALHO------------\n");

        System.out.printf("Funcionário: %s%n", contratoTrabalho.funcionario.nome);
        System.out.printf("Filhos: %d%n", contratoTrabalho.funcionario.quantidadeFilhos);

        System.out.println(); // -> Exibe linha em branco

//     -> REFATORANDO o recebimento do VALOR dos PARÂMETROS do método
        System.out.println("Digite o valor da hora normal: ");
//        double valorHoraNormaInserido = entrada.nextDouble();
        contratoTrabalho.valorHoraNormal = entrada.nextDouble();

        System.out.println("Digite o valor da hora extra: ");
//        double valorHoraExtraInserido = entrada.nextDouble();
        contratoTrabalho.valorHoraExtra = entrada.nextDouble();

        System.out.println(); // -> Exibe linha em branco

        System.out.println("----- HORAS TRABALHADAS ------");

        System.out.println(); // -> Exibe linha em branco

        System.out.println("Digite a quantidade de horas normais trabalhadas: ");
        int horasNormaisInseridas = entrada.nextInt();

        System.out.println("Digite a quantidade de horas extras trabalhadas: ");
        int horasExtrasInseridas = entrada.nextInt();

        System.out.println(); // -> Exibe linha em branco

        FolhaPagamento folhaPagamento = new FolhaPagamento();

//      -> REFATORANDO a CHAMADA do método - Para um novo RETORNO
        Holerite holerite = folhaPagamento.calcularSalario(horasNormaisInseridas, horasExtrasInseridas,
                contratoTrabalho);

//      -> IMPRIMIE RESULTADO na saída
/*
        System.out.println("-----------------------------------");
        System.out.printf("O valor do salário devido é de: R$ %6.2f%n", salarioDevido);
*/
        holerite.imprimir();

        entrada.close();
    }
}
