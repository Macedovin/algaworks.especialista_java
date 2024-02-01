import java.util.Scanner;

public class CalculadoraImpostos {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		// P - Prosuto; S - Serviço
		char tipoNotaFiscal = 'P';
		double totalFaturado = 1200.30;		
		
		// Condição If-Else
		/*
		double valorImpostos;
		
		if (tipoNotaFiscal == 'S') {
			
			valorImpostos = totalFaturado * 0.16;
		} else {
		
			valorImpostos = totalFaturado * 0.35;
		}
		*/
		
		// Conidição Operador TERNÁRIO
		// double valorImpostosTern = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;
		
		// Evitando cálculos e simplificando
		double taxaImpostos = tipoNotaFiscal == 'S' ? 0.16 : 0.35;
		double valorImpostosTern = totalFaturado * taxaImpostos;
		
		// Aninhando TERNÀRIOS -> Exemplo
		// NÃO INDICADO!!!
		/*
		double valorImpostosTern = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 
			: totalFaturado > 1000 ? totalFaturado * 0.35 : totalFaturado * 0.30;		
		*/
		
		System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
		// System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
		System.out.printf("Valor dos impostos com ternário: R$%.2f%n", valorImpostosTern);
		
		entrada.close();
	} 
}