import java.util.Scanner;

public class EntradaDeDados  {

	public static void main(String[] args) {
		
		// Declarando a váriavel que instancia a classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite oseu nome:");
		
		// Forma literal
		// String nome = "Vinicius";
		
		// Recebendo os dados do tipo String no terminal  
		String nome = entrada.nextLine();
		
		// Exibindo a variável
		System.out.printf("Oi, %s%n", nome);
	}
}