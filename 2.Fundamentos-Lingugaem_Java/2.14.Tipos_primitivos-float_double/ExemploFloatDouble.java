public class ExemploFloatDouble {

	public static void main (String[] args) {
		// "d" é opcional; ponto (.) é a escolha, não a vírgula (,)
		double peso = 84.9d;
		double outroPeso = 105.0D;
		
		System.out.println(peso);
		System.out.println(outroPeso);
		
		System.out.println("Double MAX - " + Double.MAX_VALUE);
		System.out.println("Double MIN - " + Double.MIN_VALUE);	
		
		// Não compila -> Reconhecido como tipo DOUBLE
		// float taxa = 1_294.43;
		float taxa = 1_294.43f;
		float sobreTaxa = 254.98F;
		
		System.out.println(taxa);
		System.out.println(sobreTaxa);
		
		System.out.println("Float MAX - " + Float.MAX_VALUE);
		System.out.println("Float MIN - " + Float.MIN_VALUE);
	}
}