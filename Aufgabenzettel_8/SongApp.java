import java.util.Scanner;

public class SongApp {
  public static void main(String[] args) {

    Song song = new Song();
    Scanner scanner = new Scanner(System.in);
    String input;
    boolean interpret = true;
    boolean title = true;
    boolean dauer = true;
    String song1;
    float inputFloat;

    // Start App
    System.out.println("/n/t##########SongApp#########");

    while(interpret && title && dauer) {
      System.out.print("Bitte wählen Sie Interpret(i) SongTitle(t) Dauer(d): ");

      input = scanner.next();

      if( input.equalsIgnoreCase("i") ) {
        input = scanner.nextLine();
        song.getComposer(input);
        interpret = false;
      }
      else if ( input.equalsIgnoreCase("t") ) {
        input = scanner.nextLine();
        song.getTitle(input);
        title = false;
      }
      else if ( input.equalsIgnoreCase("d") ) {
        inputFloat = scanner.nextFloat();
        song.getDuration(inputFloat);
        dauer = false;
      }
      else {
        System.out.print("ERROR!");
      }

    }

    song1 = song.toString();
    //alsString = song.toString();

    System.out.println(song1);
    //System.out.print(alsString);

  }

}
