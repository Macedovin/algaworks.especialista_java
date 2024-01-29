public class OperadoresComparacao {

	public static void main(String[] args) {
		
		int pesoProdutos1 = 900;
		int pesoProdutos2 = 1001;
		int limitePesoCaminhao= 1000;
		
		// MAIOR QUE 
		boolean cargaExcedida1 = pesoProdutos1 > limitePesoCaminhao;
		boolean cargaExcedida2 = pesoProdutos2 > limitePesoCaminhao;
		
		// System.out.printf("Carga 1 excedida: %b%n", cargaExcedida1);
		System.out.printf("Carga 2 excedida: %b%n", cargaExcedida2);		
	
		// MENOR QUE
		boolean cargaLiberada1 = pesoProdutos1 < limitePesoCaminhao;
		boolean cargaLiberada2 = pesoProdutos2 < limitePesoCaminhao;
	
		// System.out.printf("Carga 1 liberada: %b%n", cargaLiberada1);
		System.out.printf("Carga 2 librerada: %b%n", cargaLiberada2);
		
		// E se os pesos forem iguais?
		int pesoProdutos3 = 1000;
		
		boolean cargaExcedida3 = pesoProdutos3 > limitePesoCaminhao;
		// boolean cargaLiberada3 = pesoProdutos3 < limitePesoCaminhao;
		
		// - MENOR OU IGUAL
		boolean cargaLiberada3 = pesoProdutos3 <= limitePesoCaminhao;
			
		System.out.printf("Carga 3 excedida: %b%n", cargaExcedida3);
		System.out.printf("Carga 3 liberada: %b%n", cargaLiberada3);
		
		// - MAIOR OU IGUAL
		boolean cargaLiberadaCaminhao = limitePesoCaminhao >= pesoProdutos3;
		boolean carga2LiberadaCaminhão = limitePesoCaminhao >= pesoProdutos2;
		
		System.out.printf("Carga 3 liberada de acordo com o caminhão: %b%n", cargaLiberadaCaminhao);
		System.out.printf("Carga 2 liberada de acordo com o caminhão: %b%n", carga2LiberadaCaminhão);
	}
}