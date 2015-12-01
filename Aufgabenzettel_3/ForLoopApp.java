public class ForLoopApp {
  public static void main(String[] args) {

    // Bis 99 in Dreierschritten hochzählen:
    for (int count = 3; count < 100; count += 3) {
      System.out.print(count + " ");
    }
    System.out.println();

    // Von 100 herunterzählen in Einerschritten:
    for (int count = 100; count >= 0; count--) {
      System.out.print(count + " ");
    }
    System.out.println();

    // Zahlen von 1 bis 100 summieren:
    int sum = 0;
    for (int count = 1; count <= 100; count++) {
      sum += count;
    }
    System.out.println(sum);
    System.out.println();
  }
}