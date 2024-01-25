public class ExemploByteShort {

	public static void main (String[] args) {
		
		
		// Não vai compilar -> BYTE não comporta este tamanho.
		// byte idade = 128;
		byte idade = 127;                        // VALOR MÁXIMO - BYTE   
		
		// Não vai compilar -> SHORT não comporta este tamanho.
		// short quantidadeEstoque = 32768; 
		short quantidadeEstoque = 32767;        // VALOR MÁXIMO - SHORT
		 
 	}
}