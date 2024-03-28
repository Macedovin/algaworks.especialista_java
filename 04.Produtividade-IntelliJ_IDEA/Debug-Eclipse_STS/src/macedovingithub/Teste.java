package macedovingithub;

public class Teste {

	public static void main(String[] args) {
		
//		-> Passsando zero como valor, devo rever a lógica mais uma vez
		long posicao = 3;
		long valor = Fibonacci.calcula(posicao);
		
		System.out.println("F(" + posicao + ") = " + valor);
	}
}
