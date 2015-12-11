import java.util.*;

public class BonusKonto extends ServiceKonto {
    private double bonus;

    public void einzahlen(double in){
      bonus = (in/100) * 5;
      Random ran = new Random();
      int zufall = ran.nextInt(6);
      if (zufall == 1) {
        guthaben += bonus;
      }
      guthaben += in;
      gebuehr = (in/100) * 3;
      guthaben -= gebuehr;
    }
    public void abheben(double out){
      guthaben -= out;
      gebuehr = (out/100) * 3;
      guthaben -= gebuehr;
    }
}
