import java.util.Scanner;

public class Jukebox {
	
	Scanner input = new Scanner(System.in);

	public void addSong(){
	}
	public void playAll(){
	}
	public void getTotalDuration() {
	}
	public void run() {
		System.out.println("####### Jukebox gestartet #######";
		String title;
		String comp;
		float duration;
		while(true) {
			System.out.println("Bitte geben Sie den Titel des Songs ein!");
			title = input.next();
			System.out.println("Bitte geben Sie den Interpreten des Songs ein!");
			comp = input.next();
			System.out.println("Bitte geben Sie die Dauer des Songs ein!");
			duration = input.nextFloat();
		}
	}






}

