public class Pi {
	public static void main(String[] args){
		
		float zaehler = 4;
		float nenner = 1;
		float pi = 0;
		float rechnen = 0;
		
		for (int count = 1; count <= 10; count++) {
			
			rechnen += zaehler / nenner;
			
			if (count % 2 == 0) {
				
				rechnen = rechnen *(-1);
				
			}
			nenner += 2;
			
			pi += rechnen;
			
			System.out.println(pi);
		}
		System.out.println(pi);
	}
}