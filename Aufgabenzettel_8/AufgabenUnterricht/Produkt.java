public class Produkt {

	// Instanzvariablen
	private String name;
	private int preis;

	// Konstruktor
	public Produkt(String name, int preis) {
		this.name = name;
		this.preis = preis;
	}

	// Getter-/Setter-Methoden
	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
