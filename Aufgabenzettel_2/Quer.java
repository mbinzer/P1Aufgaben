import java.util.Scanner;

public class Quer {
	public static void main(String[] args) {
		
		//Initialisierung
		
		int num;
		int quer = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		//Setup
		
		System.out.println("\t\n Quersummenrechner");
		
		//Datenerfassung
		
		System.out.print("\t\n Bitte geben Sie eine Zahl ein: ");
		num = scanner.nextInt();
		
		//Verarbeitung
		
		if((num > 32768) || (num < 0)) {
			System.out.println("\t\n Ungültige Eingabe: Die Zahl muss positiv und kleiner als 32768 sein!");
		}
		else if (num > 0) {
			
			num2 = num % 10;
			num2 /= 10;
			quer += num2;
			
			if (num2 > 0) {
				
				num2 %= 10;
				num2 /= 10;
				quer += num2;
				
				if (num2 > 0) {
					
					num2 %= 10;
					num2 /= 10;
					quer += num2;
					
					if (num2 > 0) {
						
						num2 %= 10;
						num2 /= 10;
						quer += num2;
						
						if (num2 > 0) {
						
							num2 %= 10;
							num2 /= 10;
							quer += num2;
						}
					}
				}
				
				
				
			}
		}
		
		
			System.out.println(num2);
		
	}
}