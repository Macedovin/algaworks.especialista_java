import java.util.Scanner;

public class HorarioFuncionamentoArrows {

	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc.): ");
		String diaSemana = entrada.nextLine();
		
		System.out.print("Mês: ");
		int mes = entrada.nextInt();
		
		/*
		// Switch Expressions -> java 14
		String horarioFuncionamento = switch (diaSemana) {
			case "seg" -> "Fechado";
			case "ter", "qua", "qui", "sex" -> "08:00h às 18:00h";
			case "sab", "dom" -> "08:00h às 12:00h";
			// sem otrecho abaixo o código-onte não compila
			default -> "Dia inválido";
		};	
		*/
		
		/*
		// Switch expression no método printf()
		System.out.printf("Horário de funcionamento: %s%n", switch (diaSemana) {
			case "seg" -> "Fechado";
			case "ter", "qua", "qui", "sex" -> "08:00h às 18:00h";
			case "sab", "dom" -> "08:00h às 12:00h";
			// sem otrecho abaixo o código-onte não compila
			default -> "Dia inválido";
		});
		*/		
		
		// Switch Expressions e 2 (duas) ou mais instruções -> YIELD
		String horarioFuncionamento = switch (diaSemana) {
			case "seg" -> {
				
				if (mes ==12) {
					
					System.out.println("Aberto pois o movimento é intenso.");
					yield "08:00h às 16:00h";
				}
				
				System.out.println("Neste dia não abrimos.");
				yield "Fechado";
			}
			case "ter", "qua", "qui", "sex" -> "08:00h às 18:00h";
			case "sab", "dom" -> {
				
				System.out.println("Horário de funcionamento reduzido nos finais de semana.");
				yield "08:00h às 12:00h";				
			}
			default -> "Dia inválido";
		};		
		
		System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
		
		entrada.close();
	}
}