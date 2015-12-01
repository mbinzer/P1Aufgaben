import java.util.*; 

 
public class StudienBeratung 
{ 
	public static void main(String[] args) 
	{	 
		Scanner scanner = new Scanner(System.in); 
		String input; 


		System.out.print("Hast du Abitur? "); 
		if((input = scanner.next()).equals("ja")) 
		{ 
			System.out.print("Bist du wissensbegierig? "); 
			if((input = scanner.next()).equals("ja")) 
			{ 
				System.out.println("Auf jeden Fall studieren "); 
			} 
			else if(input.equals("nein")) 
			{ 
				System.out.println("Nicht studieren"); 
			} 
		} 
		else if (input.equals("nein")) 
		{ 

			System.out.print("Hast du Fachabitur? "); 
			if((input = scanner.next()).equals("ja")) 
			{ 

				System.out.print("Hast du eine Berufsausbildung? "); 
				if((input = scanner.next()).equals("ja")) 
				{ 

					System.out.print("Willst du sofort geld verdienen? "); 
					if((input = scanner.next()).equals("ja")) 
					{ 
						System.out.println("Dann kannst ja später noch studieren"); 
					} 
					else if(input.equals("nein")) 
					{ 
						System.out.println("Dann studier doch!"); 
					} 
				} 
				else if(input.equals("nein")) 
				{ 
					System.out.println("Besser noch studieren"); 
				} 
			} 
			else if(input.equals("nein")) 
			{ 
				System.out.println("Nicht studieren"); 
			} 
		} 


		 
	} 


} 
