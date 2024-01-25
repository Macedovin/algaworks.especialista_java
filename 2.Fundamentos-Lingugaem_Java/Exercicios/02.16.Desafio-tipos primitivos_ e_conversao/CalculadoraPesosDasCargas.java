public class CalculadoraPesosDasCargas {

	public static void main(String[] args) {
		double pesoCarga1 = 1033.49;
		double pesoCarga2 = 849.88;
		
		// Não compila -> A INSTRUÇÃO DE CASTING deve ser para as duas variáveis
		// int pesoTotalCargas = ((int) pesoCarga1 + pesoCarga2);
		
		//int pesoTotalCargas = ((int) pesoCarga1 + (int) pesoCarga2);
		
		// AINDA MELHOR 
		int pesoTotalCargas = (int) (pesoCarga1 + pesoCarga2);
		double pesoTotalCargasD = (pesoCarga1 + pesoCarga2);
		
		// O resultado deve ser 1883
		System.out.println("Peso total das cargas: " + pesoTotalCargas);
		System.out.println("Peso total real das cargas : " + pesoTotalCargasD);
  }

}