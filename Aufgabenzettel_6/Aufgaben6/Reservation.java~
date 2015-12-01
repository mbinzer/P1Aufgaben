public class Reservation {
	
	public String[] place;
	public int anzahlReservierteSitze;
	
	public Reservation(int anzahl) {
		place = new String[anzahl];
	}
	public void initialisieren() { 
		for (int i = 0; i < place.length; i++) {		
		place[i] = "frei";
		}
	}
	public void istFrei(int frei) {
		if (place[frei].equals("frei")) {	
		boolean nochFrei = true;
		}	
	}
	public void reservieren(int sitz, String name) {
		if (place[sitz].equals("frei")) {
			place[sitz] = name;
			anzahlReservierteSitze += 1;
			System.out.println("Ihr Sitz wurde für Sie reserviert!");
		}
		else {
			System.out.println("Der Sitz ist leider schon vergeben!");
		}
			
		
	}
	public void drucken() {
				
		for (int k = 0; k < place.length; k++) {
			System.out.println((k+1) + ".   " + place[k]);
		}
	}		
	public void getAnzahlReservierteSitze() {
		System.out.println(anzahlReservierteSitze);
	}
	public void getAnzahlFreieSitze() {
		if (place.length == anzahlReservierteSitze) {
			System.out.println("AUF GEHTS!!!");
		}
	}
}
