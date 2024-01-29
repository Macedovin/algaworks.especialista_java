public class ConversaoDoubleParaFloat {
	
	public static void main (String[] args) {
	
		double peso1 = 20.512346789;
		
		// Não compila
		// float peso2 = peso1;
	
		// Conversão explícita -> INSTRUÇÃO
		float peso2 = (float) peso1;
		
		System.out.println(peso1);
		System.out.println(peso2);
		
		float taxa1 = 934.5f;
		// double taxa2 = taxa1;
		
		// Conversão explícita, mesmo com a COERSÃO -> INSTRUÇÃO
		double taxa2 = (double)taxa1;
		
		System.out.println(taxa1);
		System.out.println(taxa2);
	}
}