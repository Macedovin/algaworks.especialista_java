public class ConversaoIntParaLong {
	
	public static void main (String[] args) {
		
		int y = 102344;
		
		// long x = y;
	
		// Conversão explícita, mesmo com a COERSÃO -> INSTRUÇÃO
		long x = (long) y;
		
		System.out.println(y);
		System.out.println(x);
	}
}