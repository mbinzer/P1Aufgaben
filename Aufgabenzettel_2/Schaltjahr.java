import java.util.Scanner;

public class Schaltjahr {
	public static void main(String[] args) {
		//Initialisierung
		int year;
		int input;
		boolean schalt = false;
	
		Scanner scanner = new Scanner(System.in);
		
		//Setup
		
		System.out.println("\n\t SCHALTJAHRRECHNER");
		
		//Datenerfassung
		
		System.out.print("\n\t Bitte geben Sie eine JahresZahl ein: ");
		year = scanner.nextInt();
		
		// Berechnung
		
		if((year % 4) == 0){
			
			if ((year % 100) == 0 ) {
				if((year % 400) == 0) {
					schalt = true;
				}
				else {
					System.out.println("\n\t Das Jahr " + year + " ist kein Schaltjahr!");
				}
			}
			else {
				schalt = true;
	
			}
		}
		else {
			System.out.println("\n\t Das Jahr " + year + "ist kein Schaltjahr!");
		}
		
		if (year < 0) {
			year = year * (-1);
			if (schalt) {
				System.out.println("\n\t Das Jahr " + year + " v. Chr. ist ein Schaltjahr.");
			}
		}
		else {
			if(schalt) {
				System.out.println("\n\t Das Jahr " + year + " ist ein Schaltjahr!");
			}
		}
		
		
		
	}
}                        