public class Shape {

  protected int x;
  protected int y;

  public Shape(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public double getArea(double par1, double par2) {
    double area = par1 * par2;
    return area;
  }
  public String toString() {
    String stringTEST = "Fläche: " + getArea(2, 2);
    return stringTEST;
  }

}
