import java.util.Scanner;


public class Greeting {
	public static void main(String[] args) {
		
		//Initialisierung
		
		String greeting = "";
		String input;
		int option;
		
		Scanner scanner = new Scanner(System.in);
		
		//Setup
		
		System.out.println("\n\t Begrüßung ");
		System.out.print("\n\t Bitte wählen Sie ihre Sprache: (de, en, it, es): ");
		
		
		//Datenerfassung
		
		input = scanner.nextLine();
		
		//Verarbeitung
		
		if (input.equals("de")) {
			option = 1;
		}
		else if (input.equals("en")) {
			option = 2;
		}
		else if (input.equals("it")) {
			option = 3;
		}
		else if (input.equals("es")) {
			option = 4;
		}
		else {
			option = 5;
		}
		
		
		switch (option) {
			case 1: greeting = "Hallo Welt!";
					break;
			case 2: greeting = "Hello World!";
					break;
			case 3: greeting = "Ciao mondo!";
					break;
			case 4: greeting = "Hola Mundo!";
					break;
			case 5: greeting = "Falsche Eingabe";
					break;
		}
		
		System.out.print("\n\t " + greeting);
		
		
	}
}		
		