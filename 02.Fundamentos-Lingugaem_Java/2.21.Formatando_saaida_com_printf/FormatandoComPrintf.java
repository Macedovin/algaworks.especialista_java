public class FormatandoComPrintf  {

	public static void main(String[] args) {
	
		String nome1 = "Vinicius";
		
		// Concatenação
		// System.out.println("Olá, " + nome1);
		
		// printf
		// System.out.printf("Olá, %s", nome1);
		
		System.out.printf("Olá, %s \ne \n%s%n", nome1, "Fábio dos Reis"); 
		// System.out.printf("%s%n","Fábio dos Reis");
		System.out.printf("%s%s\n", "Rua das Gloxínias, ", "CEP 06532-052");
		
		int quantidade = 48;
		System.out.printf("Quantidade: %d itens%n", quantidade);
	
		double peso = 938.22;
		System.out.printf("Peso: %.2f%n", peso);
		System.out.printf("Peso: %.3f%n", peso);
		System.out.printf("Peso: %.4f%n", peso);
		
		// Definindo a largura em caracteres
		System.out.printf("Peso: %10.2f%n", peso);
		
		double dblTotal = 58_756.4765634;
		// String.format( )
		String grandTotal = String.format("Grand Total: %,.2f", dblTotal); // Nova variável/ referência formatada
		
		System.out.println(grandTotal);
	}
}