public class PrecedenciaOperadoresLogicos {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		// boolean resultado = x == 13 && x == 15 || y == 20;
		// O que esta acima é o mesmo que a expressão abaixo
		// boolean resultado = (x == 13 && x == 15) || y == 20;
		
		// Alterando a precedência com GROUP OPERATOR
		// Passando a prioridade para o OPERADOR "OU"/ "OR"
		boolean resultado = x == 13 && (x == 15 || y == 20);
		
		System.out.println(resultado);
	}
}