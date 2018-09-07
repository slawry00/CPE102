/**
 * Convex Polygon Class
 *
 * @author Spencer Lawry
 * @version Project 2
 * @version CPE102-01
 */

import java.awt.*;
public class ConvexPolygon implements Shape
{
   private Point[] vertices;
   private Color color;
   private boolean filled;
 
   public ConvexPolygon(Point[] vertices, Color color, boolean filled)
   {
      this.vertices = vertices;
      this.color = color;
      this.filled = filled;
   }
   public Point getVertex(int index)
   {
      return vertices[index];
   }
   public void setVertex(int index, Point point)
   {
       vertices[index] = point;
   }
   public boolean equals(Object other)
   {
      if (other == null) {return false;}
      if (this.getClass() != other.getClass()) {return false;}
      ConvexPolygon otherCon = (ConvexPolygon) other;
      if (!(color.equals(otherCon.color))) {return false;}
      if (!(filled == otherCon.filled)) {return false;}
      if (!(vertices.length == otherCon.vertices.length)) {return false;}
      //for loop to compare each point to corresponding other point(same index)
      for (int counter = 0; counter < vertices.length; counter++)
      {
         if (!(vertices[counter].equals(otherCon.vertices[counter])))
         {
            return false;
         }
      }
      return true;
   } 

   public double getArea() 
   {
      double partSum = 0;
      double runningSum = 0;
      double endPortion = 0;
      // Shoelace formula w/ end portion (Xn*Y1 - X1*Yn) added on at the end
      for (int counter = 0; counter < vertices.length - 1; counter++)
      {
         partSum = ((vertices[counter].x)*(vertices[counter+1].y))-
                      ((vertices[counter].y)*(vertices[counter+1].x));
         runningSum = runningSum + partSum;
         
      }
      endPortion = ((vertices[vertices.length-1].x)*(vertices[0].y))-
                   ((vertices[vertices.length-1].y)*(vertices[0].x));

      return (0.5*(runningSum + endPortion));
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
      // for loop to add x,y amount to each point in the convex polygon
      for (int counter = 0; counter < vertices.length; counter++)
      {
         vertices[counter].setLocation(vertices[counter].x + point.x,
                                       vertices[counter].y + point.y);
      }
   }
}
