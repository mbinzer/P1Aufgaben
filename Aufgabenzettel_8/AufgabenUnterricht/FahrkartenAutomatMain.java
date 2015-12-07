public class FahrkartenAutomatMain {
	public static void main(String[] args) {

		/* MuenzAutomat(String produktName, int produktPreis, String einheit, int anzahlProdukte) */
		MuenzAutomat kaugummiAutomat = new MuenzAutomat("Fahrkarten", 5, "Euro", 3);

		
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
