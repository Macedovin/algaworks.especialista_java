public class OperadorDecremento {

	public static void main (String[] args) {
	
		int limiteTentativasLogin = 10;
		
		// limiteTentativasLogin = limiteTentativasLogin - 1;
		// limiteTentativasLogin -= 1;
		// limiteTentativasLogin--;	
		
		// Pós-fixada
		int novoLimiteTentativasLogin = limiteTentativasLogin--;
		
		// Pré-fixada
		// int novoLimiteTentativasLogin = --limiteTentativasLogin;
		
		System.out.println("Total de logins: " + limiteTentativasLogin);
		System.out.println("Total de logins: " + novoLimiteTentativasLogin);
	}
}