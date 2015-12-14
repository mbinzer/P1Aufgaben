public class Rectangle extends Shape {

  private int height;
  private int width;

  public Rectangle(int x, int y, int width, int height){
    super(x, y);
    this.height = height;
    this.width = width;
  }
  public double getArea(double height, double width) {
    double area = height * width;
    return area;
  }

  public String toString() {
    String stringTEST = "WAT?";
    return stringTEST;

  }

}
