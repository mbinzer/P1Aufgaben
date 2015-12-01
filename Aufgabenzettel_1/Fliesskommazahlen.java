import java.util.Scanner;

public class Fliesskommazahlen {
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		double number;
		double number2;
		double potenz;
		int pot;
	
		//Datenimport
	
		System.out.print("Geben sie eine Fließkommazahl ein: ");
		
		number = scanner.nextDouble();
		
		System.out.println("Wieviele Nachkommastellen möchten Sie haben? : ");
		
		pot = scanner.nextInt();
		potenz = Math.pow(10, pot);
		number2 = Math.round(number * potenz);
		number2 /= potenz;
		
		
		//Ausgabe
		
		System.out.println(number);
		System.out.println(number2);
	}
}