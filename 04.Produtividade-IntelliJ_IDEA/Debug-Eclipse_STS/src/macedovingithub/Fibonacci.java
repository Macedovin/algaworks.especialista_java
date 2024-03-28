package macedovingithub;

public class Fibonacci {
	
	// F(n) = F(n-1) + F(n-2)
	// 0, 1, 1, 2, 3, 5, 8, ...
	public static long calcula (long posicao) {

//		-> Começanco a sequência em 0
//		F(0) = 0, F(1) = 1
//		-> Vai sair novamente da RECURSIVIDADE 
		if (posicao == 0 || posicao == 1) {
			
			return posicao;
		}

//		-> Começanco a sequência em 1
//		-> Vai sair de uma das chamadas RECURSIVAS
//		if (posicao == 1 || posicao == 2) {
//			
//			return 1; 
//		}
		
//		long valor = calcula(posicao - 1) + calcula(posicao - 2);
		
//		-> Refatorando para visualizar ainda melhor
		long valor1 = calcula(posicao - 1);
		long valor2 = calcula(posicao - 2);
		
		return valor1 + valor2;
		
//      return valor;
	}	
}
