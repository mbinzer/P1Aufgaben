public class Muenzautomat {
	
	
	public String product;
	public double price;
	public int amount;
	public double alreadyPayed;

	public Muenzautomat(String prod, float cos, int amo, int paid) {
		product = prod;
		price = cos;
		amount = amo;
		alreadyPayed = paid;
	}
	public void muenzeEinwerfen(float muenz) {
		System.out.print("Bitte werfen sie eine Münze ein!");		
		alreadyPayed += muenz;
	}
	public void geldWechseln(float change) {
		change = alreadyPayed - price;
		System.out.println(change);
	}
	public void produktZeigen() {
				System.out.println("Produktname: " + product + "\n" + "Preis: " + price);
	}
	public void geldEingeben(float bezahl) {
		alreadyPayed = bezahl;			
	}
	public void run() {
		while(amount > 0) {
			amount -= 1;	
			if (amount == 0) {
				break;
			}	
				 
			
		}
	System.out.println("AUTOMAT LEER");
	}
}

