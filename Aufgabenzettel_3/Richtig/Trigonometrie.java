
public class Trigonometrie {
       public static void main(String[] args) {

               for(int winkel=0;winkel<=180;winkel+=15) {

                        double sinus = Math.sin(Math.toRadians(winkel));
                        double cosinus = Math.cos(Math.toRadians(winkel));
                        double tangens = Math.tan(Math.toRadians(winkel));

                        System.out.println("\n\t" + winkel + "°: " + sinus + " " + cosinus + " " + tangens);


                }


        }


}
