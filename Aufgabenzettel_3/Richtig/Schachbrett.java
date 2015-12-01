import java.util.Scanner;

public class Schachbrett {
	public static void main(String[] args) {
	
		//Initialisierung
		int quadrat;
		int breite;
		int hoehe;
		char schwarz = '#';
		char weiss = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		//Setup
		
		System.out.println("\n\t Schachbrettmuster ");
		System.out.println("\n\t Bitte geben Sie die Höhe ihres Schachbretts ein: ");
		
		hoehe = scanner.nextInt();
		
		
		System.out.println("\n\t Bitte geben Sie die Breite ihres Schachbretts ein: ");
		breite = scanner.nextInt();
		
		quadrat = breite * hoehe;
		
		for (int count = 1; count <= quadrat; count++){
			
			if(count % 2 != 0) {
				System.out.print(schwarz);
				
			}
			else {
				System.out.print(weiss);
			}	
			
			if (count % breite == 0){
				System.out.print("\n");
			}
		}
	}
}