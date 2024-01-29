import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do funcionário: ");
		String nome = entrada.nextLine();
		
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = entrada.nextInt();
		
		System.out.print("Valor por hora: ");
		double valorHora = entrada.nextDouble();
		
		double remuneracao = horasTrabalhadas * valorHora;
		
		System.out.print("Valor dos descontos: ");
		double valorDescontos = entrada.nextDouble();
				
		double totalDevido = remuneracao - valorDescontos;		
		
		System.out.println("\n---------- RESUMO --------");
		System.out.printf("%nFolha de pagamento: %s %n%d horas x R$%.2f = R$%.2f %nDescontos: R$%.2f %nTotal devido: R$%.2f%n"
			, nome, horasTrabalhadas, valorHora, remuneracao, valorDescontos, totalDevido);
	}
}
	