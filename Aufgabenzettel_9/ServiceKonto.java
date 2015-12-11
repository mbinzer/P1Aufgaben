public class ServiceKonto extends Konto{
  protected double gebuehr;

  public void einzahlen(double in){
    guthaben += in;
    gebuehr = (in/100) * 2;
    guthaben -= gebuehr;
  }
  public void abheben(double out){
    guthaben -= out;
    gebuehr = (out/100) * 2;
    guthaben -= gebuehr;
  }
  public String toString(){
    String status = "Service Konto(Malsehen)  Guthaben: " + guthaben + "angefallene Gebühr: " + gebuehr;
    return status;
  }

}
