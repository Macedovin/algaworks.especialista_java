import java.util.Scanner;

public class DesafioEstruturaForFinal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		String numerosPares = "";
		int somaNumeros = 0;
		
		// Recebe 10 (dez) números pares e exibe a soma detses, ignorando os ímpares
		for (int totalNumeros = 1; totalNumeros <= 10; totalNumeros++) {
			
			System.out.print("Digite 1 (um) número par: ");
			int numeroDigitado = entrada.nextInt();		
			
			if (numeroDigitado % 2 != 0) {
				
				System.out.println("O número digitado deve ser par.");
				// Diminua o valor da VARIÁVEL DE CONTROLE em uma unidade 
				totalNumeros--;
				//continue; -> Não preciso "pular" a iteração, mas sim, fazer outra coisa 
			} else {
			
				numerosPares += numeroDigitado + " ";
			
				somaNumeros += numeroDigitado;
			}
		
		}
		
		System.out.printf("Os números pares digitados foram: %s%n", numerosPares);
		System.out.printf("A soma destes números foi: %d%n", somaNumeros);
		
			
		entrada.close();
    }
}
