import java.util.Scanner;

public class CalculoIndiceMassaCorporalElse {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
	
		double imc = peso / (altura * altura);
	
		// if (imc < 18.5) {
		
		// 	System.out.println("Abaixo do peso ideal.");
		// } else {
		// 	
		// 	System.out.println("Não esta abaixo do peso.");
		// }
		
		// Segunda condição do IMC com ELSE...
		// if (imc < 18.5) {
		
		// 	 System.out.println("Abaixo do peso ideal.");
		// } else {
		// 	
		// 	 if (imc < 25) {
		//		
		//		System.out.println("Peso ideal.");
		//	} else {
		//		if (imc < 30) {
		//		
		//			System.out.println("Acima do peso.");
		//		}				
		//		
				// Continuaria aqui...
		//			
		//	}
		// }
		
		// Utilizando o ELSE IF
		if (imc < 18.5) {
			
			System.out.println("Abaixo do peso ideal.");
		} else if (imc < 25) {
			
			System.out.println("Peso ideal.");
		} else if (imc < 30) {
			
			System.out.println("Acima do peso.");
		} else if (imc < 35) {
		
			System.out.println("Obesidade grau I.");
		} else if (imc < 40) {			
		
			System.out.println("Obesidade grau II.");
		} else {                                      // Igual a condição >= 40
				
			System.out.println("Obesidade grau III.");
		}
			
		
		System.out.println("Fim do programa.");
		
	}
}