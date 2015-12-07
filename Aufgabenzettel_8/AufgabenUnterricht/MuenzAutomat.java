import java.util.Arrays;
import java.util.Scanner;

public class MuenzAutomat {
	private Produkt produkt;
	// Zus�tzliche Instanzvariable 'einheit'
	private String einheit;
	private int anzahlProdukte;
	private int eingeworfenerBetrag;
	private String error[] = {
		"Das war eine F�lschung.",
		"Nehme ich nicht.",
		"N�h!",
		"Interessante M�nze - nicht akzeptiert.",
		"Beschei� doch jemand anders!"
	};
	private Scanner scanner = new Scanner(System.in);

	public MuenzAutomat(String produktName, int produktPreis, int anzahlProdukte) {
		produkt = new Produkt(produktName, produktPreis);
		this.anzahlProdukte = anzahlProdukte;
	}

	// Der zus�tzliche Parameter 'einheit' wird entgegengenommen
	public MuenzAutomat(String produktName, int produktPreis, String einheit, int anzahlProdukte) {
		produkt = new Produkt(produktName, produktPreis);
		// Der Wert wird in der neuen Instanzvariablen 'einheit' gespeichert
		this.einheit = einheit;
		this.anzahlProdukte = anzahlProdukte;
	}

	protected void produktZeigen() {
		System.out.println("\n\n\n*******************************");
		// Die Klasse wird f�r verschiedene Produkte variabel gestaltet
		System.out.println("       " + produkt.getName() + "Automat");
		System.out.println("*******************************");

		// Die W�hrungseinheit wird erg�nzt
		System.out.println("\nEin " + produkt.getName() + " kostet " + produkt.getPreis() + " " + einheit + ".");
		eingeworfenerBetrag = 0;
	}

	protected int getAnzahlProdukte() {
		return anzahlProdukte;
	}

	protected void geldEingeben() {
		while (eingeworfenerBetrag < produkt.getPreis()) {
			int fehlenderBetrag = produkt.getPreis() - eingeworfenerBetrag;
			System.out.println("\nBitte einwerfen: " + fehlenderBetrag + " " + einheit);
			int muenzen[] = {1,2,5,10,20,50};
			int muenze = 0;
			while (Arrays.binarySearch(muenzen, muenze) <= 0) {
				if (muenze != 0) {
					int xy = (int) Math.round(Math.random() * (error.length - 1));
					System.out.println(error[xy]);
				}
				System.out.print("M�nzeinwurf: ");
				muenze = scanner.nextInt();
			}
			muenzeEingeworfen(muenze);
		}
	}

	private void muenzeEingeworfen(int muenzwert) {
		eingeworfenerBetrag += muenzwert;
	}

	protected void geldWechseln() {
		int rueckgabe = eingeworfenerBetrag - produkt.getPreis();
		System.out.println("R�ckgabe: " + rueckgabe + " " + einheit);
	}

	protected void produktAusgeben() {
		System.out.println("\n\t---------------------");
		System.out.println("\t Gekauft: " + produkt.getName());
		System.out.println("\t---------------------\n\n");

		anzahlProdukte --;
	}
}
