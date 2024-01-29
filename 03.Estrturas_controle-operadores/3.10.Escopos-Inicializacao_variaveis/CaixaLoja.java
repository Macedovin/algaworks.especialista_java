import java.util.Scanner;

public class CaixaLoja {

	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Preço dos produtos: ");
		double precoProdutos = entrada.nextDouble();
		
		System.out.print("Cobrar frete? ");
		boolean cobrarFrete = entrada.nextBoolean();
		
		// Declarando a variável -> Somente isso não compila
		// Declarandoe inicializando a variável
		double valorFrete = 0.0;
		
		if (cobrarFrete) {

			System.out.print("Valor do frete: ");
			// Atribuindo valor a variável já declarada
			valorFrete = entrada.nextDouble();
		
		// Uma das formas de inicialização de variável, neste caso
		} // else {
		
		//	valorFrete = 0.0;
		//}	
		
		// Não compila sem a inicialização da variável "valorFrete"  
		double valorTotal = precoProdutos + valorFrete;
			
		
		System.out.printf("Valor total: R$%.2f%n", valorTotal);
	}
	
}