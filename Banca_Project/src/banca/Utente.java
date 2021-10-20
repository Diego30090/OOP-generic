package banca;

public class Utente {
	private static String user;
	private static String password;


	public static void inizializza (String utente, String Pass) {
	user = utente;
	password = Pass;
	}
	
	public static boolean controlla (String nome, String pass) {
		if(nome.equals(user) && pass.equals(password)) {return true;}
		else {
			System.out.println("Il marchingegno non funziona");
			return false;
		}
	}
}