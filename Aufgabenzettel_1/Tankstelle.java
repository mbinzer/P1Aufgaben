import java.util.Scanner;

public class Tankstelle {
	public static void main(String[] args){
	
		float price;
		float liter;
		float sum1;
		float sum2;
		float cent1;
		float euro1;
		int euro2;
		int cent2;
		Scanner scanner = new Scanner(System.in);
		
		//Daten-Import
		System.out.print("Bitte geben Sie den Preis ein: ");
		price = scanner.nextFloat();
		
		System.out.print("Bitte geben Sie die gewünschte Literzahl ein: ");
		liter = scanner.nextFloat();
		
		//Verarbeitung
		
		sum1 = price * liter;
		
		euro1 = Math.round(sum1);
		cent1 = sum1 % 1;
		
		euro2 = Math.round(euro1);
		cent2 = Math.round(cent1 *100);
		
		//Ausgabe
		
		System.out.println("Ihr Preis: " + euro2 + " Euro " + cent2 + " Cent");
		/*System.out.println(cent1);
		System.out.println(euro1);
		System.out.println(euro2);
		System.out.println(cent2);
		*/
	
	}
}