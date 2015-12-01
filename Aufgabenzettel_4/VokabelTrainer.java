import java.util.Scanner;


public class VokabelTrainer {
	public static void main(String[] args){
		
		//Initialisierung
		String vokDeut[] = {"Konto", "Haus", "Maus"} ;
		String vokEng[] = {"account", "house", "mouse"};
		String vokVerg[] = new String[3];
		int index;
		int counter = 0;
		int loopcounter = 0;
		float succesrate;
		Scanner scanner = new Scanner(System.in);
		String weiter;
		
		//Setup
		System.out.println("\n\t ####Vokabeltrainer####");		
		
		//Datenimport
		
		for (index = 0; index < vokDeut.length; index++){
			System.out.print(vokDeut[index] + ": ");
			vokVerg[index] = scanner.nextLine();
			loopcounter++;
				if(vokVerg[index].equalsIgnoreCase(vokEng[index])) {
					System.out.println("Richtig");
					counter++;;
				}
				else {
					System.out.println("FEHLER (richtige Antwort: " + vokEng[index] + ")");
					
				}
				
				succesrate = loopcounter / counter;
				succesrate = 100 / succesrate;
				
			System.out.println(" - Weiter (J/N)? ");
			weiter = scanner.nextLine();
				if (weiter.equalsIgnoreCase("J")) {
					
				}
				else if (weiter.equalsIgnoreCase("N")) {
					System.out.println("Erfolgsquote: " + succesrate + "%");
					break;
				}
				else {
					System.out.println("Wenn du dich nicht entscheiden kannst machen wir einfach weiter");
				}
		}
		
		
		//Verarbeitung
		
		
		//Ausgabe
		
		
		
		
		
	}
}
