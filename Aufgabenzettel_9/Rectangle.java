public class Rectangle extends Shape {

  private int height;
  private int width;

  public Rectangle(int x, int y, int width, int height){
    Shape shape = new Shape();
    shape.getX(x);
    shape.getY(y);
    height = this(height);
    width = this(width);
  }
  public double getArea(double height, double width) {
    double area = height * width;
    return area;
  }

  public String toString() {
    
  }

}
