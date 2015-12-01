import java.util.Scanner;

public class Primzahlen {
  public static void main(String[] args) {
	
	
	//Initialisierung
	Scanner scanner = new Scanner(System.in);
	int number;
	boolean isPrime = true;
	int i;
	String messageReturn;

	
	
	//Setup-Datenerfassung
    System.out.print("Bitte Zahl eingeben: ");
    number = scanner.nextInt();

    
    for ( i = 2; i < number; i++) {

      if (number % i == 0) {
        isPrime = false;
      }
    }
    

    if (isPrime) {
		messageReturn = number + " ist eine Primzahl";
    } else {
		messageReturn = number + " ist keine Primzahl";
    }

    System.out.println(messageReturn);
  }
}