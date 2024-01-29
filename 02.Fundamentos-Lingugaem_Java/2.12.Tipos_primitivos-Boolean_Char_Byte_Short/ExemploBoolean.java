public class ExemploBoolean {

	public static void main (String[] args) {
	
	
		// Valor não literal não vai ser compilado -> Lido como INT
		// boolean compraAprovada = 1;
		boolean compraAprovada = true;
		boolean clienteBloqueado = false;
		
		System.out.println(compraAprovada);
		System.out.println(clienteBloqueado);

		int quantidadeEstoque = 10;
		int quantidadePedidoCompra = 15;
		
		// Valor de EXPRESSÃO COM OPERADORES, no aso Relacional
		boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra; 
		
		System.out.println("Estoque suficinete: " + estoqueSuficiente);
	}
}