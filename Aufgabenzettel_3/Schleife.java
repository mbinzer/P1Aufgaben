

public class Schleife {
	public static void main(String[] args) {
		int i = 0;
		boolean bedingung = true;
		
		
		while (bedingung){
			System.out.println(i);
			i++;
			if ( i == 3000) {
				bedingung = false;
			}
		}
	
	}
}