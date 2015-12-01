import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
	
		//Initialisierung
		
		String nick1;
		String nick2;
		String passw1;
		String passw2;
		
		Scanner scanner = new Scanner(System.in);
		
		String passInput;
		String nickInput;
		
		//Setup
		
		System.out.println("\n\t Login ");
		
		
		//Datenerfassung
		
		nick1 = "studi";
		nick2 = "prof";
		
		passw1 = "ms++so13";
		passw2 = "geheim";
		
		//Benutzerabfrage
		
		System.out.print("\n\t Bitte geben Sie ihren Benutzernamen ein: ");
		nickInput = scanner.nextLine();
		
		System.out.print("\n\t Passwort: ");
		passInput = scanner.nextLine();
		
		//Verarbeitung
		
		if(nickInput.equals("studi") || (nickInput.equals("prof"))) {
			if (nickInput.equals("studi") ) {
				if(passInput.equals("ms++so13")) {
					System.out.println("\n\t WILKOMMEN!");
				}
				else {
					System.out.println("Falsche Passworteingabe!");
				}
			}
			else {
				if(passInput.equals("geheim") ) {
					System.out.println("\n\t WILKOMMEN!");
				}
				else {
					System.out.println("\n\t Falsche Passworteingabe!");
				}
			}
		}
		else {
			System.out.println("\n\t Falscher Benutzername! \n\t Bitte achten Sie auf Groß - und Kleinschreibung.");
		}
		
	}	
}