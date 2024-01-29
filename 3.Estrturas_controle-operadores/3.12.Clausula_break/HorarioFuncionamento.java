import java.util.Scanner;

public class HorarioFuncionamento {

	public static void main (String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc.): ");
		String diaSemana = entrada.nextLine();
		
		// Declarando a variável 
		String horarioFuncionamento;
		
		// Múltiplos CASOS num mesmo BLOCO
		switch (diaSemana) {
			
			case "seg":
				horarioFuncionamento = "Fechado";
				break;
			case "ter":
			case "qua":
			case "qui":
			case "sex":
				horarioFuncionamento = "08:00h às 18:00h";
				break;
			case "sab":
			case "dom":
				horarioFuncionamento = "08:00h às 12:00h";
				break;
			default:
				horarioFuncionamento = "Dia inválido";
				break;
		}
		
		
		System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
		
		entrada.close();
	}
}