import java.util.Scanner;

public class KontoApp {
  public static void main(String[] args){
    //Initialisierung
    Scanner scanner = new Scanner(System.in);
    Konto konto = new BonusKonto();
    String auszug;
    String input;
    double guthaben;
    double transfer;
    boolean run = true;

    //Start
    System.out.println("Hallo" + konto.besitzer + " was möchten Sie heute tun?");

    while(run) {
      System.out.print("Wählen Sie abheben(a), einzahlen(e), guthaben anzeigen(g), Kontoauszug (k)");
      input = scanner.next();

      if ( input.equalsIgnoreCase("a") ) {
        System.out.print("Wieviel möchten Sie abheben?: ");
        transfer = scanner.nextDouble();
        konto.abheben(transfer);
      }
      else if ( input.equalsIgnoreCase("e") ) {
        System.out.print("Wieviel möchten Sie einzahlen?: ");
        transfer = scanner.nextDouble();
        konto.einzahlen(transfer);
      }
      else if ( input.equalsIgnoreCase("g") ) {
        guthaben = konto.getGuthaben();
        System.out.println(guthaben);
      }
      else if ( input.equalsIgnoreCase("k") ) {
        auszug = konto.toString();
        System.out.println(auszug);
      }

      else if ( input.equalsIgnoreCase("q") ) {
        break;
      }
      else {
        System.out.println("FEHLER!!!");
      }
      System.out.println(konto.getGuthaben());
    }



  }
}
