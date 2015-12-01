import java.util.Scanner;

public class Muenzautomat {


	private String productName;
	private float price;
	private int amountLeft;
	private float alreadyPayed;
	private Scanner scanner = new Scanner(System.in);

	public Muenzautomat(String prod, float pri, int amo, float paid) {
		productName = prod;
		price = pri;
		amountLeft = amo;
		alreadyPayed = paid;
	}

	public void run() {
		while(amountLeft > 0) {
			produktZeigen();
			geldEingeben();
			geldWechseln();
			produktAusgeben();
		}
	System.out.println("AUTOMAT LEER");
	}

	public float muenzeEinwerfen(float muenz) {
		float paid = muenz;
		alreadyPayed += paid;
		return alreadyPayed;
	}

	public void geldWechseln() {
		float change = alreadyPayed - price;
		System.out.println("Sie bekommen " + change + "zurück");
	}
	public void produktZeigen() {
				System.out.println("Produktname: " + productName + "\n" + "Preis: " + price);
	}
	public void geldEingeben() {
		while(alreadyPayed < price) {
		System.out.print("Bitte geben Sie noch " + (price - alreadyPayed) + " ein: ");
		System.out.println("Wieviel gibst du mir?: ");
		float pay = scanner.nextFloat();
		muenzeEinwerfen(pay);
		}
	}

	public void produktAusgeben() {
		System.out.println("Bitte entnehmen Sie " + productName + " aus dem Automat!");
		alreadyPayed = 0;
		amountLeft -= 1;
	}
}
