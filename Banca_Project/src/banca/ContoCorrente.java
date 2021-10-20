package banca;

public class ContoCorrente {
	
	private static double saldo ;
	private static int numero ;
	private static int numeroUltimoContoCreato = 1000;
	public static double tasso = 0.02;
	
	
	public static void inizializza(double saldoIniziale, int numeroConto) {
		saldo=saldoIniziale;
		numero=numeroConto;
	}
	
	public void versa(double somma){
	saldo +=somma;
	System.out.println("Hai versato con successo "+somma+"€.");
		}
	
	public boolean preleva ( double somma ){
	if (saldo<somma) {System.out.println("Sei povero. https://www.youtube.com/watch?v=dQw4w9WgXcQ"); return false;}
	saldo-=somma;
	System.out.println("Hai versato con successo "+somma+"€.");
	return true;
		}
	
	public double ottieniSaldo(){
		return saldo ; 
		}
	
	public double ottieniNumero(){ 
		return numero ;
		}
		
	public void maturaInteressi() {
	saldo += saldo * tasso ;
		}
	
	public void modificaTassoFamily(double tasso){
		//TODO
		}
	
	public void modificaTassoBusiness(double tasso){
		//TODO
		}
	
}

