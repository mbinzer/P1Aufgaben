import java.util.*;

public class Index {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
//Array definieren (Länge 10)
		int [][] zahlen = new int[10][2];


//Random zahlen 0-19 füllen 
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i][0] = (random.nextInt(19));
					
		}
		for (int k = 0; k < zahlen.length; k++) {
				zahlen[k][1] = k;
			}	
//Array ausgeben
		//for (int m = 0; m < zahlen.length; m++) {
			System.out.println("\t" + zahlen[m][m]);				
	//	}
		//System.out.println(zahlen);
/* 
		System.out.println(zahlen[i]);

// gesuchte Zahl abfragen
		System.out.println("Welche Zahl möchten Sie suchen?");
		int gesucht = scanner.nextInt();
//Index der gesuchten zahl finden
		
//Index ausgeben
*/
	}
}

//Irgendwo haperts gewaltig
