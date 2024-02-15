import java.util.Scanner;

public class ControlePesoAeronaveWhile {
	
	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso máximo da aeronave: ");
		int pesoMaximo = entrada.nextInt();
		
		// -> Esta informação vai ser obtida de outra forma
		// System.out.print("Quantidade de passaggeiros: ");
		// int totalPassageiros = entrada.nextInt();
		
		int pesoTotalPassageiros = 0;
		
		// -> A CONDIÇÃO DO LOOP WHILE sendo FALSA, o loop não é nem lido
		// boolean incluirNovoPassageiro = false;
		boolean incluirNovoPassageiro = true;
		
		// -> Para visualizar que a VARIÁVEL DE CONTROLE não é OBRIGATÓRIA
		// -> Seu uso, vai depender da lógica utilizada   
		// int passageiroAtual = 1;
		
		// -> Alterando a CONDIÇÃO do loop para melhor se adequadar ao WHILE
		// while (passageiroAtual <= totalPassageiros) {
		while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
		
			// -> Não vou exibir mais a variável
			// System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
			System.out.printf("Peso do passageiro: ");
			
			int pesoPassageiro = entrada.nextInt();
			
			pesoTotalPassageiros += pesoPassageiro;
			
			// -> Não preciso somar em uma unidade o valor da variável
			// passageiroAtual++;
			
			// -> Nova verificação de continuidade do LOOP
			System.out.print("Incluir novo passageiro? ");
			incluirNovoPassageiro = entrada.nextBoolean();
		}	
		
		/* -> Para obter um LOOP INFINITO
			while (true) {
			
				/* BLOCO DE CÓDIGO AQUI  */
		 	}
		*/
		
		System.out.printf("Peso máximo da aeronave: %d%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d%n", pesoTotalPassageiros);
		System.out.printf("Condição da aeronave: %s%n", 
			pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");		
				
		
		entrada.close();
	}
}