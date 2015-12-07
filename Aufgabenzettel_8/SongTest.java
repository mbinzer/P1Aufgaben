public class SongTest {
  public static void main(String[] args) {

      //Initialisierung
      Song song = new Song("Jethro Tull", "Aqualung", 6.35);
      String song1;

      song.getComposer();
      song.getTitle();
      song.getDuration();

      song1 = song.toString();
      System.out.print(song1);


  }
}
