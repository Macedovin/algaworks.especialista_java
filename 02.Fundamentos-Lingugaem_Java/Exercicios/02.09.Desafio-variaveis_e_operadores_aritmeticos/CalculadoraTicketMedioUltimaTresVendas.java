public class CalculadoraTicketMedioUltimasTresVendas {
	
	public static void main (String[] args) {
	
		double vendaUm = 20.0;
		double vendaDois = 30.0;
		double vendaTres = 100.0;
		
		double valorTicketMedio = (vendaUm + vendaDois + vendaTres) / 3;
	
		System.out.println("Valor do ticket médio das últimas 3 compras: " + valorTicketMedio);
	
	}
}