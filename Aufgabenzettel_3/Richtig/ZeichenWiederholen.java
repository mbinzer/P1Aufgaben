import java.util.Scanner;

public class ZeichenWiederholen {
	public static void main(String[] args) {
		
		//Initialisierung
		Scanner scanner = new Scanner(System.in);
		String zeichen;
		int repeat = 0;
		
		//Setup
		System.out.print("Welches Zeichen möchten Sie sehen? : ");
		
		//Datenerfassung
		
		zeichen = scanner.nextLine();
		
		if (zeichen.length() != 1) {
			System.out.print("ERROR");
		}
		
		char auswahl = zeichen.charAt(0);
		
		System.out.print("Wie oft soll dieses Zeichen wiederholt werden?: ");
		
		repeat = scanner.nextInt();
		
		for (int count = 1; count <= repeat; count++) {
			System.out.print(auswahl);
		}
		
	}


}