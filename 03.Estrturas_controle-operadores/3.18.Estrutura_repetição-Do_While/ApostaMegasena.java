import java.util.Scanner;

public class ApostaMegasena {
	
	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeNumeros = 20;
		
		// -> Verficiando a quantidade de números 
		do {
			
			System.out.print("Quantidade de números: ");
			quantidadeNumeros = entrada.nextInt();
		
			// -> Exibindo mensagem de erro ao usuário
			// CONDIICIONAL IF com repetição da condição do LOOP
			if (quantidadeNumeros < 6 || quantidadeNumeros > 15) {
				
				System.out.println("O número deve ser entre 6 e 15.");
			}
		
		} while(quantidadeNumeros < 6 || quantidadeNumeros > 15);

		// -> Declarando variáveis de controle
		int numeroAtual = 1;
		String numerosEscolhidos = "";
		
		// -> Verificando quais são estes números
		// * Não vai ser feita a lógica para impedir repetição de números *
		do {
			
			// -> Solicitando ao usuário e armazenando os números
			System.out.printf("Número %d/%d: ", numeroAtual, quantidadeNumeros);
			int numeroEscolhido = entrada.nextInt();
			
			// Controlando o intervalo permitido dos números -> 1 a 60
			if (numeroEscolhido < 1 || numeroEscolhido > 60) {
				
				System.out.println("Numero deve ser de 1 e 60.");
			} else {
			
				// -> Concatenando os números recebidos
				numerosEscolhidos += numeroEscolhido + " ";
				
				numeroAtual++;
			}	
			
		} while (numeroAtual <= quantidadeNumeros);
		
		// -> Imprimindo o resultado em tela
		System.out.printf("Números escolhidos %s%n", numerosEscolhidos);
		
		entrada.close();
	}
}