public class CalculadoraMediaIdades {

	public static void main (String[] args) {
	
		int minhaIdade = 37;
		int suaIdade = 20;
		int idadeJoao = 50;
		
		int idadeMedia = (minhaIdade + suaIdade + idadeJoao) / 3;
		int somaDeDuasDivisaoDeUmaPorTres = minhaIdade + suaIdade + idadeJoao / 3;
		
		System.out.println("Média das idades: " + idadeMedia + 
			"\nSoma de uma e soma da divisão de uma delas por 3: " + somaDeDuasDivisaoDeUmaPorTres);
	
	}
}