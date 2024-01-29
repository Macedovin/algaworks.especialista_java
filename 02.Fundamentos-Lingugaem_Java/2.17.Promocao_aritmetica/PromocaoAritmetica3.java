public class PromocaoAritmetica3 {

	public static void main (String[] args) {
	
		int x = 3;
		int y = 2;
		
		// resultado obtido arrendondado para baixo
		// int y = 2;
		
		// resultado obtido com Ponto Flutuiante
		// float y = 2;
		
		// float z = x/ y;
		
		// realizando o CASTING de uma das variáveis
		// float z = (float) x/ y;
		// float z = x/ (float) y
		
		// Casting da operação seria igual a obter um tipo int
		float z = (float) (x/ y);
		
		System.out.println(z);
	}
}