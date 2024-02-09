import java.util.Scanner;

public class ControlePesoAeronaveDoWhile {
	
	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso máximo da aeronave: ");
		int pesoMaximo = entrada.nextInt();
		
		int pesoTotalPassageiros = 0;
		
		// -> Mesmo a CONDIÇÃO DO LOOP "DO/ WHILE" sendo FALSA, o loop é nem lido PELO MENOS 1 (UMA) VEZ
		// boolean incluirNovoPassageiro = true;
		boolean incluirNovoPassageiro = false;
		
		// -> Verificando o valor da variável da CONDIÇÃO
		System.out.println(incluirNovoPassageiro); 
		
		do {
		
			System.out.printf("Peso do passageiro: ");
			
			int pesoPassageiro = entrada.nextInt();
			
			pesoTotalPassageiros += pesoPassageiro;

			System.out.print("Incluir novo passageiro? ");
			incluirNovoPassageiro = entrada.nextBoolean();

		// -> Nova verificação de continuidade do LOOP
		} while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro); 
		
		
		System.out.printf("Peso máximo da aeronave: %d%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d%n", pesoTotalPassageiros);
		System.out.printf("Condição da aeronave: %s%n", 
			pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");		
				
		
		entrada.close();
	}
}