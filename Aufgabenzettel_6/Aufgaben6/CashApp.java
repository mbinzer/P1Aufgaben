import java.util.Scanner;


public class CashApp {
	public static void main(String[] arg) {
	
		Cash cash = new Cash();
		Scanner scanner = new Scanner(System.in);
	
		float goOn;
		boolean finish = false;
	
		while(! finish) {
			System.out.print("Preis oder neuer Kunde [0] oder fertig [-1]: ");
			goOn = scanner.nextFloat();
		
			if (goOn == 0) {
				cash.reset();
			}
			else if (goOn == -1) {
				System.out.println(cash.getSum());	
				finish = true;			
				break;
			}
			else {
				cash.add(goOn);
			}
			System.out.println(cash.getSum());
		}
		
		while(finish){
			System.out.println("Auf Wiedersehn!");
			break;
		}
	}
}
			
