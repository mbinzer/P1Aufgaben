import java.util.Scanner;

public class ForGroupFunctionsApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Anweisung für die for-Schleife
    System.out.println("Wieviele Zahlen sollen eingelesen werden?: ");
    int numbersCount = scanner.nextInt();

    // Initialisierung der Werte
    float sum = 0;
    float minimum = Float.MAX_VALUE;
    float maximum = Float.MIN_VALUE;

    // Einlesen der Zahlen
    for (int index = 0; index < numbersCount; index++) {
      System.out.print("Bitte geben Sie die " + index + ". Zahl ein: ");
      float nextNumber = scanner.nextFloat();

      // Summe berechnen
      sum += nextNumber;
      // Kleinste und größte Zahl berechnen
      if (nextNumber < minimum) {
        minimum = nextNumber;
      }
      if (nextNumber > maximum) {
        maximum = nextNumber;
      }
    }
    float average = sum / 2;
    System.out.println("Die kleinste Zahl lautet: " + minimum
        + "\nDie größte Zahl lautet: " + maximum + "\nDer mittelwert lautet: "
        + average);
  }
}