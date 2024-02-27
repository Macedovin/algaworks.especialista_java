import java.util.Scanner;

public class DesafioEstruturaFor {

	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int totalNumeros = 10;
		String numerosPares = "";
		int somaNumeros = 0;
		
		// Recebe 10 (dez) números e encerra mostrando a soma dos números pares
		for (int numeroAtual = 1; numeroAtual <= totalNumeros; numeroAtual++) {
			
			System.out.print("Digite 1 (um) número: ");
			int numeroDigitado = entrada.nextInt();
			
			if (numeroDigitado % 2 != 0) {
				
				System.out.println("O número digitado deve ser par.");
				continue;
			} 
			
			numerosPares += numeroDigitado + " ";
			
			somaNumeros += numeroDigitado;
		}	
		
		System.out.printf("Os números pares digitados foram: %s%n", numerosPares);
		System.out.printf("A soma destes números foi: %d%n", somaNumeros);
		
		entrada.close();
	}
}