public class Konto {
  protected String besitzer;
  protected double guthaben;

  public double getGuthaben() {
    return guthaben;
  }
  public void einzahlen(double in) {
    guthaben += in;
  }
  public void abheben(double out) {
    guthaben -= out;
  }
  public String toString(){
    String status = besitzer + ": Guthaben: " + guthaben;
    return status;
  }

}
