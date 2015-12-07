public class Song {
  String composer;
  String title;
  String song;
  float duration;


  public String getComposer() {
    return composer;
  }
  public String getTitle() {
    return title;
  }
  public float getDuration() {
    return duration;
  }

  public void toString() {
    song = composer + " - " + title + ": " + duration + "m"; 
  }

}
