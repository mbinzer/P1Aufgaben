import java.util.Scanner;

public class ServiceKontoApp {
  public static void main(String[] args) {
    //Initialisierung
    Scanner scanner = new Scanner(System.in);
    ServiceKonto service = new ServiceKonto("Moritz", 250.0);
    String input;
    double transfer;

    //Start
    System.out.println("Hallo " + service.besitzer + " was möchten Sie heute tun?");
    System.out.print("Wählen Sie abheben(a), einzahlen(e), guthaben anzeigen(g), Kontoauszug (k)");
    input = scanner.next();

    if ( input.equalsIgnoreCase("a") ) {
      System.out.print("Wieviel möchten Sie abheben?: ");
      transfer = scanner.nextDouble();
      service.abheben(transfer);
    }

    System.out.println(konto.getGuthaben());

  }
}
