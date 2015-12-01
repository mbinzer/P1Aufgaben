import java.util.Scanner;

public class Konto {
	public static void main(String[] arg) {
		Account account = new Account(50,"Moritz");
		Scanner input = new Scanner(System.in);


		int command;
		float money;
		boolean push = false;
		boolean pull = false;
					
		while(true) {
			System.out.println("Kontostand anzeigen........... [0]" + "\n" + "Geld einzahlen................ [1]" + "\n" + "Geld abheben.................. [2]" + "\n" +  "Kontoauszug drucken........... [3]");
			command = input.nextInt();
			if (command == 0) {
				System.out.println(account.getbalance());
			}
			else if (command == 1) {
				System.out.print("Wieviel möchten Sie einzahlen?: ");
				money = input.nextFloat();
				account.deposit(money);
			}
			else if (command == 2) {
				System.out.print("Wieviel möchten Sie abheben?: ");
				money = input.nextFloat();
				if (money < account.getbalance()) {
					System.out.println("Dafür haben Sie nicht genügend Geld!");
				}
				else {
					account.drawOut(money);
				}
			}
			else if (command == 3) {
				account.print();
				break;
			}
			else {
				System.out.println("ERROR! FALSCHE EINGABE!");
			}
		}

	}
}
