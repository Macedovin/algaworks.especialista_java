import java.util.Scanner;

public class IndiceMassaCorporal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// System.out.print("Nome: ");
		// String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		entrada.nextLine();
		
		// Solicitando o nome por último
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
	
		
		// Calcuando IMC
		double imc = peso / (altura * altura);
		
		// Imprimindo o resultado
		System.out.printf("IMC de %s: %.2f%n", nome, imc);
	}
}
		