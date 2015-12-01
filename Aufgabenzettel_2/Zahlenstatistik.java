import java.util.Scanner;
import java.lang.Math;

public class Zahlenstatistik {
	public static void main (String[] args){
		
		//Initialisierung
		int num1;
		int num2;
		int num3;
		int maybe1;
		int maybe2;
		int sum;
		int median;
		int product;
		int high = 0;
		int second = 0;
		int low = 0;
		int max1;
		int max2;
		int min1;
		int min2;
		
		Scanner scanner = new Scanner(System.in);
		
		//Datenerfassung
		
		System.out.println("Bitte geben Sie 3 Zahlen ein: ");
		
		System.out.print("Erste Zahl: ");
		num1 = scanner.nextInt();
		
		System.out.print("Zweite Zahl: ");
		num2 = scanner.nextInt();
		
		System.out.print("Dritte Zahl: ");
		num3 = scanner.nextInt();
		
		//Berechnungen
		
		sum = num1 + num2 + num3;
		median = sum / 3;
		product = num1 * num2 * num3;
		
		//größte zahl
		
		if (num1 > num2) {
			if (num1 > num3){
				high = num1;
				maybe1 = num2;
				maybe2 = num3;
				if (maybe1 > maybe2){
					second = maybe1;
					low = maybe2;
				}
				else if (maybe1 < maybe2){
					second = maybe2;
					low = maybe1;
				}
				else {
					System.out.println("Die Zahlen " + maybe1 + " und " + maybe2 + " sind beide die kleinsten und daher gleich groß");
					low = maybe1;
					second = maybe1;
				}
			}
			else if (num1 < num3) {
				high = num3;
				low = num2;
				second = num1;
			}
			else {
				System.out.println("Die Zahlen " + num1 + " und " + num3 + " sind beide die größten und daher gleich groß");
				low = num2;
				high = num1;
			}
		}
		else if (num1 < num2 ) {
			if (num2 > num3) {
				high = num2;
				maybe1 = num1;
				maybe2 = num3;
				if (maybe1 > maybe2){
					second = maybe1;
					low = maybe2;
				}
				else if (maybe1 < maybe2){
					second = maybe2;
					low = maybe1;
				}
				else {
					System.out.println("Die Zahlen " + maybe1 + " und " + maybe2 + " sind beide die kleinsten und daher gleich groß");
					low = maybe1;
					second = maybe1;
				}
			}
			else if (num2 < num3) {
				high = num3;
				low = num1;
				second = num2;
			}
			else {
				System.out.println("Die Zahlen " + num2 + " und " + num3 + "sind beide die größten und daher gleich groß");
				low = num1;
				high = num2;
			}
		}
		else if ((num1 == num2) && (num2 == num3)) {
				System.out.println("Die Zahlen sind alle gleich groß");
				high = num1;
				low = num1;
				second = num1;
		}
		else {
			if (num1 > num3){
				low = num3;
				System.out.println("Die Zahlen " + num1 + " und " + num2 + " sind beide die größten und daher gleich groß");
				high = num1;
			}
			else if (num1 < num3){
				high = num3;
				System.out.println("Die Zahlen " + num1 + " und " + num2 +" sind beide die kleinsten und daher gleich groß");
				low = num1;
			}
		}
		
		max1 = Math.max(num1,num2);
		max2 = Math.max(max1,num3);
		
		min1 = Math.min(num1,num2);
		min2 = Math.min(min1,num3);
		
		//Ausgabe
		
		
	System.out.println("Summe = " + sum);
	System.out.println("Median = " + median);
	System.out.println("Produkt = " + product);
	System.out.println("Reihenfolge = " + high + " " + second + " " + low);
	System.out.println("Maximum = " + max2);
	System.out.println("Minimum = " + min2);
	
	
	}
}