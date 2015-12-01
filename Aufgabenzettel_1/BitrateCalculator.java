import java.util.Scanner;

public class BitrateCalculator {

  public static void main (String[] args){

	//Initialisierung
	int length;
	int bitrate;
	int size;
	Scanner scanner = new Scanner(System.in);
	
	//Datenerfassung
	System.out.println("\t BitrateCalculator");
	
    System.out.println("\t Dauer Sekunden: ");
	length = scanner.nextInt();

    System.out.println("\t Bitrate [Bits/Sekunde]: ");
	bitrate = scanner.nextInt();
	
	//Berechnung
	size = (length * bitrate)/8;
    System.out.println("Größe der Datei = " + size + " Bytes");



  }

}
