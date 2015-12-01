import java.util.Scanner;

public class Login {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		// ##### Setup - start #####
		//Usercredentials - start
		String[][] users = {
			{"admin", "exercising"},
			{"editor", "mastering"},
			{"maulwurf", "huegel"},
			{"test1", "pass1"},
			{"test2", "pass2"}
		};
		
		
		// Messages
		String successMessage = "\n\tLogin erfolgreich";
		String errorMessage = "\n\tLogin fehlgeschlagen :(";
		
		Boolean LoggedIn = false;
		// ##### Setup - end #####

		// ##### Login procedure - start #####
		while (! LoggedIn) {

			// ##### User input - start #####
			// Username
			System.out.print("\n\tBenutzername: ");
			String username = scanner.next();
			
			// Password
			System.out.print("\tPasswort: ");
			String password = scanner.next();
			// ##### User input - end #####
			
			// ##### Input check - start #####
			
			for (int i = 0; i < users.length ; i++) {
				if (username.equals(users[i][0]) && password.equals(users[i][1])) {
						LoggedIn = true;
						break;
				}
			}
			if (LoggedIn != true) {
				System.out.println(errorMessage);
			}
				// ##### Input check - end #####
		}
		// ##### Login procedure - end #####

		// ##### Login protected app - start #####
		if (LoggedIn) {
			System.out.println(successMessage + "\n\n");
			
			int n = 0;
			while (true) {
				System.out.print(".");
				if (n > 100) {
					System.out.print("\n\n");
					break;
				}
				n ++;
			}
		}
		// ##### Login protected app - end #####
	}
}
