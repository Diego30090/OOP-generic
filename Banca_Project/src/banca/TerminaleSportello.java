package banca;
import java.util.Scanner;

public class TerminaleSportello {
	public void login() {
		Scanner input = new Scanner(System.in);
	    String username = "";
	    String password = "";
	    ContoCorrente conto = new ContoCorrente();
	    boolean flag = false;
	    
	      
	   do{
	        System.out.println("Login:");
	
	        System.out.println("Inserisci username: ");
	        username = input.nextLine();
	
	        System.out.println("Inserisci password: ");
	        password = input.nextLine();
	
	        flag = Utente.controlla(username, password);
	    	
	   }while(flag ==false);
	   
	   	System.out.println("Login:");
	    System.out.println("Cosa vuole fare"+username+"?");
	    System.out.println("1) Versa");
	    System.out.println("2) Preleva");
	    System.out.println("3) Matura Interesse");
	    System.out.println("4) Ottieni Saldo");
	    System.out.println("5) Ottieni Numero");
	    System.out.println("6) Modifica Tasso Family");
	    System.out.println("7) Modifica Tasso Business");
	    System.out.println("8) Chiudi");
	
	    int scelta = input.nextInt();
		   
	    switch (scelta) 
	    {
	        case 1:
	        	System.out.println("Quanto vuoi versare?");
	        	double ver = input.nextDouble();
	        	conto.versa(ver); break;
	        case 2: 
	        	System.out.println("Quanto vuoi prelevare?");
	        	double prel = input.nextDouble();
	        	conto.preleva(prel); break;
	        case 3: 
	        	conto.maturaInteressi(); break;
	        case 4: 
	        	conto.ottieniSaldo(); break;
	        case 5: 
	        	conto.ottieniNumero(); break;
	        case 6: 
	        	System.out.println("Come vuoi che sia modificato il tasso Family?");
	        	double tasso1 = input.nextDouble();
	        	conto.modificaTassoFamily(tasso1); break;
	        case 7: 
	        	System.out.println("Come vuoi che sia modificato il tasso Business?");
	        	double tasso2 = input.nextDouble();
	        	conto.modificaTassoBusiness(tasso2); break;
	        case 8: break;
	        default:System.out.println("Inserire numero corretto");
	    }
	   
	    
    
	}
}
