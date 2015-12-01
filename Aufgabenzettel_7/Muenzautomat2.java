public class Muenzautomat {
	
	
	public String product;
	public float price;
	public int amount;
	public int alreadyPayed;

	public Muenzautomat(String prod, float cos, int amo, int paid) {
		product = prod;
		price = cos;
		amount = amo;
		alreadyPayed = paid;
	}
	public void produktZeigen() {
				System.out.println("Produktname: " + product + "\n" + "Preis: " + price);
	}
	public void run() {
		while(amount > 0) {
			amount -= 1;		
			public void geldEingeben(float bezahl) {
				alreadyPayed = bezahl;		
				while(true) {	
				if (alreadyPayed < price) {
					public void muenzeEinwerfen(float muenz) {
						alreadyPayed += muenz;
					}
				}
				else if (alreadyPayed > price) {
					public void geldWechseln(float change) {
						change = alreadyPayed - price;
						System.out.println(change);
					}
				}
			
			}	 
			
		}
	System.out.println("AUTOMAT LEER");
	}
}
