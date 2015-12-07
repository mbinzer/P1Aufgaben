public class Song {

  private String composer;
  private String title;
  private double duration;

  public Song (String composer, String title, double duration) {
    this.composer = composer;
    this.title = title;
    this.duration = duration;
  }

  public String getComposer() {
    return composer;
  }
  public String getTitle() {
    return title;
  }
  public double getDuration() {
    return duration;
  }
  public String toString() {
   String song = composer + " - " + title + ": " + duration + " min";
   return song;
   }
}
