import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {

    System.out.println("Willkommen beim Zahlenraten-Spiel!\n\n"
        + "Bis zu welcher Zahlenhöhe (10, 100, 500, 1000, ...)"
        + " möchten Sie raten? Geben Sie bitte eine Zahl ein. ");

    Scanner scanner = new Scanner(System.in);
    int upperLimit = scanner.nextInt();
    int secretNumber = 0;

    while (secretNumber <= 0) {
      secretNumber = new Random().nextInt(upperLimit) + 1;
    }

    int turns = 1;
    boolean found = false;
    while (!found) {
      System.out.print("Bitte eine Zahl zwischen 1 und " + upperLimit
          + " raten: ");
      int userGuess = scanner.nextInt();

      String resultMessage = "";
      if (userGuess == secretNumber) {
        resultMessage = "Die Zahl " + userGuess
            + " ist die gesuchte Zahl! Herzlichen Glückwunsch!\n\n"
            + "Sie haben die Zahl nach " + turns + " Versuch(en) erraten.";
        found = true;
      } else if (userGuess < secretNumber) {
        resultMessage = "Die Zahl " + userGuess
            + " ist kleiner als die gesuchte Zahl.";
      } else if (userGuess > secretNumber) {
        resultMessage = "Die Zahl " + userGuess
            + " ist größer als die gesuchte Zahl.";
      }

      System.out.println(resultMessage);
      turns++;
    }
  }
}
