import java.util.Scanner;
 
public class Muenzwechsler {
    public static void main(String [] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("  Betrag eingeben [euro,cent]: ");
        float price = scanner.nextFloat();
        int rechnen = Math.round(price * 100);
        int euro = rechnen / 100;
        int cent = rechnen % 100;
        //durch 2 und mit rest weiter arbeiten
        int zweier = euro / 2;
        int einer = euro % 2;
        //cents
        int fuenfziger = cent / 50;
        int frest = cent % 50;
        int zwanziger = frest / 20;
        int zwrest = frest % 20;
        int zehner = zwrest / 10;
        int zrest = zwrest % 10;
        int fuenfer = zrest / 5;
        int furest = zrest % 5;
        int zweic = furest / 2;
        int einc = furest % 2;
         
        System.out.println("    2 Euro Muenzen: " + zweier);
        System.out.println("    1 Euro Muenzen: " + einer);
        System.out.println("    50 Cent Muenzen: " + fuenfziger);
        System.out.println("    20 Cent Muenzen: " + zwanziger);
        System.out.println("    10 Cent Muenzen: " + zehner);
        System.out.println("    5 Cent Muenzen: " + fuenfer);
        System.out.println("    2 Cent Muenzen: " + zweic);
        System.out.println("    1 Cent Muenzen: " + einc);
    }
}