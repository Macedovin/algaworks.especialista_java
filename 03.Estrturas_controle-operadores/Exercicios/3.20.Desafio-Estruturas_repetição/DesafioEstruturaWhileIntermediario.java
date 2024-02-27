import java.util.Scanner;

public class DesafioEstruturaWhileIntermediario {

	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();
				
		int numeroInicial = numeroDigitado;
		
		int numeroFormatado = 0;
	
		while (numeroDigitado > 0) {
			
			int resto = numeroDigitado % 10;
			
			numeroDigitado = numeroDigitado / 10;
			
			numeroFormatado = (numeroFormatado * 10) + resto;
		}
		
		System.out.println("--------------------------------------");

		System.out.printf("O inverso do número %d é: %d%n", numeroInicial, numeroFormatado);
		 
		entrada.close();
	}
}