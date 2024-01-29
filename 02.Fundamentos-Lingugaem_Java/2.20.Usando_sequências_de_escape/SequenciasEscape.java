public class SequenciasEscape {

	public static void main(String[] args) {
		
		// Não compila
		// System.out.println("Oi "Maria"");
		
		// Sequencia de escape para ASPAS DUPLAS
		System.out.println("Oi \"Maria\"");
		
		System.out.println("Seu nome: João");
		
		// Sequência da escape para QUEBRA DE LINHA/ NOVA LINHA
		System.out.println("Seu nome:\nJoão");
		
		// Não compila
		// System.out.println("C:\Windows");
		
		// Sequência da escape para CONTRABARRA/ BARRA INVERTIDA/ BACKSLASH
		System.out.println("C:\\Windows");
		
	}
}