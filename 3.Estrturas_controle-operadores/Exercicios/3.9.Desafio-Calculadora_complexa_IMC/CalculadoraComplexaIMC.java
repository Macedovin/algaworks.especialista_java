import java.util.Scanner;

public class CalculadoraComplexaIMC {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Sexo (\"M\" - Masculino; \"F\" - feminino): ");
		String sexo = entrada.nextLine();
		
		boolean sexoMasculino = sexo.equalsIgnoreCase("M");
		boolean sexoFeminino = sexo.equalsIgnoreCase("F");
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		/*
		if ((imc < 19.1 && sexoFeminino) || (imc < 20.7 && sexoMasculino)) {
			
			if (sexoFeminino) {
				
				System.out.printf("Srta. %s, com IMC %.2f, esta abaixo do peso.%n", nome, imc);
			} else {
			
				System.out.printf("Sr. %s, com IMC %.2f, esta abaixo do peso.%n", nome, imc);	
			}
	
		} else if ((imc < 25.8 && sexoFeminino) || (imc < 26.4 && sexoMasculino)) {
			
			if (sexoFeminino) {
			
				System.out.printf("Srta. %s, com IMC %.2f, esta com peso ideal.%n", nome, imc);
			} else {
			
				System.out.printf("Sr. %s, com IMC %.2f, esta com peso ideal.%n", nome, imc);
			}
		} else if ((imc < 27.3 && sexoFeminino) || (imc < 27.8 && sexoMasculino)) {
			
			if (sexoFeminino) {
			
				System.out.printf("Srta. %s, com IMC %.2f, esta um pouco acima do peso.%n", nome, imc);
			} else {
			
				System.out.printf("Sr. %s, com IMC %.2f, esta um pouco acima do peso.%n", nome, imc);
			} 
		} else if ((imc < 32.3 && sexoFeminino) || (imc < 31.1 && sexoMasculino)) {
			
			if (sexoFeminino) {
			
				System.out.printf("Srta. %s, com IMC %.2f, esta acima do peso ideal.%n", nome, imc);
			} else {
			
				System.out.printf("Sr. %s, com IMC %.2f, esta acima do peso ideal.%n", nome, imc);
			} 
		} else if ((imc > 32.3 && sexoFeminino) || (imc > 31.1 && sexoMasculino)) {
			
			if (sexoFeminino) {
			
				System.out.printf("Srta. %s, com IMC %.2f, esta com obesidade.%n", nome, imc);
			} else {
			
				System.out.printf("Sr. %s, com IMC %.2f, esta com obesidade.%n", nome, imc);
			} 
		} else {
			
			System.out.println("Não foi possível realizar a verificação."); 
		}
		*/
		
		// REFATORANDO...
		
		if (sexoFeminino) {
			if (imc < 19.1) {
			
				System.out.printf("Srta. %s, com IMC %.2f, esta abaixo do peso.%n", nome, imc);
			} else if (imc < 25.8) {
				
				System.out.printf("Srta. %s, com IMC %.2f, esta com o peso ideal.%n", nome, imc);
			} else if (imc < 27.3) {
				
				System.out.printf("Srta. %s, com IMC %.2f, esta um pouco acima do peso.%n", nome, imc);
			} else if (imc < 32.3) {
				
				System.out.printf("Srta. %s, com IMC %.2f, esta acima do peso.%n", nome, imc);
			} else {
				
				System.out.printf("Srta. %s, com IMC %.2f, esta com obesidade.%n", nome, imc);
			}
		} else if (sexoMasculino) {
			if (imc < 20.7) {
				
				System.out.printf("Sr. %s, com IMC %.2f, esta abaixo do peso.%n", nome, imc);
			} else if (imc < 26.4) {
				
				System.out.printf("Sr. %s, com IMC %.2f, esta com o peso ideal.%n", nome, imc);
			} else if (imc < 27.3) {
				
				System.out.printf("Sr. %s, com IMC %.2f, esta um pouco acima do peso.%n", nome, imc);
			} else if (imc < 31.1) {
				
				System.out.printf("Sr. %s, com IMC %.2f, esta acima do peso.%n", nome, imc);
			} else {
				
				System.out.printf("Sr. %s, com IMC %.2f, esta com obesidade.%n", nome, imc);
			}
		} else {
			System.out.println("Não foi possível realizar a verificação."); 
		}
		
		System.out.println("Fim do programa.");
		
		entrada.close();
	}
}