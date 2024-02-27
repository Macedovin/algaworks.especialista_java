import java.util.Scanner;

public class DesafioEstruturaDoWhile {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		boolean digitarNovoNumero = true;
		String numerosPares = "";
		String numerosImpares = "";
		double somaNumerosPares = 0.0;
		double somaNumerosImpares = 0.0;
		
		do {
		
			System.out.print("Digite um número inteiro: ");
			double numeroDigitado = entrada.nextDouble();
			
			if (numeroDigitado % 1 != 0) {
			
				System.out.println("O número deve ser inteiro.");
				continue;
			} else if (numeroDigitado % 2 == 0) {
			
				numerosPares += String.format("%.0f ", numeroDigitado);
				somaNumerosPares += numeroDigitado; 
				
			} else if (numeroDigitado %2 != 0) {
			
				numerosImpares += String.format("%.0f ", numeroDigitado);
				somaNumerosImpares += numeroDigitado;
			}
			
			System.out.print("Deseja digitar um novo número? ");
			digitarNovoNumero = entrada.nextBoolean();
		
		} while (digitarNovoNumero);
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("Os números digitados que eram pares foram: %s%n", numerosPares);
		System.out.printf("A soma destes números pares foi: %.0f.%n", somaNumerosPares);
		System.out.println("---------------------------------------------------------");
		System.out.printf("Os números digitados que eram ímpares foram: %s%n", numerosImpares);
		System.out.printf("A soma destes números ímpares foi: %.0f.%n", somaNumerosImpares);
		
		entrada.close();
	}
}