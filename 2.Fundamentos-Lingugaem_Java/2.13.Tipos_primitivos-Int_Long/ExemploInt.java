public class ExemploInt {

	public static void main (String[] args) {
	
		int socialSecurityNumber = 999_99_9999;
		
		int populacaoUberlandia = 699_097;
		
		// Não vai compilar -> INT não comporta este tamanho.
		// int populacaoCidadeGigante = 2_147_483_648;
		int populacaoCidadeGigante = 2_147_483_647;
		
	}
}