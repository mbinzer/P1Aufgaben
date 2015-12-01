import java.util.Scanner;

public class Kaffeeautomat
{
	public static void main(String[] args)
	{
		Scanner eingabe = new Scanner(System.in);
		
		// Variablen
		float e = 0.8f;
		float k = 0.5f;
		float m = 0.2f;
		float z = 0.3f;
		
		String kaffee = "k";
		String espresso = "e";
		String milch = "j";
		String keineMilch = "n";
		String zucker = "j";
		String keinZucker = "n";
		
		String sorte;
		String milchZusatz;
		String zuckerZusatz;
		
		//Espresso (80 Cent), Kaffee (50 Cent); zusätzlich kann der Kunde wählen: Milch (20 Cent), Zucker (30 Cent)
		
		//Einlesen in die Konsole
		System.out.print("Bitte waehlen : Espresso (e), Kaffee (k): ");
		sorte = eingabe.nextLine();
		
		System.out.print("Milch (J/N): ");
		milchZusatz = eingabe.nextLine();
		
		System.out.print("Zucker (J/N): ");
		zuckerZusatz = eingabe.nextLine();
		
		//Scanner schließen
		eingabe.close();
		
		//Auswerten der Eingaben des Kunden
		
		//Wenn "k" eingegeben wurde
		if(sorte.equalsIgnoreCase(kaffee))
		{
			//System.out.println("Sie haben Kaffee gewaehlt.");
			
			// Wenn milch mit "j" eingegeben wurde
			if(milchZusatz.equalsIgnoreCase(milch))
			{
					//System.out.println("Sie haben Kaffee mit Milch gewaehlt.");
					
					if(zuckerZusatz.equalsIgnoreCase(zucker))
					{
						System.out.println("Sie haben Kaffee mit Milch und Zucker gewaehlt.");
						System.out.print("Zu zahlen sind: ");
						System.out.format("%4.2f Euro", k + m + z);
					}
					
					else if(zuckerZusatz.equalsIgnoreCase(keinZucker))
					{
						System.out.println("Sie haben Kaffee mit Milch, aber ohne Zucker gewaehlt.");
						System.out.print("Zu zahlen sind: ");
						System.out.format("%4.2f Euro", k + m);
					}
					
					else
					{
						System.out.println("Bitte geben Sie ihren Zuckerzusatz ein!");
					}
			}
			
			// Wenn Milch mit "n" eingegeben wurde
			else if(milchZusatz.equalsIgnoreCase(keineMilch))
			{
				//System.out.println("Sie haben Kaffee ohne Milch gewaehlt.");
				
				if(zuckerZusatz.equalsIgnoreCase(zucker))
				{
					System.out.println("Sie haben Kaffee ohne Milch, aber mit Zucker gewaehlt.");
					System.out.print("Zu zahlen sind: ");
					System.out.format("%4.2f Euro", k + z);
				}
				
				else if(zuckerZusatz.equalsIgnoreCase(keinZucker))
				{
					System.out.println("Sie haben Kaffee ohne Milch und Zucker gewaehlt.");
					System.out.print("Zu zahlen sind: ");
					System.out.format("%4.2f Euro", k);
				}
				
				else
				{
					System.out.println("Bitte geben Sie ihren Zuckerzusatz ein!");
				}
			}
			
			else
			{
				System.out.println("Bitte geben Sie ihren Milchzusatz ein!");
			}
		}
		
		// Wenn "e" eingegeben wurde
		else if(sorte.equalsIgnoreCase(espresso))
		{
			//System.out.println("Sie haben Espresso gewaehlt.");
			
			if(milchZusatz.equalsIgnoreCase(milch))
			{
					//System.out.println("Sie haben Espresso mit Milch gewaehlt.");
					
					if(zuckerZusatz.equalsIgnoreCase(zucker))
					{
						System.out.println("Sie haben Espresso mit Milch und Zucker gewaehlt.");
						System.out.print("Zu zahlen sind: ");
						System.out.format("%4.2f Euro", e + m + z);
					}
					
					else if(zuckerZusatz.equalsIgnoreCase(keinZucker))
					{
						System.out.println("Sie haben Espresso mit Milch, aber ohne Zucker gewaehlt.");
						System.out.print("Zu zahlen sind: ");
						System.out.format("%4.2f Euro", e + m);
					}
					
					else
					{
						System.out.println("Bitte geben Sie ihren Zuckerzusatz ein!");
					}
			}
			
			else if(milchZusatz.equalsIgnoreCase(keineMilch))
			{
				//System.out.println("Sie haben Espresso ohne Milch gewaehlt.");
				
				if(zuckerZusatz.equalsIgnoreCase(zucker))
				{
					System.out.println("Sie haben Espresso ohne Milch, aber mit Zucker gewaehlt.");
					System.out.print("Zu zahlen sind: ");
					System.out.format("%4.2f Euro", e + z);
				}
				
				else if(zuckerZusatz.equalsIgnoreCase(keinZucker))
				{
					System.out.println("Sie haben Espresso ohne Milch und Zucker gewaehlt.");
					System.out.print("Zu zahlen sind: ");
					System.out.format("%4.2f Euro", e);
				}
				
				else
				{
					System.out.println("Bitte geben Sie ihren Zuckerzusatz ein!");
				}
			}
			
			else
			{
				System.out.println("Bitte geben Sie ihren Milchzusatz ein!");
			}
		}
		
		else
		{
			System.out.println("Bitte geben Sie ihr gewuenschtes Getraenk ein!");
		}
	}
}