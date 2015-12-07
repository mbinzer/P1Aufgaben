import java.util.Scanner;

public class SongApp {
  public static void main(String[] args) {

    Song song = new Song("Jethro Tull", "Aqualung", 6.35);
    Scanner scanner = new Scanner(System.in);
    String input;
    String output;
    String alsString;

    // Start App
    System.out.println("/n/t##########SongApp#########");
    System.out.print("Bitte wählen Sie Interpret(i) SongTitle(t) Dauer(d): ");

    input = scanner.next();

    if( input.equalsIgnoreCase("i") ) {
      output = song.getComposer();
    }
    else if ( input.equalsIgnoreCase("t") ) {
      output = song.getTitle();
    }
    else if ( input.equalsIgnoreCase("d") ) {
      outout = song.getDuration();
    }
    else {
      System.out.print("ERROR!");
    }

    alsString = song.toString();

    System.out.println("Ihr Ergebnis: " + output + " !!!");
    System.out.print(alsString);

  }

}
