/**
 * Rectangle Class
 *
 * @author Spencer Lawry
 * @version Project 2
 * @version CPE102-01
 */

import java.awt.*;
public class Rectangle implements Shape
{
   private double width;
   private double height;
   private Point position;
   private Color color;
   private boolean filled;
 
   public Rectangle(double width, double height, Point position, Color color,
                    boolean filled)
   {
      this.width = width;
      this.height = height;
      this.position = position;
      this.color = color;
      this.filled = filled;
   }
   public double getWidth()
   {
      return width;
   }
   public double getHeight()
   {
      return height;
   }
   public void setWidth(double width)
   {
      this.width = width; 
   }
   public void setHeight(double height)
   {
      this.height = height; 
   }
   public Point getPosition()
   {
      return position;
   }
   public boolean equals(Object other)
   {
      if (other == null) {return false;}
      if (this.getClass() !=other.getClass()) {return false;}
      Rectangle otherRect = (Rectangle) other;
      return width == otherRect.width && height == otherRect.height && 
             position.equals(otherRect.position) && color.equals(otherRect.color)
             && filled == otherRect.filled;
   } 

   public double getArea() // A = b*h
   {
      return (height*width);
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
