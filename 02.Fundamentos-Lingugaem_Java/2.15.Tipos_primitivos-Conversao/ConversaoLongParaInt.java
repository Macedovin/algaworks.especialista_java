public class ConversaoLongParaInt {
	
	public static void main (String[] args) {
	
		long x = 10;
		
		// Não compila
		// int y = x; 
	
		int y = (int) x;
		
		System.out.println(x);
		System.out.println(y);
		
		long a = 9_300_000_035L;
		int b = (int) a;
		
		System.out.println(a);
		System.out.println(b);
	}
}