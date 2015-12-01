import java.util.Scanner;

public class Monate {
	public static void main(String[] args){
	
	//Dateneingabe / Setup
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("\n \t Gib die Anzahl in Monaten ein:");
	int input = scanner.nextInt();
	
	
	
	
	// Verarbeitung
	String returnString = "";
	returnString += "\n\t Du hast ";
	returnString += input;
	returnString += " Monate angegeben.";
	
	// Ausgabe / Rückgabe
	System.out.println(returnString);
	
	}
}