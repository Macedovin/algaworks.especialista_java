import java.util.Scanner;

public class ControlePesoAeronaveBreak {
	
	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso máximo da aeronave: ");
		int pesoMaximo = entrada.nextInt();
		
		int pesoTotalPassageiros = 0;
		
		// -> Movendo a variável para o LOOP WHILE
		// boolean incluirNovoPassageiro = true;
		
		// -> Obtendo um LOOP INFINITO
		// while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
		while (true) {
		
			System.out.printf("Peso do passageiro: ");
			
			int pesoPassageiro = entrada.nextInt();
			
			pesoTotalPassageiros += pesoPassageiro;
			
			System.out.print("Incluir novo passageiro? ");
			// Obtendo a variável
			// * O laço/ loop ainda assim vai ser INFINITO * 
			// boolean incluirNovoPassageiro = entrada.nextBoolean();
			
			// -> Utilizando a cláusula BREAK - Saindo LOOP
			if (!entrada.nextBoolean()) {
				break;
			}
		}	
		
		System.out.printf("Peso máximo da aeronave: %d%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d%n", pesoTotalPassageiros);
		System.out.printf("Condição da aeronave: %s%n", 
			pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");						
		
		entrada.close();
	}
}