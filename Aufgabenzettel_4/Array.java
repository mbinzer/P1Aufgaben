import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Initialisierung des Arrays
		float temperatures[] = new float[24];
		
		for (int i = 0; i < temperatures.length; i++) {
			System.out.print("Wert " + i + " Uhr: ");
			temperatures[i] = scanner.nextFloat();
		
		}
		
		int x = 0;
		
		while(x < temperatures.length) {
			System.out.println("\t\n " + x + " Uhr: " + temperatures[x] + " °C");
			x++;
			
		}
		
		//FOR_EACH SCHLEIFE
		/* for(float temperatures : temperatures) {
			System.out.println( i + " Uhr: " + temperatures + " Grad");
			i++;
		} */
		
	
	}
}
