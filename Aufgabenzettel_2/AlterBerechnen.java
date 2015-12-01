import java.util.*;

public class AlterBerechnen {
	public static void main(String[] args) {
	
		//Initialisierung

		GregorianCalendar calendar = new GregorianCalendar();
		int thisYear = calendar.get(Calendar.YEAR);
		int thisMonth = calendar.get(Calendar.MONTH);
		int thisDay = calendar.get(Calendar.DAY_OF_MONTH);

		Scanner scanner = new Scanner(System.in);
		int years;
		int months;
		int days;
		int day;
		int month;
		int year;

		//Setup

		System.out.println("\n\t Altersrechner");

		//Datenerfassung

		System.out.print("\n\tBitte gib dein Geburtsdatum ein (DD MM YYYY): ");
		day = scanner.nextInt();
		month = scanner.nextInt();
		year = scanner.nextInt();

		//Verarbeitung
		
		years = thisYear - year;

		if(month > thisMonth){
			years -= 1;
		}
		else if (month == thisMonth){
			if(day > thisDay){
				years -= 1;
			}
			else if (day == thisDay){
				System.out.print("Herzlichen GLückwunsch du bis heute " + years + " geworden!!!!");
			}
		}

		//Ausgabe


		System.out.println("\n\t" + day + "." + month + "." + year);
		System.out.println("\n\t Du bist " + years + " Jahre alt.");

	}
}