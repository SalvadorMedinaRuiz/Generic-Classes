package Shapes;

public class Circle extends Shape implements Paint, Comparable<Circle>{
  private double radius;
  private String shapeColor;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
    this.shapeColor = "green";
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override /** Return area */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle radius is " + radius);
  }
  
  @Override
  public void color(String paintColor) {
	  shapeColor = paintColor;
	  
  }
  
 @Override
  public int compareTo(Circle obj) {
	 if (this.radius > obj.radius)
	  return 1;
	 else if (this.radius < obj.radius)
		 return -1;
	 else return 0;
	  
  }
  
}
