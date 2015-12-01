import java.util.*;

public class numRate {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int[] num = new int[20];
		int[] num2 = new int[20];
		int counter = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(19 + 1);
			System.out.println(num[i]);
			num2[num[i]] = num2[num[i]] + 1;
		}
		
		System.out.println("Anzahl der einzelnen Zahlen: ");
		for (int k = 0; k < num.length; k++) {
			System.out.println("Die Zahl " + k + " ist " + num2[k] + " mal vorhanden!");
		}
		System.out.println("Die Häufigkeit welcher Zahl möchten Sie erfahren?");
		int welche = scanner.nextInt();
		
		for (int l = 0; l < num.length; l++) {
			if (welche == num[l]) {
				counter++;
			}
		}
		System.out.println("Diese Zahl ist " + counter + " mal enthalten");
	}
}

	
