import java.util.Scanner;

public class Airline {
	public static void main(String[] arg) {
		Reservation reserv = new Reservation(5);
		Scanner input = new Scanner(System.in);	
		reserv.initialisieren();

		String choose;
		String name;

		int sitz;

		while(true) {
			System.out.println("Bitte wählen Sie: (Reservieren [R], Drucken [D], Quit [Q]): ");
			
			choose = input.nextLine();
			if (choose.equalsIgnoreCase("R")) {
				System.out.print("Wie heißen Sie?: ");
				name = input.nextLine();
				System.out.print(name + " wo möchten Sie sitzen?: ");
				sitz = input.nextInt() - 1;
				reserv.reservieren(sitz, name);
				reserv.getAnzahlFreieSitze();
			}
			else if (choose.equalsIgnoreCase("D")) {
				reserv.drucken();
			}
			else if (choose.equalsIgnoreCase("Q")) {
				break;
			}
		}
		
		

	}
}



