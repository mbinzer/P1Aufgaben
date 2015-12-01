import java.util.Scanner;

public class CalcApp {
  public static void main(String[] args) {

  //initialisierung
  Scanner scanner = new Scanner(System.in);
  Calc calc = new Calc();
  boolean off = false;
  String operation;
  float num;
  float sum;

  calc.reset();

  while(! off){
    System.out.println(calc.getSum());
    System.out.println("wählen sie: + - * /");
    operation = scanner.nextLine();
    if(operation.equals("+")){
      System.out.print("geben Sie ihren Wert ein: ");
      num = scanner.nextFloat();
      scanner.nextLine();
      calc.add(num);
    }
    else if(operation.equals("-")) {
      System.out.print("geben Sie ihren Wert ein: ");
      num = scanner.nextFloat();
      scanner.nextLine();
      calc.getSum();
      calc.sub(num);
    }
    else if(operation.equals("*")) {
      System.out.print("geben Sie ihren Wert ein: ");
      num = scanner.nextFloat();
      scanner.nextLine();
      calc.getSum();
      calc.mult(num);
    }
    else if(operation.equals("/")) {
      System.out.print("geben Sie ihren Wert ein: ");
      num = scanner.nextFloat();
      scanner.nextLine();
      calc.getSum();
      calc.div(num);
    }
    else if(operation.equals("r")){
      calc.reset();
    }
    else if(operation.equals("q")) {
      off = true;
    }
    else{
      System.out.println("Error!!");
    }



  }

  }
}
