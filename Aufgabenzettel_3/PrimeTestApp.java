import java.util.Scanner;

public class PrimeTestApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Bitte Zahl eingeben: ");
    int number = scanner.nextInt();

    boolean isPrime = true;
    for (int index = 2; index < number; index++) {

      if (number % index == 0) {
        isPrime = false;
      }
    }
    
    String resultMessage;
    if (isPrime) {
      resultMessage = number + " ist eine Primnumber";
    } else {
      resultMessage = number + " ist keine Primnumber";
    }

    System.out.println(resultMessage);
  }
}