public class ConversaoDoubleParaInt {
	
	public static void main (String[] args) {

		double largura = 100;
		
		// Não compila
		// int tamanho = largura;
	
		// Conversão explícita -> INSTRUÇÃO DE CASTING
		int tamanho = (int) largura;
	
		System.out.println(tamanho);
	}
}