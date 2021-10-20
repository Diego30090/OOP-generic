package banca;



public class GestioneBanca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TerminaleSportello termin = new TerminaleSportello();
		System.out.println("Benvenuto nell'applic. bancario");
		Utente.inizializza("Lorenzo Manganelli", "Chia chio chia");
		termin.login();
	}

}
