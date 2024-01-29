import java.util.Scanner;

public class HorarioFuncionamentoArrows {

	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc.): ");
		String diaSemana = entrada.nextLine();
		
		// Declarando a variável 
		String horarioFuncionamento;
		
		// Arrow Labels -> Java 14
		switch (diaSemana) {
			
			case "seg" -> horarioFuncionamento = "Fechado";
			case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00h às 18:00h";
			case "sab", "dom" -> horarioFuncionamento = "08:00h às 12:00h";
			default -> horarioFuncionamento = "Dia inválido";
		}
		
		/*
		// Múltiplos CASOS num mesmo BLOCO
		// Arrow Labels e 2 (duas) ou mais instruções
		switch (diaSemana) {
			
			case "seg" -> {
				
				horarioFuncionamento = "Fechado";
				System.out.println("Neste dia não abrimos.");
			}
			case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00h às 18:00h";
			case "sab", "dom" -> {
				
				horarioFuncionamento = "08:00h às 12:00h";
				System.out.println("Horário de funcionamento reduzido nos finais de semana.");
			}
			default -> horarioFuncionamento = "Dia inválido";
		}
		*/
		
		System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
		
		entrada.close();
	}
}