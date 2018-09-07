/**
 * Circle Class
 *
 * @author Spencer Lawry
 * @version Project 2
 * @version CPE102-01
 */

import java.awt.*;
public class Circle implements Shape
{
   private double radius;
   private Point position;
   private Color color;
   private boolean filled;
 
   public Circle(double radius, Point position, Color color, boolean filled)
   {
      this.radius = radius;
      this.position = position;
      this.color = color;
      this.filled = filled;
   }
   public double getRadius()
   {
      return radius;
   }
   public void setRadius(double radius)
   {
      this.radius = radius;
   }
   public Point getPosition()
   {
      return position;
   }
   public boolean equals(Object other)
   {
      if (other == null) {return false;}
      if (this.getClass() !=other.getClass()) {return false;}
      Circle otherCirc = (Circle) other;
      return radius == otherCirc.radius && position.equals(otherCirc.position) &&
             color.equals(otherCirc.color) && filled == otherCirc.filled;
   } 

   public double getArea() // A = pi*r^2
   {
      return (Math.PI*radius*radius);
   }
   public Color getColor()
   {
      return color;
   }
   public void setColor(Color color)
   {
      this.color = color;
   }
   public boolean getFilled()
   {
      return filled;
   }
   public void setFilled(boolean filled)
   {
      this.filled = filled;
   }
   public void move(Point point)
   {
      position.setLocation(position.x + point.x, position.y + point.y);
   }
}
