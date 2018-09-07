/**
 * Triangle Class
 *
 * @author Spencer Lawry
 * @version Project 2
 * @version CPE102-01
 */

import java.awt.*;
public class Triangle implements Shape
{
   private Point a;
   private Point b;
   private Point c;
   private Color color;
   private boolean filled;
 
   public Triangle(Point a, Point b, Point c, Color color,
                   boolean filled)
   {
      this.a = a;
      this.b = b;
      this.c = c;
      this.color = color;
      this.filled = filled;
   }
   public Point getVertexA()
   {
      return a;
   }
   public Point getVertexB()
   {
      return b;
   }
   public Point getVertexC()
   {
      return c;
   }
   public void setVertexA(Point point)
   {
       a = point;
   }
   public void setVertexB(Point point)
   {
       b = point;
   }
   public void setVertexC(Point point)
   {
       c = point;
   }
   public boolean equals(Object other)
   {
      if (other == null) {return false;}
      if (this.getClass() !=other.getClass()) {return false;}
      Triangle otherTri = (Triangle) other;
      return a.equals(otherTri.a) && b.equals(otherTri.b) && 
             c.equals(otherTri.c) && color.equals(otherTri.color) &&
             filled == otherTri.filled;
   } 

   public double getArea() //using shoelace formula for general area of tri
   {
      return Math.abs((0.5*(a.x*(b.y-c.y) + b.x*(c.y-a.y) + c.x*(a.y-b.y))));
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
      a.setLocation(a.x + point.x, a.y + point.y);
      b.setLocation(b.x + point.x, b.y + point.y);
      c.setLocation(c.x + point.x, c.y + point.y);
   }
}
