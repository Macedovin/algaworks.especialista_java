import java.util.Scanner;

public class DesafioEstruturaForIntermediarioNew {

	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
				
		System.out.print("Digite um número inteiro e positivo: ");		
		double numeroDigitado = entrada.nextDouble();
		
		int numeroDivisores = 0;
		
		for (double numeroAtual = 0.0; (numeroAtual <= numeroDigitado || numeroDigitado <= 0); numeroAtual++) {
			
			// = -1;
			//System.out.print("Digite um número inteiro e positivo: ");
			//numeroDigitado = entrada.nextDouble();
			//System.out.println("Linha 1 -> " + numeroAtual);
			
			if (numeroDigitado == 0 || numeroDigitado == 1) {
				
				System.out.println("--------------------------------------------------");
				System.out.printf("O número %.0f não é primo.%n", numeroDigitado);
				break;
			} else if (numeroDigitado == 2) {
				
				System.out.println("--------------------------------------------------");
				System.out.printf("O número %.0f é primo.%n", numeroDigitado);
				break;
			} else if (numeroDigitado < 0) {
				
				numeroAtual = -1.0;
				
				System.out.println("O número digitado deve ser positivo."); 
				
				System.out.print("Digite um número inteiro e positivo: ");
				numeroDigitado = entrada.nextDouble();
				continue;
			} else if (numeroDigitado % 1 != 0) {
			
				numeroAtual = -1.0;
			
				System.out.println("O número digitado deve ser inteiro.");
				
				System.out.print("Digite um número inteiro e positivo: ");
				numeroDigitado = entrada.nextDouble();
				continue;
			} else {
				
				//System.out.println("-> ELSE - Número é INTEIRO e POSITIVO.");
				//System.out.println("- Número de divisores é: " + numeroDivisores);
				
				double resto = numeroDigitado % numeroAtual;
				//System.out.printf("Número %.0f dividido por número %.0f é: %.0f%n", numeroDigitado, numeroAtual, resto); 
				
				if (resto == 0) {
					
					numeroDivisores++;
					//System.out.printf("Resto: %.0f%n", resto);
					//System.out.println("- Número de divisores é: " + numeroDivisores);					
					
					if (numeroDivisores > 2) {
							
						System.out.println("--------------------------------------------------");
						System.out.printf("O número %.0f não é primo.%n", numeroDigitado);
						break;
					} else if (resto < 2 && numeroDigitado == numeroAtual) { 
					
						System.out.println("--------------------------------------------------");
						System.out.printf("O número %.0f é primo.%n", numeroDigitado);
						
					}
				} 			

			}	
		}
		
		entrada.close();
	}
}