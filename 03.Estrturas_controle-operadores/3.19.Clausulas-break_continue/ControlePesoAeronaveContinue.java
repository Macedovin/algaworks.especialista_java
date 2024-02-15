import java.util.Scanner;

public class ControlePesoAeronaveContinue {
	
	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso máximo da aeronave: ");
		int pesoMaximo = entrada.nextInt();
		
		int pesoTotalPassageiros = 0;

		while (true) {
			
			/*
			// -> DECLARAÇÕES DE RAMIFICAÇÃO em LOOPs internos
			// -> Afetam o LOOP mais interno
			for (;;) {
				
				// vai pular uma iteração deste LOOP FOR
				continue;
			}
			*/
		
			System.out.printf("Peso do passageiro: ");
			
			int pesoPassageiro = entrada.nextInt();
			
			// -> Utilizando a cláusula CONTINUE - Pulando a ITERAÇÂO
			if (pesoTotalPassageiros + pesoPassageiro > pesoMaximo) {
				
				System.out.println("Não pôde incluir passageiro. Peso excederia o máximo.");
				
				continue;
			}
			
			pesoTotalPassageiros += pesoPassageiro;
			
			System.out.print("Incluir novo passageiro? ");			
			// -> Utilizando a cláusula BREAK - Saindo LOOP
			if (!entrada.nextBoolean()) {
				break;
			}
			
			/*
			// -> Sem o uso da cláusula CONTINUE - CONDICIONAL IF/ ELSE, neste exemplo
			if (pesoTotalPassageiros + pesoPassageiro > pesoMaximo) {
				
				System.out.println("Não pôde incluir passageiro. Peso excederia o máximo.");
			} else {
				
				pesoTotalPassageiros += pesoPassageiro;
			
				System.out.print("Incluir novo passageiro? ");			
				// -> Utilizando a cláusula BREAK - Saindo LOOP
				if (!entrada.nextBoolean()) {
					break;
				}
			}			
			*/
		}	
		
		System.out.printf("Peso máximo da aeronave: %d%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d%n", pesoTotalPassageiros);
		System.out.printf("Condição da aeronave: %s%n", 
			pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");						
		
		entrada.close();
	}
}