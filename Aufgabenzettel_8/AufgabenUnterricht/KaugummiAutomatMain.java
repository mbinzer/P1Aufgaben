public class KaugummiAutomatMain {
	public static void main(String[] args) {

		/* MuenzAutomat(String produktName, int produktPreis, String einheit, int anzahlProdukte) */
		MuenzAutomat kaugummiAutomat = new MuenzAutomat("Kaugummi", 20, "Cent", 3);

		
		while (kaugummiAutomat.getAnzahlProdukte() > 0) {

			// Ablauf
			kaugummiAutomat.produktZeigen();
			kaugummiAutomat.geldEingeben();
			kaugummiAutomat.geldWechseln();
			kaugummiAutomat.produktAusgeben();

		}

		System.out.println("\nDer Automat ist leer!\n\n");

	}
}
