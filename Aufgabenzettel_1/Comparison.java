import java.util.Scanner;

public class Comparison{
	public static void main (String[] args) {
		//Deklaration
		int fourDigits;
		Scanner scanner = new Scanner(System.in);
		
		/*Initialisierung
		fourDigits = ?
		*/
		
		
		//Daten-Import
		System.out.print("Bitte gib eine vierstellige Zahl ein: ");
		
		fourDigits = scanner.nextInt();
		
		//Verarbeitung
		if(fourDigits < 1000) {
			System.out.println("Die Eingabe ist zu klein");			
		}
		else if (fourDigits > 9999){
			System.out.println("Die Zahl ist zu groﬂ");
				
		}
		else {
			System.out.println("Danke");
			
		}
	}
}