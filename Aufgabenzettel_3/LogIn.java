import java.util.Scanner;

public class LogIn {
	public static void main(String[] args) {
		
		//Daten - Setup
		
		Scanner scanner = new Scanner(System.in);
		//Admin credentials
		String adminUsername = "admin";
		String adminPassword = "exercising";
		
		//Editor credentials
		String editorUsername = "editor";
		String editorPassword = "mastering";
		
		//Messages
		
		String successMessage = "\n\t Login erfolgreich";
		String errorMessage = "\n\t Login fehlgeschlagen";
		
		boolean LoggedIn = false;
		
		while(! LoggedIn) {
			//Userinput
			
			System.out.print("\n\t Benutzername: ");
			String username = scanner.next();
			
			System.out.print("\n\t Passwort: ");
			String password = scanner.next();
			
			//Verarbeitung
			
			if(username.equals(adminUsername)) {
				if(password.equals(adminPassword)) {
					LoggedIn = true;
					break;
				}
				else{
					System.out.println(errorMessage);
				}
			}
			else if(username.equals(editorUsername)) {
				if(password.equals(editorPassword)) {
					LoggedIn = true;
					break;
				}
				else {
					System.out.println(errorMessage);
				}
			}
			else{
				System.out.println(errorMessage);
			}
		}
		
		if (LoggedIn){
			System.out.println(successMessage);
		}
	}


}