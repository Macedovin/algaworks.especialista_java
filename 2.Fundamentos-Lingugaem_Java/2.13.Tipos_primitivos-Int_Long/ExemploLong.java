public class ExemploLong {

	public static void main (String[] args) {
			
		long populacaoUberlandia = 699_097;
		
		// Não compila -> Reconhecido como tipo INT
		// long populacaoCidadeGigante = 2_147_483_648;
		
		long populacaoCidadeGigante = 2_147_483_648L;
		
		// Não compila -> Reconhecido como tipo INT
		// System.out.println(2_147_483_648);
		System.out.println(2_147_483_648L);
	}
}