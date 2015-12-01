
public class ForSchleifen {
	public static void main(String[] args) {
		
		//Initialisierung
		
		int counter;
		int counter2;
		int counter3;
		int counter4;
		
		int multiply = 1;
		int rechnen = 0;
		//Schleife
		
		for (counter = 0; counter <= 40; counter += 2) {
			System.out.println(counter);
		}
		for (counter2 = 99; counter2 > 0; counter2 -= 3) {
			System.out.println(counter2);
		}
		for (counter3 = 1; counter3 <= 100; counter3++){
			
			rechnen += counter3;
			System.out.println(rechnen);
		}
		for (counter4 = 1; counter4 <= 15; counter4++) {
			multiply *= counter4;
			System.out.println(multiply);
		}
	}
}