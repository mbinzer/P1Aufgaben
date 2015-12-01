import java.util.*;

public class cube {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[6];
		int index;
		int a;
		int high = 0;
		int low = 0;
		int sum = 0;

		Random generator = new Random();
		
		
		
		for (index = 0; index < num.length; index++){
			//System.out.print("Wert " + (index + 1) + ": ");
			num[index] = generator.nextInt(5) + 1; 
		}
		
		for (a = 0; a < num.length; a++){
			
			System.out.println(num[a]);
			high = num[0];
			low = num[0];
			sum += num[a];
			
			if (num[a] >= high) {
				high = num[a];
			}
			else if (num[a] <= low) {
				low = num[a];
			}
		}
		
		System.out.println("\n\t Summe: " + sum);
		System.out.println("\n\t Höchste: " + high);
		System.out.println("\n\t Niedrigste: " + low);
	
	}
}