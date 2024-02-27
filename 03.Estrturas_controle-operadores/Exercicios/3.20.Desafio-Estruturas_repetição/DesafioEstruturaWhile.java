import java.util.Scanner;

public class DesafioEstruturaWhile {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		String numerosDigitados = "";
		double somaNumeros = 0.0;
		
		while (somaNumeros < 100) {
			
			System.out.print("Digite um número inteiro: ");
			double numeroDigitado = entrada.nextDouble();
			
			if (numeroDigitado % 1 != 0) {
				
				System.out.println("O número deve ser inteiro");
				continue;
			} 
				
			numerosDigitados += String.format("%.0f ", numeroDigitado);
				
			somaNumeros += numeroDigitado;
			
		}
		
		System.out.printf("Os numeros digitados foram: %s%n", numerosDigitados);
		System.out.println("A soma dos números digitados alcançou e/ ou ultrapassou o valor de 100.");
		System.out.printf("A soma destes números é: %.0f.%n", somaNumeros);
			
		entrada.close();
	}
}