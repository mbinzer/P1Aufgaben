import java.util.Scanner;
import java.io.*;

public class Registrieren {
	public static void main(String[] args){
	
		//Initialisierung
		String nick = "";
		String passw = "";
		String passwcor = "";
		String mail = "";
		Scanner scanner = new Scanner(System.in);
		
		
		//Dateneingabe
		
		System.out.println("\n\t Bitte geben Sie ihre Daten ein um sich zu registrieren");
		System.out.print("\n\t Benutzername: ");
		nick = scanner.nextLine();
		System.out.print("\n\t Email: ");
		mail = scanner.nextLine();
		System.out.print("\n\t Kennwort: ");
		passw = scanner.nextLine();
		System.out.print("\n\t Kennwort wiederholen: ");
		passwcor = scanner.nextLine();
		
		//Verarbeitung
		
		//nickname
		
		if (nick.equals("")) {
			System.out.println("\n\t ERROR: Keinen Benutzernamen gewählt!");
		}
		else {
		}
		
		//mail-verifizierung
		
		if (mail.contains("@")) {
			
		}
		else {
			System.out.println("\n\t ERROR: Ungültige Email-Adreese!");
		}
		//Kennwort verifizierung
		
		if(passw.length() < 5){
			System.out.println("\n\t ERROR: Ihr Passwort muss mindestens 5 Zeichen enthalten");
		}
		else{
			if (passw.equals(passwcor)) {
				
			}
			else {
				System.out.println("\n\t ERROR: Ihre Passwörter stimmen nicht überein!");
			}
		}
		
	
	}
}