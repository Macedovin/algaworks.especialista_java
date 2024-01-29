public class CalculadoraIdadeMedia {

	public static void main(String[] args) {
	
		int idade1 = 30;
		int idade2 = 40;
		int idade3 = 60;

		// float idadeMedia = ((float) idade1 + idade2 + idade3) / 3;
		
		// AINDA MELHOR... Somando as variáveis e convertendo a float, depois dividindo
		// float idadeMedia = (float) (idade1 + idade2 + idade3) / 3;
		
		// Outra possibilidade - Definir o 3 como float
		float idadeMedia = (idade1 + idade2 + idade3) / 3f;
		
		System.out.println("Idade média: " + idadeMedia);
	}
}