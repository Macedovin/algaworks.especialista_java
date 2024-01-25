import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		int anoDigitado = entrada.nextInt();
		
		// O que vem abaixo é a título de complementação
		int multiplosQuatrocentos = anoDigitado % 400;
		int multiploQuatro = anoDigitado % 4;
		int naoMultiploCem = anoDigitado % 100;
		
		System.out.printf("É multiplo de 400 e 4 se 0 e não de 100 se diferente: %d, %d, %d%n", multiplosQuatrocentos, multiploQuatro, naoMultiploCem);
		
		// Lógica da aplicação
		boolean anoBissexto = anoDigitado % 400 == 0 || (anoDigitado % 4 == 0 && anoDigitado % 100 != 0);
		System.out.printf("O ano %d é bissexto? %b%n", anoDigitado, anoBissexto);
			 
	}
}