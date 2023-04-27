package Shapes;

public abstract class Shape {
  private String color = "white";
  private boolean filled;

  /** Construct a default geometric object */
  protected Shape() {
  }

  /** Construct a geometric object with color and filled value */
  protected Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }


  /** Return a string representation of this object */
  public String toString() {
    return "Color: "  + color +  " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}
