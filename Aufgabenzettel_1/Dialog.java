import java.util.Scanner;

public class Dialog {
	public static void main(String[] args) {
		
		//Datenimport
		System.out.print("Hallo, wie heisst du? ");
		Scanner scanner = new Scanner(System.in);
		
		//Verarbeitung
		String yourName = scanner.nextLine();
		
		//Rückgabe
		System.out.println("Hallo " + yourName + ", wie geht es dir?");
		
		String feel = scanner.nextLine();
		
				System.out.println("Das freut mich");
			if(feel.equals("gut")) {
			}
			else if (feel.equals("schlecht")) {
				System.out.println("Och Mensch...!");
			}
			else {
				System.out.println("Aaa-Ha");
			}	
		
	}
}