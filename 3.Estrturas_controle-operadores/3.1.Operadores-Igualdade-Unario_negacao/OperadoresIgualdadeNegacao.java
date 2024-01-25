public class OperadoresIgualdadeNegacao {

	public static void main(String[] args) {
		
		// - FORMAS LITERAIS
		// boolean numerosIguais = 10 == 10;
		// System.out.printf("Números iguais: %b%n", numerosIguais);
		
		// - OPERAÇÕES ARITMÉTICAS
		// boolean numerosIguais = (4 + 6) == (5 * 2);
		// System.out.printf("Operações de resulados iguais: %b%n", numerosIguais);
	
		// - VALORES DE VARIÁVEIS
		int numero1 = 10;
		int numero2 = 10;
		int numero3 = 11;
		
		// boolean numerosIguais = numero1 == 10;
		// System.out.printf("Variável e número iguais: %b%n", numerosIguais);
		// boolean numerosIguais = numero1 == numero2;
		// System.out.printf("Variáveis iguais: %b%n", numerosIguais);
		
		// System.out.printf("Variáveis iguais: %b%n", numero1 == numero3);
		
		// - OPERADOR UNÁRIO DE NEGAÇÃO
		// boolean numerosIguais = numero1 == numero3;
		// System.out.printf("Variáveis iguais: %b%n", numerosIguais);
		
		// boolean numerosDiferentes = !numerosIguais;
		// System.out.printf("Variáveis diferentes: %b%n", numerosDiferentes);	
		
		// Negando a EXPRESSÃO BOOLEANA
		// boolean numerosDiferentes = !(numero1 == numero2);
		// System.out.printf("Variáveis diferentes: %b%n", numerosDiferentes);
		
		// - OPERADOR DE DIFERENÇA
		// boolean numerosDiferentesReal = numero1 != numero2;
		// System.out.printf("Variáveis realmente diferentes: %b%n", numerosDiferentesReal);
		
		// - COMPARANDO STRINGS
		String nome1 = "Thiago";
		String nome2 = "Vinicius";
		String nome3 = "Vinicius";
		
		// boolean nomesIguais = nome1 == nome2;
		// System.out.printf("Nomes iguais: %b%n", nomesIguais);
		// System.out.printf("Nomes iguais: %b%n", nome2 == nome3);
		
		// - LIMITAÇÕES -> IGUALDADE 
		
		// * Compara a localização dos objetos na memória *
		
		// Números Inteiros até 127 ou 1 byte
		Integer numeroI1 = 128;
		Integer numeroI2 = 128;
		
		// OK para valores de primitivos 
		int numeroInt1 = 128;
		int numeroInt2 = 128;
		
		boolean numerosInteirosIguais = numeroI1 == numeroI2;
		boolean numerosIntIguais = numeroInt1 == numeroInt2;
			
		System.out.printf("Números Inteiros iguais: %b%n", numerosInteirosIguais);
		System.out.printf("Números int iguais: %b%n", numerosIntIguais);
		
		// String são calsses e podem gerar objetos com diferentes espaços na memória
	    String s1 = "Sachin";  
	    String s2 = new String("Sachin");  
	    System.out.printf("Igualdade de objetos (==): %b%n", s1 == s2);
	    System.out.printf("Igualdade de objetos(equals()): %b%n", s1.equals(s2));
	}
}	