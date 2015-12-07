import java.util.Scanner;


public class Jukebox {
  private int nextSongIndex;
  private Song[] songs = new Song[20];
  Scanner scanner = new Scanner(System.in);

  public void addSong() {
    String composer;
    String title;
    double duration;

    System.out.println("Neuer Song: ");
    System.out.print("Interpret: ");
    composer = scanner.next();
    System.out.print("Titel: ");
    title = scanner.next();
    System.out.print("Länge: ");
    duration = scanner.nextDouble();

    songs[nextSongIndex] = new Song(composer, title, duration);
    nextSongIndex++;
  }

  public double getTotalDuration() {
    for (int i = 0; i < songs.length; i++)  {
      double dauer;
      dauer += songs[i].getDuration();
    }
    return dauer;
  }
  public void playAll() {
    for (int i = 0; i < songs.length; i++){
      System.out.println( songs[i].toString() );

    }

  }

  public void run(){
    while(true) {
      System.out.println("Wählen Sie: neuer Song (a) Quit (q)");
      String wahl = scanner.next();
      if ( wahl.equalsIgnoreCase("a") ) {
        addSong();
      }
      else if ( wahl.equalsIgnoreCase("d") ) {
        double gesamtdauer = getTotalDuration();
        System.out.println(gesamtdauer);
      }
      else if ( wahl.equalsIgnoreCase("q") ) {
        break;
      }
      else {
        System.out.println("ERROR!");
      }

    }

    playAll();


  }

}
