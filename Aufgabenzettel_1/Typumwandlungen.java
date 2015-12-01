public class Typumwandlungen {

  public static void main (String[] args){
	//Aufgabenteil A
    int anzahl = 5;
    float einzelpreis = 5.34f;
    float gesamtpreis = anzahl * einzelpreis;
    double mehrwertsteuer = einzelpreis * .19;
    double brutto = gesamtpreis + mehrwertsteuer;

    System.out.println("Anzahl: " + anzahl);
    System.out.println("Einzelpreis: " + einzelpreis);
    System.out.println("Gesamtpreis: " + gesamtpreis);
    System.out.println("Brutto: " + brutto);
    System.out.println("Mehrwertsteuer: " + mehrwertsteuer);
	
	// Aufgabenteil B
	
	System.out.println("Regeln :	https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html#jls-5.1.2");
	
    // Aufgabenteil C

    long a = 4294967296L;
    char b = 'n';
    double c = (3.1415926 * 0.2f) * a;

  }
}
