import java.util.Random;
import java.util.Scanner;

public class MathsGame {
  public static void main(String[] args) {
    final int NUMBER_OF_EXERCISES = 5;
    final int MAXIMUM_NUMBER = 9;
    final int OPERATION_COUNT = 3; // Annumber der möglichen mathematischen
                                   // Operationen: +, - und *
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int correctResults = 0;
    int wrongResults = 0;
    long startTime = System.currentTimeMillis();

    for (int turn = 0; turn < NUMBER_OF_EXERCISES; turn++) {
      int firstNumber = random.nextInt(MAXIMUM_NUMBER);
      int secondNumber = random.nextInt(MAXIMUM_NUMBER);
      int operation = random.nextInt(OPERATION_COUNT);
      double result = 0;

      String operator = "";

      if (operation == 0) {
        operator = " + ";
        result = firstNumber + secondNumber;
      } else if (operation == 1) {
        operator = " - ";
        result = firstNumber - secondNumber;
      } else if (operation == 2) {
        operator = " * ";
        result = firstNumber * secondNumber;
      } else {
        System.err.println("Programmfehler: Die Operation " + operation
            + " konnte nicht ausgewertet werden.");
        System.exit(1);
      }

      System.out.print(firstNumber + operator + secondNumber + " = ");
      double userInput = scanner.nextDouble();

      String resultMessage;
      if (userInput == result) {
        resultMessage = "Korrekt!";
        correctResults++;
      } else {
        resultMessage = "Leider falsch.";
        wrongResults++;
      }

      System.out.println(resultMessage + "\n");
    }

    long endTime = System.currentTimeMillis() - startTime;

    System.out.println("Richtige Ergebnisse: " + correctResults + "\n"
        + "Falsche Ergebnisse: " + wrongResults + "\n"
        + "Anteil der richtigen Ergebnisse: "
        + (correctResults / (double) NUMBER_OF_EXERCISES) * 100 + " %"
        + "Sie haben insgesamt " + (endTime / 1000.0)
        + " sec. für die Beanswerung benötigt.");
  }
}
